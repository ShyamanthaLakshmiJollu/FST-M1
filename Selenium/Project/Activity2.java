package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void browserInvoke() {
		driver = new FirefoxDriver();
		Reporter.log("Driver object invoked successfully");
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Navigated to website successfully");
	}
	
	@Test
	public void headerURL()
	{
		WebElement headerImage=driver.findElement(By.xpath("//div[@class='companylogo']//img"));
		System.out.println(headerImage.getAttribute("src"));
		Reporter.log("Printed URL successfully");
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		Reporter.log("Successfully closed driver instance");
	}

}
