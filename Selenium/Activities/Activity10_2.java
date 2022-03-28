package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		/*
		 * Perform the following actions, Press the key of your first name in caps Press
		 * CTRL+a and the CTRL+c to copy all the text on the page. (Paste the text in a
		 * text editor to verify results.) Finally, close the browser.
		 */
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		WebElement keyPressText;
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title is:" + driver.getTitle());
		keyPressText = driver.findElement(By.id("keyPressed"));
		action.keyDown(Keys.SHIFT)
		       .sendKeys("n")
		       .keyUp(Keys.SHIFT). build().perform();
		System.out.println("Key Presses : " + keyPressText.getText());

		Actions action2 = new Actions(driver);
		action2.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Key Pressed Text :" + keyPressText.getText());

	}

}
