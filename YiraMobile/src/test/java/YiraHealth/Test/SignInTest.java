package YiraHealth.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Appium.TestUtils.AndroidBaseTest;
import yiraHealth.POM.SignInPage;

public class SignInTest extends AndroidBaseTest  {

	   @Test(dataProvider="getData1")
	    public void SignIn(HashMap<String,String>input) throws MalformedURLException, URISyntaxException, InterruptedException {
	    	
	    SignInPage yira = new SignInPage(driver);
	    
	    //SignInPage
	    yira.verifySigninThrowEmail();
	    
	    //entering email id,pswd and sign in button clicking
	    yira.verifyToEnterTheEmailIdAndPassword(input.get("email"),input.get("pswd"));
	   
	    //Allow Yira device location(while using the app button clicking)
	    yira.verifyClickingOnDevicePermission();
	    
	    //Allow Yira send notification(Allow button clicking)
	    yira.verifyClickingOnSendNotification();
	    
	    //(Get Started button clicking)
	    yira.verifyClickingOnGetStartedButton();
	    
	    //clicking skip button
		yira.verifyClickingOnSkipButton();
		
		
 //SignOut code 
	    
	    //clicking on menu icon
	    yira.verifyClickingOnMenuIcon();
	    
	    //clicking on sign out button  
	    yira.verifyClickingOnSignOutButton();
	    
	    //clicking on confirmation pop up
	    yira.verifyClickingOnSignOutConfirmationPopUp();
       
}  
	    
//	    @DataProvider
//		public Object[][] getData1() throws IOException {
//			List<HashMap<String,String>> data = getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//JsonData//SignIn.json");
//			return new Object[][] {{data.get(0)}};
//		}
	    
	    @DataProvider
	    public Object[][] getData1() throws IOException {
	        // Fetch the list of HashMap objects from the JSON file
	        List<HashMap<String, String>> data = getJsonDatatoMap(System.getProperty("user.dir") + "//src//test//java//JsonData//SignIn.json");
	        
	        // Initialize a 2D Object array with the size of the data list
	        Object[][] testData = new Object[data.size()][1];
	        
	        // Populate the 2D Object array with all elements from the list
	        for (int i = 0; i < data.size(); i++) {
	            testData[i][0] = data.get(i);
	        }
	        // Return the complete test data array
	        return testData;
	    
	    }
	    
}
