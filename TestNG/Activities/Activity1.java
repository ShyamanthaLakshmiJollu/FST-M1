package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Activity1 {
	WebDriver driver;
	
	@BeforeTest
	public void driverInstance()
	{
		 driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");	
	}
	@Test
    public void exampleTestCase() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("Training Support", title);
                    
        //Find the clickable link on the page and click it
        driver.findElement(By.id("about-link")).click();
                    
        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
 
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
