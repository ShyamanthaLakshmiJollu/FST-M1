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

public class Activity3_appium {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeTest
	public void beforeClass() throws MalformedURLException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
		// Instantiate Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 30);
		driver.get("https://www.training-support.net/selenium");

	}

	@Test
	public void testTodolist() {
		String[] tasklist= {"Add tasks to list","Get number of tasks","Clear the list"};
		int i;
		String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
		// Wait for the page to load
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));

		driver.findElement(MobileBy
				.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(textContains(\"To-Do List\"))"))
				.click();
		
		for( i=0;i<tasklist.length;i++) {
		// adding task1
		wait.until(ExpectedConditions.presenceOfElementLocated(
				MobileBy.xpath("//android.widget.EditText[contains(@resource-id,'taskInput')]"))).sendKeys(tasklist[i]);

		// hitting add task button

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
		}
		for(int j=0;j<tasklist.length;j++) {
			
					
			driver.findElement(MobileBy
					.xpath("//android.view.View[contains(@resource-id,'tasksList')and(text(),' "+tasklist[j]+ " ')]"))
					.click();
			
		}
		driver.findElement(MobileBy
				.xpath("//android.view.View[contains(@resource-id,'tasksCard')and(text(),'Clear List')]"))
				.click();
		
		Assert.assertTrue(true);
		
		
	}
	
	@AfterTest
	public void terminate() {
		driver.quit();
	}
		
	
	}


