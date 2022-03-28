package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		/*
		 * Open a browser with https://www.training-support.net/selenium/input-events
		 * Get the title of the page using driver.getTitle() and print out the title. On
		 * the page, perform Left click and print the value of the side in the front.
		 * Double click to show a random side and print the number. Right click and
		 * print the value shown on the front of the cube. Finally, close the browser.
		 */
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title is:" + driver.getTitle());

		// perform Left click and print the value of the side in the front.
		WebElement cube = driver.findElement(By.id("D3Cube"));
		action.click(cube);
		WebElement activeSide = driver.findElement(By.xpath("//div[contains(@class,'active')]"));
		System.out.println("Number after left click:" + activeSide.getText());
		action.doubleClick(cube).perform();
		WebElement activeSide1 = driver.findElement(By.xpath("//div[contains(@class,'active')]"));
		System.out.println("Number after double click:" + activeSide1.getText());
		action.contextClick(cube).perform();
		WebElement activeSide2 = driver.findElement(By.xpath("//div[contains(@class,'active')]"));
		System.out.println("Number after right click:" + activeSide2.getText());
		driver.close();

	}

}
