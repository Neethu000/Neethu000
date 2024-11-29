package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class PoliciesTest extends AndroidBaseTest {
	
	@Test
	public void addNewPolicy() {
		
		//Clicking on Policies icon 
		driver.findElement(AppiumBy.accessibilityId("Policies")).click();
		
		//Add new policy button clicking
		driver.findElement(AppiumBy.accessibilityId("Add New Policy")).click();
		
		//Name of the policy holder field
		WebElement policyHolderName =driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		policyHolderName.click();
		policyHolderName.sendKeys("Priyanka");
		
		//policy name  field
		WebElement policyName =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		policyName.click();
		policyName.sendKeys("Jeevan Bheema");
		
		//Policy issued by field
		WebElement policyIssuedBy =driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		policyIssuedBy.click();
		policyIssuedBy.sendKeys("TATA");
		
		//Policy number
		WebElement policyNumber =driver.findElement(By.xpath("(//android.widget.EditText)[4]"));
		policyNumber.click();
		policyNumber.sendKeys("AP123AP");
		
		//Keyboard Close
		driver.hideKeyboard();
		
		//Start date field
		driver.findElements(By.className("android.view.View")).get(4).click();
				
		//In calendar done button clicking
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
				
		//End date field
		driver.findElements(By.className("android.view.View")).get(5).click();
				
		//In calendar done button clicking
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
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
				
		//Clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
			
		
		
		
		
	}

}
