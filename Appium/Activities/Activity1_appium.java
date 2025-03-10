package appiumProjectPackage;


	import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

	public class Activity1_appium {
	    // Declare Android driver
	    AndroidDriver<MobileElement> driver;

	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 API 28");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.android.calculator2");
	        caps.setCapability("appActivity", ".Calculator");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	    }

	    @Test
	    public void multiply() {
	        // Using resource-id
	        driver.findElementById("digit_5").click();
	        // Using Accessibility ID
	        driver.findElementByAccessibilityId("multiply").click();
	        // Using XPath
	        driver.findElementByXPath("//android.widget.Button[@text='9']").click();

	        // Perform Calculation
	        driver.findElementById("eq").click();

	        // Display Result
	        String result = driver.findElement(MobileBy.id("result")).getText();
	        System.out.println(result);

	        // Assertion
	        Assert.assertEquals(result, "45");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close app
	        driver.quit();
	    }
	}

