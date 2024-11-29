package YiraHealth.Test;

import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class FitnessAlertsTest extends AndroidBaseTest {

	@Test
	public void yiraNotifications() throws InterruptedException {
		
		//Clicking on Fitness Activity Icon 
		driver.findElement(AppiumBy.accessibilityId("Fitness Activity")).click();
		Thread.sleep(2000);
		
		//clicking on back button
		driver.findElement(AppiumBy.accessibilityId("Back")).click();
		
		//Clicking on Alert Icon
		driver.findElement(AppiumBy.accessibilityId("Alerts")).click();
		
		
	}
	
}
