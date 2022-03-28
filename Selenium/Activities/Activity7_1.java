package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title is : " + driver.getTitle());
		/*
		 * Get the title of the page using driver.getTitle() and print out the title.
		 * Find the username and password input fields. Type in the credentials:
		 * username: admin password: password Wait for login message to appear and print
		 * the login message to the console. Finally, close the browser.
		 */
		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
		userName.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login Message:" + message);
		driver.close();
	}

}
