package YiraHealth.Test;

import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class DietPlanTest extends AndroidBaseTest {
	
	@Test
	public void addFood() {
		
		//clicking on diet plan icon
		driver.findElement(AppiumBy.accessibilityId("Diet Plan")).click();
		
		
	}

}
