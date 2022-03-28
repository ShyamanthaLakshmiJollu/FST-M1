package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title : " + driver.getTitle());
		// Prompt alert

		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Yes, you are!");
		System.out.println("Alert text : " + a.getText());
		a.accept();

		driver.close();

	}

}
