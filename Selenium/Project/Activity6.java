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

public class Activity6 {

	WebDriver driver;

	@BeforeTest
	public void browserInvoke() throws InterruptedException {
		driver = new FirefoxDriver();
		Reporter.log("Driver object invoked successfully");
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Navigated to website successfully");
		
	}
	
	@Test(priority=0)
	public void loginVerify() {
		WebElement userName = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement loginButton = driver.findElement(By.id("bigbutton"));
		userName.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		Assert.assertEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index", driver.getCurrentUrl());

	}

	@Test(dependsOnMethods= {"loginVerify"})
	public void menuChecking() {
		WebElement navBar = driver.findElement(By.className("container-fluid"));
		WebElement activitiesTab = navBar.findElement(By.xpath("//a[@id='grouptab_3']"));
		Assert.assertTrue(activitiesTab.isDisplayed());
		Assert.assertTrue(activitiesTab.isEnabled());

	}

	@AfterTest
	public void close() {
		driver.quit();
		Reporter.log("Successfully closed driver instance");
	}

}
