package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title : " + driver.getTitle());
		// simple alert

		WebElement simpleAlert = driver.findElement(By.id("simple"));
		simpleAlert.click();
		Alert a = driver.switchTo().alert();
		System.out.println("Text in alert :" + a.getText());
		a.accept();
		driver.close();

	}

}
