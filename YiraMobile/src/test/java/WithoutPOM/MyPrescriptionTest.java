package WithoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyPrescriptionTest extends AndroidBaseTest{

	@Test
	public void prescriptionRecord() {
		
		//My Prescription icon clicking		
		driver.findElement(AppiumBy.accessibilityId("My Prescriptions")).click();
		
		//Add new prescription button clicking
	    driver.findElement(AppiumBy.accessibilityId("Add New Prescription")).click();
		
	    //Types of Illness field
		WebElement illness = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		illness.click();
		illness.sendKeys("Stomach pain");
		
		//Doctor Name field
		WebElement docName =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		docName.click();
		docName.sendKeys("Priyanka");
		
		//Add Self notes field
		WebElement notes =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		notes.click();
		notes.sendKeys("everyday so much pain");
		
		//Date of prescription field 
		WebElement date =driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add Prescription \"]/android.view.View"));
		date.click();
		
		//In date selection clicking on done button
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//Clicking on choose file field
		driver.findElement(AppiumBy.accessibilityId("Choose File")).click();
		
		//In Choose file clicking on photo option
//		driver.findElement(AppiumBy.accessibilityId("Photo")).click();
//		//photo permisions allow button clicking
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//		driver.findElement(AppiumBy.accessibilityId("Photo")).click();
				
		//In choose file clicking on file option
//		driver.findElement(AppiumBy.accessibilityId("File")).click();
//	    //file permisions allow button clicking
//	    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//	    driver.findElement(AppiumBy.accessibilityId("File")).click();
						
		//In choose file clicking on Camera option
		driver.findElement(AppiumBy.accessibilityId("Camera")).click();
		
		//Camera permissions while using app button clicking
	    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
	    
	    //clicking on photo 
	  	driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
	  		
	    //clicking on photo confirmation button
	  	driver.findElement(AppiumBy.accessibilityId("Done")).click();
	  	
	    //Clicking on submit button
	  	driver.findElement(AppiumBy.accessibilityId("Submit")).click();
	  		
	    
	    
	}
}
