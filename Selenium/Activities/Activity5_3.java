package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title is : " + driver.getTitle());
		/*
		 * Use findElement() to find the text field. Use the isEnabled() method to check
		 * if the text field is enabled. Click the "Enable Input" button to enable the
		 * input field. Use the isEnabled() method again and print the result.
		 */

		WebElement textField = driver.findElement(By.xpath("//input[@id='input-text']"));
		System.out.println("Text field is enabled or not : status before enabling:" + textField.isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		System.out.println("Text field is enabled or not : status after enabling:" + textField.isEnabled());
		driver.close();

	}
}
