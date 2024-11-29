package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class AllergiesTest extends AndroidBaseTest {
	
	@Test
	public void addNewAllergy() {
		
		//clicking on Allergies icon
		driver.findElement(AppiumBy.accessibilityId("Allergies")).click();
		
		//clicking on Add new allergy button
		driver.findElement(AppiumBy.accessibilityId("Add New Allergy")).click();
		
		//Allergy Name field
		WebElement name =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		name.click();
		name.sendKeys("Food");
		
		//Allergy symptoms
		WebElement symptoms =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		symptoms.click();
		symptoms.sendKeys("vomit");
		
		//Allergy cause
		WebElement cause =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		cause.click();
		cause.sendKeys("virus");
		
		//Description
		WebElement decription =driver.findElement(By.xpath("(//android.widget.EditText)[4]"));
		decription.click();
		decription.sendKeys("Travelling");
		
		//Clicking on choose file field
		driver.findElement(AppiumBy.accessibilityId("Choose File")).click();
				
		//In choose file clicking on Camera option
		driver.findElement(AppiumBy.accessibilityId("Camera")).click();
		//Camera permisions while using app button clicking
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		//clicking on photo 
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		//clicking on photo confirmation button
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//cliking on submin button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();

		
		
	}
	
}
