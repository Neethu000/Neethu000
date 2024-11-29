package WithoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyMedicinesTest extends AndroidBaseTest{
	
	@Test
	public void addNewMedicine() {
		
		//MyMedicines icon clicking
		driver.findElement(AppiumBy.accessibilityId("My Medicines")).click();
		
		//Add new medicine button clicking
		driver.findElement(AppiumBy.accessibilityId("Add New Medicine")).click();
		
		//Medicine name filed
		WebElement medicineName=driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		medicineName.click();
		medicineName.sendKeys("dolo");
		
		//Condition field
		WebElement condition=driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		condition.click();
		condition.sendKeys("for fever");
		
		//Usage filed
		WebElement usage=driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		usage.click();
		usage.sendKeys("after meals");
		
		//Start date field
		driver.findElements(By.className("android.view.View")).get(4).click();
		
		//In calendar done button clicking
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//End date field
		driver.findElements(By.className("android.view.View")).get(5).click();
		
		//In calendar done button clicking
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//Clicking on add time slot button
		driver.findElement(AppiumBy.accessibilityId("Add Time Slot")).click();

		//clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();

	}
	
	

}
