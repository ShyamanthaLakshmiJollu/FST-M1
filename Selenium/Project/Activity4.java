package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {

	WebDriver driver;

	@BeforeTest
	public void browserInvoke() {
		driver = new FirefoxDriver();
		Reporter.log("Driver object invoked successfully");
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Navigated to website successfully");
	}

	@Test
	public void loginVerify() {
		WebElement userName = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement loginButton = driver.findElement(By.id("bigbutton"));
		userName.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		Assert.assertEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index", driver.getCurrentUrl());

	}

	@AfterTest
	public void close() {
		driver.quit();
		Reporter.log("Successfully closed driver instance");
	}

}
