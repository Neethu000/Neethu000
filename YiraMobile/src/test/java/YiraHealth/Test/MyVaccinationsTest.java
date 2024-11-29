package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyVaccinationsTest extends AndroidBaseTest{
	
	@Test
	public void addNewVaccination() {
		
		//clicking on my vaccinations icon
		driver.findElement(AppiumBy.accessibilityId("My Vaccinations")).click();
		
		//clicking on Add new vacciantion button
		driver.findElement(AppiumBy.accessibilityId("Add New Vaccination")).click();
		
		//Entering vaccination name filed
		WebElement name =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		name.click();
		name.sendKeys("covid");
		
		//Entering disease field
		WebElement disease =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		disease.click();
		disease.sendKeys("corona");
		
		//Entering Dose filed 
		WebElement dose =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		dose.click();
		dose.sendKeys("1");
		
		driver.hideKeyboard();
		
		//Select date filed
		//driver.findElements(By.className("android.view.View")).get(3).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Add Vaccination']/android.view.View")).click();
		
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
