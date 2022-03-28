package crmProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void browserInvoke() throws InterruptedException {
		driver = new FirefoxDriver();
		Reporter.log("Driver object invoked successfully");
		driver.get("http://alchemy.hguy.co/crm");
		Reporter.log("Navigated to website successfully");

	}

	@Test(priority = 0)
	public void loginVerify() {
		WebElement userName = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement loginButton = driver.findElement(By.id("bigbutton"));
		userName.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		Assert.assertEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index", driver.getCurrentUrl());

	}

	@Test(dependsOnMethods = { "loginVerify" })
	public void accountsData() {
		WebElement navBar = driver.findElement(By.className("container-fluid"));
		WebElement sales = navBar.findElement(By.id("grouptab_0"));
		Actions action = new Actions(driver);
		WebElement accounts = navBar.findElement(By.id("moduleTab_9_Accounts"));
		action.moveToElement(sales).moveToElement(accounts).click().build().perform();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("listViewBody")));
		WebElement content = driver.findElement((By.className("listViewBody")));
		List<WebElement> temp = content.findElements(By.xpath("//*[contains(@type,'name')]//b"));
		Iterator<WebElement> it = temp.iterator();
		int count = 0;
		while (it.hasNext()) {
			if (count < 5) {
				System.out.println(it.next().getText());
				it.next();
				count++;
			} else
				break;

		}

	}

	@AfterTest
	public void close() {
		driver.quit();
		Reporter.log("Successfully closed driver instance");
	}

}
