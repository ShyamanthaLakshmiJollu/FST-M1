package appium_Project_FST28;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1_appium {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Nexus 5X API 28_sam");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");

		// Instantiate " Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 20);

	}

	@Test
	public void addList() {

		String getStarted = "resourceId(\"com.google.android.apps.tasks:id/welcome_get_started\")";
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(getStarted))).click();
		String plussign = "resourceId(\"com.google.android.apps.tasks:id/tasks_fab\" )";
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(plussign))).click();
		String tasktext = "resourceId(\"com.google.android.apps.tasks:id/add_task_title\")";
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(tasktext)))
				.sendKeys("Complete Activity with Google Tasks");
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
		// **************additing second activity
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(plussign))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(tasktext)))
				.sendKeys("Complete Activity with Google Keep");
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
		// *****************adding third activity
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(plussign))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(tasktext)))
				.sendKeys("Complete the second Activity Google Keep");
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();

		List<String> list = new ArrayList<String>();
		list.add("Complete Activity with Google Tasks");
		list.add("Complete Activity with Google Keep");
		list.add("Complete the second Activity Google Keep");
		List<String> tasklist = new ArrayList<String>();
		List<MobileElement> ls = driver.findElementsById("com.google.android.apps.tasks:id/task_name");
		Iterator<MobileElement> it = ls.iterator();
		while (it.hasNext()) {
			String s = it.next().getText();
			tasklist.add(s);

		}
		if (tasklist.containsAll(list)) {
			System.out.println("tasks added successfully");
		} else
			System.out.println("Assertion failed");

	}

	@AfterClass
	public void tearDown() {
		// Close app
		driver.quit();
	}
}
