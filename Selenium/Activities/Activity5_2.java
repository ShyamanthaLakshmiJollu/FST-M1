package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title is : " + driver.getTitle());

		/*
		 * Use findElement() to find the checkbox input element. Use the isSelected()
		 * method to check if the checkbox is selected. Click the checkbox to select it.
		 * Use the isSelected() method again and print the result
		 */

		WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox status: Is selected or not before selecting:" + cbox.isSelected());
		cbox.click();
		System.out.println("Checkbox status: Is selected or not After selecting:" + cbox.isSelected());
		driver.close();

	}

}
