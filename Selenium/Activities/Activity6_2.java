package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("Title is : " + driver.getTitle());
		/*
		 * Find and click the "Change content" button on the page. Wait for the text to
		 * say "HELLO!". Print the message that appears on the page. Wait for the text
		 * to change to contain "I'm late!". Print the new message on the page. Finally,
		 * close the browser
		 */
		WebElement changeContent = driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
		changeContent.click();
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("ajax-content")), "HELLO!"));
		System.out.println((driver.findElement(By.id("ajax-content"))).getText());
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("ajax-content")), "I'm late!"));
		System.out.println((driver.findElement(By.id("ajax-content"))).getText());
		driver.close();

	}

}
