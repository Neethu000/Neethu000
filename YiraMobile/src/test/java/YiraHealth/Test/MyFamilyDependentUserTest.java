package YiraHealth.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class MyFamilyDependentUserTest extends AndroidBaseTest{
	
	@Test
	public void addNewFamilyMumber() {
		
		//clicking on MyFamily icon
		driver.findElement(AppiumBy.accessibilityId("My Family")).click();
		
		//clicking on add new family member button
		driver.findElement(AppiumBy.accessibilityId("Add New Family Member")).click();
		
		//Entering family number name field
		WebElement name = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		name.click();
		name.sendKeys("Nayanika");
		
		//clicking on Relationship dropdown
		driver.findElement(AppiumBy.accessibilityId("Select Relationship *")).click();
		//In dropdown selecting one relation
		driver.findElement(AppiumBy.accessibilityId("Daughter")).click();
		
		//Entering Disease/HFA field
		WebElement disease = driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		disease.click();
		disease.sendKeys("iewrioweui");
		
		//Entering Discription field
		WebElement discription = driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		discription.click();
		discription.sendKeys("cndjjcefijcdcf");
		
		//Clicking on user subrole dropdown
		driver.findElement(AppiumBy.accessibilityId("User SubRole *")).click();
		//In dropdown selecting one subrole option
		driver.findElement(AppiumBy.accessibilityId("Dependent")).click();
		
		//Scrolling page bottom
		
		boolean canScrollMore;
		do {
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 0, "top", 0, "width", 100, "height", 600,
			    "direction", "down",
			    "percent", 50
			));
		}while (canScrollMore);
		
		//Entering DOB filed
		driver.findElements(By.className("android.view.View")).get(5).click();
		//clicking done 
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		//Entering Age field
//		WebElement age = driver.findElements(By.className("android.view.View")).get(6);
//		age.click();
//		age.sendKeys("4");
		
		//Clicking gender dropdown
		driver.findElement(AppiumBy.accessibilityId("Select Gender")).click();
		//In dropdown selecting one gender option
		driver.findElement(AppiumBy.accessibilityId("Female")).click();
		
		
		//Clicking on submit button
		driver.findElement(AppiumBy.accessibilityId("Submit")).click();


	}

}
