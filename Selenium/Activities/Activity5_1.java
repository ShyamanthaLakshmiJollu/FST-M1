package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title is : " + driver.getTitle());

		/*
		 * Use findElement() to find the checkbox input element. Use the isDisplayed()
		 * method to check if it is visible on the page. Click the "Remove Checkbox".
		 * Print the result of the isDisplayed() method again.
		 */

		WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox visibility : " + cbox.isDisplayed());
		driver.findElement(By.id("toggleCheckbox")).click();
		System.out.println("Verifying checkbox visibility after performing remove action:" + cbox.isDisplayed());
		driver.close();
	}

}
