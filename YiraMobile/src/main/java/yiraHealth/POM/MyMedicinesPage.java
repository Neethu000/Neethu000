package yiraHealth.POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyMedicinesPage {

	AndroidDriver driver;
	WebDriverWait wait;
	public MyMedicinesPage(AndroidDriver driver) {
		this.driver=driver;
		this.wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//MyMedicines icon clicking
	@AndroidFindBy(accessibility="My Medicines")
	private WebElement mymedicinesIcon;
		
	public void verifyToClickingOnMyMedicinesIcon() {
		mymedicinesIcon.click();
	}
	
	//Add new medicine button clicking
	@AndroidFindBy(accessibility="Add New Medicine")
	private WebElement addNewMedicinesButton;
		
	public void verifyToClickingOnAddNewMedicinesButton() {
		addNewMedicinesButton.click();
	}
	
	//Medicine name,Condition and Usage filed
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement medicineName;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement condition;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[3]")
	private WebElement usage;
	
	public void verifyToEnterTheMedicineDetails(String MedicineName,String Condition,String Usage) {
		
		medicineName.click();
		medicineName.sendKeys(MedicineName);
		condition.click();
		condition.sendKeys(Condition);
		usage.click();
		usage.sendKeys(Usage);	
	}
		
	//Start date field
	@AndroidFindBy(className="android.view.View") 
	private List<WebElement> sdate;
	
	public void verifyToClikingOnStartDateField(int index) {
		sdate.get(index).click();
	}
	
	//In calendar done button clicking
	@AndroidFindBy(accessibility="Done")
	private WebElement done;
		
	public void verifyToClickingOnStartDateDone() {
		done.click();
	}
	
	//End date field
	@AndroidFindBy(className="android.view.View") 
	private List<WebElement> edate;
	
	public void verifyToClikingOnEndDateField(int index) {
	    edate.get(index).click();
		
	}
	
	//In calendar done button clicking
	@AndroidFindBy(accessibility="Done")
	private WebElement done1;
			
	public void verifyToClickingOnEndDateDone() {
		done1.click();
	}
	
	//Clicking on add time slot button
	@AndroidFindBy(accessibility="Add Time Slot")
	private WebElement timeslot;
			
	public void verifyToClickingOnTimeSlotButton() {
		timeslot.click();
	}
	
	//clicking on submit button
	@AndroidFindBy(accessibility="Submit")
	private WebElement submit;
			
	public void verifyToClickingOnSubmitButton() {
		submit.click();
	}		
	
	
	
}



