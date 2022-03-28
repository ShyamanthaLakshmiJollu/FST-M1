package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		/*
		 * Open the browser with https://training-support.net/selenium/selects using the
		 * get() method. Use findElement() to find the multi-select WebElement on the
		 * page. Create a new Select class object with the WebElement. Check if the HTML
		 * element is a multi-list. Proceed with other actions if it is. Select the
		 * 'JavaScript' option by visible text. Select the 'NodeJS' option by value.
		 * Select the 4th, 5th, and the 6th options by index. Deselect the 'NodeJS'
		 * option by value attribute. Deselect the 7th option by index. Print the first
		 * selected option. Print all selected options one by one and deselect all
		 * options.
		 */
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		WebElement multiselect = driver.findElement(By.id("multi-select"));
		WebElement multiValue = driver.findElement(By.id("multi-value"));
		Select s = new Select(multiselect);
		if (s.isMultiple()) {
			s.selectByVisibleText("Javascript");
            System.out.println("Selected option is :" +multiValue.getText());
			s.selectByValue("node");
			System.out.println("Selected option is :" +multiValue.getText());
			s.selectByIndex(4);
			System.out.println("Selected option is :" +multiValue.getText());
			s.selectByIndex(5);
			System.out.println("Selected option is :" +multiValue.getText());
			s.selectByIndex(6);
			System.out.println("Selected option is :" +multiValue.getText());
			s.deselectByValue("node");
			s.deselectByIndex(7);
			
			System.out.println(s.getFirstSelectedOption().getText());
			List<WebElement> allselectedOptions = s.getAllSelectedOptions();
			System.out.println("All selected options:");
			for (WebElement e : allselectedOptions) {
				System.out.println(e.getText());
			}
			s.deselectAll();
		} else
			System.out.println("Dropdown won't support multi select ");

	}

}
