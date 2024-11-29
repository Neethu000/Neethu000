package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyDoctors extends AndroidBaseTest {

	@Test
	public void addNewDoctor() {
		
		//clicking on My Doctor icon
		driver.findElement(AppiumBy.accessibilityId("My Doctors")).click();
		
		//clicking on Add new button
		driver.findElement(AppiumBy.accessibilityId("Add New")).click();
		
		//Entering doctor name field
		WebElement doctorName =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		doctorName.click();
		doctorName.sendKeys("Priya");
		
		//Entering doctor email address 
		WebElement email =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		email.click();
		email.sendKeys("Priya123@gmail.com");
		
		//clicking on select specialization dropdown
		driver.findElement(AppiumBy.accessibilityId("Select Specialization")).click();
		
		//selecting one specialization in dropdown
		driver.findElement(AppiumBy.accessibilityId("Orthodontist")).click();
		
		//scrolling gesture
//		driver.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollIntoView(text(\"Orthodontist\"));")).click();
//		
//		driver.findElement(AppiumBy.androidUIAutomator(
//			    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Orthodontist\"));"
//			)).click();
		
		//Entering Doctor/clinic phone number
		WebElement number =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		number.click();
		number.sendKeys("9010486413");
		
		//Entering Hospital name
		WebElement hospitalName =driver.findElement(By.xpath("(//android.widget.EditText)[4]"));
		hospitalName.click();
		hospitalName.sendKeys("KIMS");
		
		//Clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		
		
		
	}
	
}
