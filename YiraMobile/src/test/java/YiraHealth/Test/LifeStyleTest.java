package YiraHealth.Test;
import io.appium.java_client.AppiumBy;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Appium.TestUtils.AndroidBaseTest;


public class LifeStyleTest extends AndroidBaseTest{
	
	@Test
	public void lifeStyle() throws InterruptedException {
		
		//clicking on life style icon
		driver.findElement(AppiumBy.accessibilityId("Life Style")).click();
		
		//Sleep Habits Edit button clicking
		//driver.findElement(AppiumBy.accessibilityId("Sleep Habits Edit")).click();
		
		
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			      "x", 538,
				  "y", 2016
			));
		Thread.sleep(2000);
		
		//sleep habits dropdown cliking
		//driver.findElement(AppiumBy.accessibilityId("Sleeping Hours 7-8 hrs")).click();
		
		//select one in dropdown
		//driver.findElement(AppiumBy.accessibilityId("7-8 hrs")).click();
		//clicking on update button
		//driver.findElement(AppiumBy.accessibilityId("Sleep Habits Update")).click();
		
//		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//			      "x", 764,
//				  "y", 339
//			));
		
		//Clicking on Sports option using click Gesture
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		      "x", 546,
			  "y", 405
		));
		Thread.sleep(2000);
		
		//Clicking on Exercise Habits option using click Gesture
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			   "x", 542,
		       "y", 403
		));
		Thread.sleep(2000);
		
		//Clicking on Beverages option using click Gesture
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			   "x", 526,
			   "y", 406
		));
		Thread.sleep(2000);
		
		//Clicking on Snacks option using click Gesture
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
				"x", 546,
			    "y", 410
		));
		Thread.sleep(2000);
		
		//Clicking on Tobacco option using click Gesture
	    driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "x", 618,
				"y", 406
		));
	    Thread.sleep(2000);
		
	   //Clicking on Alcohol option using click Gesture
	  	driver.executeScript("mobile: clickGesture", ImmutableMap.of(
	  		     "x", 913,
	  			 "y", 410
	  	));
	  	Thread.sleep(2000);
		
	    
	}

}
