package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		System.out.println("Title is :" + driver.getTitle());
		/*
		 * Use findElement() to find the dropdown WebElement on the page. Create a new
		 * Select class object with the WebElement. On the dropdown, Select the second
		 * option using selectByVisibleText() Select the third option using
		 * selectByIndex() Select the fourth option using selectByValue() Finally, get
		 * all the options in the dropdown and print them one by one.
		 */
		WebElement chosen = driver.findElement(By.id("single-value"));
		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		s.selectByIndex(3);
		System.out.println(chosen.getText());
		s.selectByValue("4");
		System.out.println(chosen.getText());
		List<WebElement> list = s.getOptions();
		for (WebElement w : list) {
			System.out.println(w.getText());
		}
		driver.close();

	}

}
