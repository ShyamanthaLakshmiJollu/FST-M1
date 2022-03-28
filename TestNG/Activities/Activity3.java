package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void driverInvoke() {
		driver =new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/login-form");
		}
	@Test
	public void loginValidation()
	{  
		WebElement userName=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		userName.sendKeys("admin");
		password.sendKeys("password");
		loginButton.click();
		WebElement confirmationMessage = driver.findElement(By.id("action-confirmation"));
		Assert.assertEquals("Welcome Back, admin", confirmationMessage.getText());
		
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}

}
