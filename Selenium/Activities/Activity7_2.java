package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title is : " + driver.getTitle());
		/*
		 * Get the title of the page using driver.getTitle() and print out the title.
		 * Find the input fields of the Sign Up form. Fill in the details in the fields
		 * with your own data. Wait for success message to appear and print it to the
		 * console. Finally, close the browser.
		 */
		WebElement userName=driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement password=driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        
        userName.sendKeys("Sam");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        email.sendKeys("email@xy.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        System.out.println("Sign up message:" +driver.findElement(By.id("action-confirmation")).getText());
        driver.close();
	}

}
