package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyExpenses extends AndroidBaseTest{

	@Test
	public void addNewExpense() {
		
		//clicking on My expenses icon 
		driver.findElement(AppiumBy.accessibilityId("My Expenses")).click();
		
		//clicking on add new expenses button
		driver.findElement(AppiumBy.accessibilityId("Add New Expenses")).click();
		
		//Entering Name of expenses 
		WebElement name=driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		name.click();
		name.sendKeys("OP");
		
		//clicking on expense type dropdown
		driver.findElement(AppiumBy.accessibilityId("Select Expense Type")).click();
		
		//select one type in expense type dropdown
		driver.findElement(AppiumBy.accessibilityId("Tests/Health Checkups")).click();
		
		//Entering expense amount field 
		WebElement amount =driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		amount.click();
		amount.sendKeys("1000");
		
		//Selecting date fileld
		//driver.findElement(By.xpath("(//android.view.View)[1]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Expense Type ']/android.view.View[1]")).click();
		
		//In calendar Done button clicking
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//Upload button clicking
		driver.findElement(AppiumBy.accessibilityId("Upload")).click();
		
		//clicking on Camera option
		driver.findElement(AppiumBy.accessibilityId("Camera")).click();
		//Camera permisions while using app button clicking
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		//clicking on photo 
		//driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
		
		//clicking on photo confirmation button
	    //driver.findElement(AppiumBy.accessibilityId("Done")).click();
		driver.findElement(By.id("com.android.camera2:id/done_button")).click();
		
		//clicking on save button 
		driver.findElement(AppiumBy.accessibilityId("Save")).click();
		
	}
}
