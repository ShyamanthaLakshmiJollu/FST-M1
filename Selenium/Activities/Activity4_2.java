/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of the page : " + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mokshit");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bandi");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("moksh@mail.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("9090909090");
		driver.findElement(By.xpath("//*[@value='submit']")).submit();
		System.out.println("Form submitted successfully");
		driver.close();

	}

}
