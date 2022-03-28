package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("Title of the page : " + driver.getTitle());
		
		//Find the third header on the page
		WebElement thirdHeader=driver.findElement(By.xpath("//*[@id='third-header']"));
		System.out.println("Third header text is :" +thirdHeader.getText());
				
		//Find the fifth header on the page and get it's 'color' CSS Property.
		WebElement fifthHeader=driver.findElement(By.xpath("//h5"));
		System.out.println("Fifth header color is : " +fifthHeader.getCssValue("color"));
		
		//Find the violet button on the page and print all the class attribute values.
		WebElement voiletButton=driver.findElement(By.xpath("//button[contains(text(), 'Violet')]"));
		System.out.println("Class Attributes of voilet button:" + voiletButton.getAttribute("class"));
		
		//Find the grey button on the page with Absolute XPath.		
		WebElement greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("grey button found using absolute xpath and its text is: "+greyButton.getText());

	}

}
