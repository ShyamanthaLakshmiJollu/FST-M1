package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net");
		System.out.println("Title of the page:" + driver.getTitle());
		WebElement usingID = driver.findElement(By.id("about-link"));
		System.out.println("text in element using ID:" + usingID.getText());
		WebElement usingClassname = driver.findElement(By.className("green"));
		System.out.println("text in element using classname:" + usingClassname.getText());
		WebElement usingLinkText = driver.findElement(By.linkText("About Us"));
		System.out.println("text in element using LinkText:" + usingLinkText.getText());
		WebElement usingCSS = driver.findElement(By.cssSelector("a#about-link"));
		System.out.println("text in element using css:" + usingCSS.getText());
		driver.close();

	}

}
