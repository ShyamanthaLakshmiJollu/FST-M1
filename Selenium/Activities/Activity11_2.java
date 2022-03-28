package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title : " + driver.getTitle());
		// confirm alert

		WebElement ConfirmAlert = driver.findElement(By.id("confirm"));
		ConfirmAlert.click();
		Alert a = driver.switchTo().alert();
		System.out.println("Alert text : "  +a.getText());
		a.accept();
		//a.dismiss();
		driver.close();
		

	}

}
