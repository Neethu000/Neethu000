package yiraHealth.POM;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyPrescriptionPage {
	
	AndroidDriver driver;
	WebDriverWait wait;
	public MyPrescriptionPage(AndroidDriver driver){
		this.driver=driver;
		// Increase wait time to 10 seconds
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//My Prescription icon clicking
	@AndroidFindBy(accessibility="My Prescriptions")
	private WebElement prescription;
	
	public void verifyToClickingOnMyPrescriptionIcon() {
	    prescription.click();
	}
	
	//Add new prescription button clicking
	@AndroidFindBy(accessibility ="Add New Prescription")
	private WebElement prescriptionButton;
	
	public void verifyToClickingOnAddNewPrescriptionButton() {
		prescriptionButton.click();
	}
	
	//Types of Illness field
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement illnessType;
	
	//Doctor Name field
	@AndroidFindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement doctorName;
	
	//Add Self notes field
	@AndroidFindBy(xpath="(//android.widget.EditText)[3]")
	private WebElement addSelfNotes;
	
	public void verifyToEnterMyPrescriptionInputFields(String TypesOfIllness,String DoctorName,String AddSelfNotes) {
		
		illnessType.click();
		illnessType.sendKeys(TypesOfIllness);
		doctorName.click();
		doctorName.sendKeys(DoctorName);
		addSelfNotes.click();
		addSelfNotes.sendKeys(AddSelfNotes);
	}
	
	//Date of prescription field
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Add Prescription \"]/android.view.View")
	private WebElement dateOfPrescription;
	
	public void verifyToEnterTheDateOfPrescription() {
		dateOfPrescription.click();
	}
	
	//In date selection clicking on done button
	@AndroidFindBy(accessibility="Done")
	private WebElement inDateDoneButton;
	
	public void verifyToClickingOnDoneButtonInDateSelection() {
		inDateDoneButton.click();
	}
	
	//Clicking on choose file field
	@AndroidFindBy(accessibility="Choose File")
	private WebElement chooseFile;
	
	public void verifyToClickingOnChooseFile() {
		chooseFile.click();
	}
	
	//In choose file clicking on Camera option
	@AndroidFindBy(accessibility="Camera")
	private WebElement cameraOption;
	
	public void verifyToClickingOnCameraOption() {
		cameraOption.click();
	}
	
	//Camera permissions while using app button clicking
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement cameraPermission;
	
	public void verifyToClickingOnCameraPermission() {
		cameraPermission.click();
	}
	
	//clicking on photo 
	@AndroidFindBy(accessibility="Shutter")
	private WebElement photo;
	
	public void verifyToClickingOnPhoto() {
		photo.click();
	}
	
	//clicking on photo confirmation button
	@AndroidFindBy(accessibility="Done")
	private WebElement confirmButton;
	
	public void verifyToClickingOnConfirmButton() {
		confirmButton.click();
	}
	
	//Clicking on submit button
	@AndroidFindBy(accessibility="Submit")
	private WebElement submitButton;
	
	public void verifyToClickingOnSubmitButton() {
		submitButton.click();
	}
	
	
	
	
	
	
}
