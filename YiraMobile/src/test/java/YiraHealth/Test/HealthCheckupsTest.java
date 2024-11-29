package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;


public class HealthCheckupsTest extends AndroidBaseTest {

	@Test
	public void addNewTestRecord() throws InterruptedException{
	
	    
        //Health Checkups clicking
		driver.findElement(AppiumBy.accessibilityId("Health Checkups")).click();
		Thread.sleep(3000);
		
		//Clicking on Test Records using click Gesture
        
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "x", 793,
			    "y", 418
			));
		
		
		//clicking on Add New Test Records Button
		driver.findElement(AppiumBy.accessibilityId("Add New Test Record")).click();
		
		//clicking on Name of the test dropdown
		driver.findElement(AppiumBy.accessibilityId("Name Of Test *")).click();
		//In dropdown selecting one test option
		driver.findElement(AppiumBy.accessibilityId("LIPID PROFILE")).click();
	
		//clicking on Sample test dropdown
		driver.findElement(AppiumBy.accessibilityId("Sample Type *")).click();
		//In dropdown selecting one sample test option
		driver.findElement(AppiumBy.accessibilityId("BLOOD")).click();
		
		//clicking on Test parameter dropdown
		driver.findElement(AppiumBy.accessibilityId("Test Parameter *")).click();
		//In dropdown selecting one test parameter option
		driver.findElement(AppiumBy.accessibilityId("HDL Cholesterol")).click();
		
		//Enter lab name field
		WebElement labName =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		labName.click();
		labName.sendKeys("Previa Lab");
		
		//Select date field
		driver.findElements(By.className("android.view.View")).get(4).click();
		//Clicking done button
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//Enter pincode field
		WebElement pincode =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		pincode.click();
		pincode.sendKeys("535558");
		
		//Enter address field
		WebElement address =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		address.click();
		address.sendKeys("Bobbili");
		
		//Scrolling page bottom
		scrollingGesture();

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
	
		//clicking on radio button
		driver.findElement(AppiumBy.className("android.widget.Switch")).click();
		
		//clicking on check box 
	    driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	    
	    //Scrolling page bottom
	    scrollingGesture();
	    
		//clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		
		
		
	}
	
}
