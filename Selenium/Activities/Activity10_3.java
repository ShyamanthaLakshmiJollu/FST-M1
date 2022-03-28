package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://training-support.net/selenium/drag-drop");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Title is :" +driver.getTitle());
		//Find the ball and simulate a click and drag to move it into "Dropzone 1".
		
		WebElement ball=driver.findElement(By.id("draggable"));
		WebElement droplocation1 = driver.findElement(By.id("droppable"));
		WebElement droplocation2 = driver.findElement(By.id("dropzone2"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(ball, droplocation1);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(droplocation1, "background-color"));
	    System.out.println("ENTERED DROPZONE 1");
	    
	    actions.dragAndDrop(ball, droplocation2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(droplocation2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        driver.close();
	}

}
