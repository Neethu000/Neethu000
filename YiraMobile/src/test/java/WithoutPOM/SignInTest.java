package WithoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import io.appium.java_client.AppiumBy;

public class SignInTest extends AndroidBaseTest  {

	@Test()
	public void signin() {
		
		//signIn with email
				driver.findElement(AppiumBy.accessibilityId("Sign In With Email")).click();
					
				//Enter Email
				WebElement email = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
				email.click();
				email.sendKeys("priyanka.a@paccore.com");
					
				//Enter password	
				WebElement pswd = driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
				pswd.click();
				pswd.sendKeys("User.123");
					
				//Click on signin button	
				driver.findElement(AppiumBy.accessibilityId("Sign In")).click();
				
				
				
				
				//success text
//				String expectedTitle ="Successfully Logged In.";
//			    String actualTitle =driver.findElement(AppiumBy.accessibilityId("Successfully Logged In.")).getText();
				//String homeText =driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getAttribute("success");
//			    Assert.assertEquals(actualTitle,expectedTitle, "not signin");
//				System.out.println("After clicking signin button displaying:"+ actualTitle);
				
				//Allow Yira device location(while using the app button clicking)
				driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
					
				//Allow Yira send notification(Allow button clicking)	
				driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
					
				//(Get Started button clikcing)
				driver.findElement(AppiumBy.accessibilityId("Get Started")).click();
					
				//clicking skip button
				driver.findElement(AppiumBy.accessibilityId("Skip")).click();
				
				//Get the text from home page
//				String homeText =driver.findElement(AppiumBy.accessibilityId("Hello priyanka Allam")).getText();
//			    Assert.assertEquals(homeText, "Hello priyanka Allam");
//			    System.out.println("after sigin displaying :" + homeText);	
					
	}
}
