package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title is : " + driver.getTitle());
		/*
		 * Find the checkbox toggle button and click it. Wait till the checkbox
		 * disappears. Click the button again. Wait till it appears and check the
		 * checkbox. Finally, close the browser.
		 */
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement cboxButton = driver.findElement(By.id("toggleCheckbox"));
		cboxButton.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		cboxButton.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
		driver.close();

	}

}
