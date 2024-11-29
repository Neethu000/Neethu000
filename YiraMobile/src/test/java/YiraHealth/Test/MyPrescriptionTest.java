package YiraHealth.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;

import yiraHealth.POM.MyPrescriptionPage;

public class MyPrescriptionTest extends AndroidBaseTest{
	
	@Test(dataProvider="getData")
	public void prescriptionRecord(HashMap<String,String>input) {
		
		MyPrescriptionPage newRecord = new MyPrescriptionPage(driver);
		
		//My Prescription icon clicking
		newRecord.verifyToClickingOnMyPrescriptionIcon();
				
		//Add new prescription button clicking
		newRecord.verifyToClickingOnAddNewPrescriptionButton();
				
		//Types of Illness,Doctor Name and Add Self notes fields
		
		newRecord.verifyToEnterMyPrescriptionInputFields(input.get("TypesOfIllness"),input.get("DoctorName"),input.get("AddSelfNotes"));
		
		//Date of prescription field 
		newRecord.verifyToEnterTheDateOfPrescription();
		
		//In date selection clicking on done button
		newRecord.verifyToClickingOnDoneButtonInDateSelection();
				
		//Clicking on choose file field
		newRecord.verifyToClickingOnChooseFile();
						
		//In choose file clicking on Camera option
		newRecord.verifyToClickingOnCameraOption();
		
		//Camera permissions while using app button clicking
		newRecord.verifyToClickingOnCameraPermission();
		
		//clicking on photo 
		newRecord.verifyToClickingOnPhoto();
		
		//clicking on photo confirmation button
		newRecord.verifyToClickingOnConfirmButton();
		
		//Clicking on submit button
		newRecord.verifyToClickingOnSubmitButton();
				
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
	List<HashMap<String,String>> data= getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//JsonData//MyPrescription.json");
	return new Object[][] {{data.get(0)}};
	    
	}

	
}
