package YiraHealth.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Appium.TestUtils.AndroidBaseTest;
import yiraHealth.POM.MyMedicinesPage;

public class MyMedicinesTest extends AndroidBaseTest{
	
	@Test(dataProvider="getMedicineData")
	public void addNewMedicine(HashMap<String,String>input) {
		
		MyMedicinesPage addNewMedicine = new MyMedicinesPage(driver);
		
		//MyMedicines icon clicking
		addNewMedicine.verifyToClickingOnMyMedicinesIcon();
		
		//Add new medicine button clicking
		addNewMedicine.verifyToClickingOnAddNewMedicinesButton();
		
		//Medicine name,Condition and Usage filed
		addNewMedicine.verifyToEnterTheMedicineDetails(input.get("MedicineName"), input.get("Condition"), input.get("Usage"));
		
		//Start date field
		addNewMedicine.verifyToClikingOnStartDateField(4);
		
		//In calendar done button clicking
		addNewMedicine.verifyToClickingOnStartDateDone();
		
		//End date field
		addNewMedicine.verifyToClikingOnEndDateField(5);
		
		//In calendar done button clicking
		addNewMedicine.verifyToClickingOnEndDateDone();
		
		//Clicking on add time slot button
		addNewMedicine.verifyToClickingOnTimeSlotButton();
		
		//clicking on submit button
		addNewMedicine.verifyToClickingOnSubmitButton();
		
	}
	
	@DataProvider
	public Object[][] getMedicineData() throws IOException {
		
	List<HashMap<String,String>> data= getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//JsonData//MyMedicines.json");
	return new Object[][] {{data.get(0)}};
	    
	}
	

	
}
