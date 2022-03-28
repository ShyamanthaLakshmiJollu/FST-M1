package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

	WebDriver driver;

	@BeforeClass(alwaysRun=true)
	public void driverInvoke() {
		driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
	}

	@Test(groups= {"Header", "Button"})
	public void PageTitleVerify() {
		String pagetitle = driver.getTitle();
		Assert.assertEquals("Target Practice", pagetitle);
	}
	
	@Test(groups= {"Header"})
	public void headerTestone()
	{
		WebElement thirdheader = driver.findElement(By.id("third-header"));
		Assert.assertEquals("Third header", thirdheader.getText());
	}
	@Test(groups= {"Header"})
	public void headerTesttwo() {
		WebElement fifthheader = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]"));
		Assert.assertEquals("rgb(33, 186, 69)", fifthheader.getCssValue("color"));
	}

	@Test(groups= {"Button"})
	public void buttonTestOne() {
		WebElement olivebutton=driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
		Assert.assertEquals("Olive", olivebutton.getText());
	}
	@Test(groups= {"Button"})
	public void buttonTestTwo()
	{
		WebElement thirdrow=driver.findElement(By.xpath("//button[contains(text(),'Brown')]"));
		 Assert.assertEquals(thirdrow.getCssValue("color"), "rgb(255, 255, 255)");
	}
	
	@AfterClass(alwaysRun=true)
	public void close() {
		driver.quit();
	}

}
