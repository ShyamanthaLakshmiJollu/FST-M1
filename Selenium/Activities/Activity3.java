package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("Title of the page:" + driver.getTitle());
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement contact = driver.findElement(By.id("number"));
		WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
		firstName.sendKeys("Sam");
		lastName.sendKeys("Jollu");
		email.sendKeys("sam@gmail.com");
		contact.sendKeys("999999999");
		Thread.sleep(3000);	
		submit.submit();
		System.out.println("Form submitted successfully");
		driver.close();

	}

}
