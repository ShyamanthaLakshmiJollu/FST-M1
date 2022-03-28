package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		/*
		 * Open the browser with https://training-support.net/selenium/tables using
		 * get() method. Use findElements() in combination with xpath() to find the
		 * number of columns and rows (not counting the table header) and print them.
		 * Find and print the cell value at the second row and second column. Click the
		 * header of the first column to sort by name. Find and print the cell value at
		 * the second row and second column again. Print the cell values of the table
		 * footer. Close the browser.
		 */
		driver.get("https://training-support.net/selenium/tables");
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr"));
		System.out.println("Number of columns are: " + cols.size());
		System.out.println("Number of rows are: " + rows.size());
		WebElement cellValue2row_2col = driver
				.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[2]/td[2]"));
		System.out
				.println("Cell value of second row and second column before sorting : " + cellValue2row_2col.getText());
		// sorting by name
		 driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();

		System.out
				.println("Cell value of second row and second column after sorting : " + cellValue2row_2col.getText());
		WebElement footer=driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tfoot/tr"));
		System.out.println("Footer data:" +footer.getText());
		driver.close();
		
		

	}

}
