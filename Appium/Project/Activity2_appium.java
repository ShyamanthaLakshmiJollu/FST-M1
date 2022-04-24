package appium_Project_FST28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2_appium {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeTest
	public void beforeClass() throws MalformedURLException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");

		// Instantiate " Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 30);

	}

	@Test
	public void googleKeepApp() {

		String s = "Notes Title";
		String addnote = "resourceId(\"com.google.android.keep:id/new_note_button\")";
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(addnote))).click();
		// Title of notes
		MobileElement title = driver.findElementById("com.google.android.keep:id/editable_title");
		wait.until(ExpectedConditions.visibilityOf(title));
		title.sendKeys(s);
		driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Notes Description");
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		MobileElement notesTitle = driver.findElementByXPath(
				"//*[contains(@resource-id,'com.google.android.keep:id/browse_note_interior_content')]");
		notesTitle.click();
		String t = driver
				.findElementByXPath("//*[contains(@resource-id,'com.google.android.keep:id/index_note_title')]")
				.getText();

		Assert.assertEquals(t, s);

	}

	
	@AfterTest
	public void tearDown() {
		// Close app
		driver.quit();
	}

}
