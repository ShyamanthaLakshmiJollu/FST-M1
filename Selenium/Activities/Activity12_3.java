package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("Page Title is : " + driver.getTitle());
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		action.moveToElement(button).perform();
		String tooltip = button.getAttribute("data-tooltip");
		System.out.println("Tool Tip:" + tooltip);
		button.click();
		// sign in form opened
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(message);
		driver.close();

	}

}
