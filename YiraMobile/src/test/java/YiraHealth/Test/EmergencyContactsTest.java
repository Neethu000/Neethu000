package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class EmergencyContactsTest extends AndroidBaseTest{
	
	@Test
	public void addNewContact() {
		
		//Clicking on emergency contacts icon 
		driver.findElement(AppiumBy.accessibilityId("Emergency Contacts")).click();
		
		//clicking on add new contact button
		driver.findElement(AppiumBy.accessibilityId("Add New Contact")).click();
		
		//Entering contact name filed
		WebElement name =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		name.click();
		name.sendKeys("priya");
		
		//clicking on relationship dropdown
		driver.findElement(AppiumBy.accessibilityId("Choose Relationship *")).click();
		//In dropdown selecting one option 
		driver.findElement(AppiumBy.accessibilityId("Daughter")).click();
		
		//Entering email field
		WebElement email =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		email.click();
		email.sendKeys("priya123@gmail.com");
		
		driver.hideKeyboard();
		
		//Entering phone number field
		WebElement number =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		number.click();
		number.sendKeys("9010486413");
		
		//clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		
		
		
	}

}
