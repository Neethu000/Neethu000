package yiraHealth.POM;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class SignInPage{

	AndroidDriver driver;
	WebDriverWait wait;
	
	public SignInPage(AndroidDriver driver) {
		this.driver=driver;
		// Increase wait time to 10 seconds
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//Click on signin button
	@AndroidFindBy(accessibility="Sign In With Email")
    private WebElement signIn;
	
	public void verifySigninThrowEmail() {
		signIn.click();
	}
	
	
	//signIn with email
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement emailId;
	
	//Enter Email
	@AndroidFindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement password;
	
	//Click on signin button
	@AndroidFindBy(accessibility="Sign In")
    private WebElement signInButton;
	
	
	public void verifyToEnterTheEmailIdAndPassword(String email,String pswd) {
		
		// Clear fields before entering new credentials
	    
	    
	    emailId.click();
	    emailId.sendKeys(email);
	    password.click();
	    password.sendKeys(pswd);
	    signInButton.click(); 
	    
	    
	}
	
//	public void clearEmailAndPasswordFields() {
//		emailId.click();
//		emailId.clear(); // Replace 'emailField' with the actual WebElement for the email field
//		 password.click();
//		password.clear(); // Replace 'passwordField' with the actual WebElement for the password field
//	}
	
	//Allow Yira device location(while using the app button clicking)
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement deviceLocation;
	
	public void verifyClickingOnDevicePermission() {
		deviceLocation.click();
	}
	
	//Allow Yira send notification(Allow button clicking)
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    private WebElement sendNotification;
	
	public void verifyClickingOnSendNotification() {
		sendNotification.click();
	}
	
	//(Get Started button clicking)
	@AndroidFindBy(accessibility="Get Started")
    private WebElement getStarted;
	
	public void verifyClickingOnGetStartedButton() {
		getStarted.click();
	}
	
	//clicking skip button
	@AndroidFindBy(accessibility="Skip")
    private WebElement skipButton;
	
	public void verifyClickingOnSkipButton() {
		skipButton.click();
	}
	
	
	//For log out 
	
	//clicking on menu icon
	@AndroidFindBy(accessibility="Open navigation menu")
	private WebElement menuIcon;
		
    public void verifyClickingOnMenuIcon() {
    	menuIcon.click();
	}
    
    //clicking on sign out button
    @AndroidFindBy(accessibility="Sign Out")
	private WebElement signOutButton;
		
    public void verifyClickingOnSignOutButton() {
    	signOutButton.click();
	}
    
    //clicking on confirmation pop up
    @AndroidFindBy(accessibility="Ok")
	private WebElement confirmButton;
		
    public void verifyClickingOnSignOutConfirmationPopUp() {
    	confirmButton.click();
	}
    
    // Close the App
    public void closeApp() {        
     try {            
     driver.close();       
     } catch (Exception e) { System.out.println("Failed to close the app: " + e.getMessage()); 
    } 
    }
 
}

