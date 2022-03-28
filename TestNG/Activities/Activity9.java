package testngPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {

	WebDriver driver;
	Alert alert;

	@BeforeTest
	public void driverInvoke() {
		driver = new FirefoxDriver();
		
		Reporter.log("Driver Invoke successfully");
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
		Reporter.log("URL opened sucessfully");
		Reporter.log("Title of the web page opened is : " + driver.getTitle());
	}

	@BeforeMethod
	public void deafult() {
		Reporter.log("Default test started");
		driver.switchTo().defaultContent();
	}

	@Test(priority = 0)
	public void simpleAlertTestCase() {
		Reporter.log("simpleAlert Test case started");
		WebElement simpleAlert = driver.findElement(By.id("simple"));
		simpleAlert.click();
		Alert salert = driver.switchTo().alert();
		Reporter.log("Focused shifted to alert");
		Reporter.log("Alert Message:" +salert.getText());
		Assert.assertEquals("This is a JavaScript Alert!", salert.getText());
		Reporter.log("Alert text verified successfully");
		salert.accept();
		Reporter.log("Alert accepted successfully");

	}

	@Test(priority = 1)
	public void confirmAlertTestCase() {
		Reporter.log("confirmAlertTestCase started");
		WebElement confirmAlert = driver.findElement(By.id("confirm"));
		confirmAlert.click();
		Alert calert = driver.switchTo().alert();
		Reporter.log("Focus shifted to alert");
		Reporter.log("Alert Message: " + calert.getText());
		Assert.assertEquals("This is a JavaScript Confirmation!", calert.getText());
		Reporter.log("Alert text verified successfully");
		calert.dismiss();
		Reporter.log("Alert dismissed successfully");
	}

	@Test(priority = 2)
	public void promptAlertTestCase() {
		Reporter.log("prompt alert test case started");
		WebElement promptalert= driver.findElement(By.id("prompt"));
		promptalert.click();
		Reporter.log("Focus shifted to alert");
		Alert palert = driver.switchTo().alert();
		Reporter.log("Alert Message: " +palert.getText());
		palert.sendKeys("Hello");
		Reporter.log("text entered in alert successfully");
		palert.accept();
		Reporter.log("Alert accepted successfully");
		
		}

	@AfterTest
	public void close() {
		
		driver.quit();
		Reporter.log("Driver instance closed successfully");
	}

}
