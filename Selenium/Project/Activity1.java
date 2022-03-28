package crmProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeTest
	public void browserInvoke() {
		driver = new FirefoxDriver();
		Reporter.log("Driver object invoked successfully");
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Navigated to website successfully");
	}

	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		Reporter.log("fetched web site title");
		Assert.assertEquals("SuiteCRM", title);
		Reporter.log("Fetched title matches with SuiteCRM");

	}

	@AfterTest
	public void close() {
		driver.quit();
		Reporter.log("Successfully closed driver instance");
	}

}
