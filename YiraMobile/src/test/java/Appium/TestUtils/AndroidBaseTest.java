package Appium.TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import yiraHealth.POM.SignInPage;

public class AndroidBaseTest{
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
    public void LaunchApplication() throws URISyntaxException, InterruptedException, IOException { 
		
		
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Administrator\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		// Load properties file
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//yiraHealth//resources//data.properties");
		prop.load(fis);
		
		// Fetch device name, app path, IP address, and port from properties
		String ipAddress = prop.getProperty("AppiumServerIPAddress");
		String port = prop.getProperty("AppiumServerPort");
		String appPath = prop.getProperty("AppPath");
		String deviceName = prop.getProperty("AndroiDeviceName");
		
		// Set options for AndroidDriver
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(deviceName);
		options.setApp(appPath);
		
		// Construct the Appium server URL using the IP address and port from properties file
		String serverUrl = "http://" + ipAddress + ":" + port;
		driver = new AndroidDriver(new URI(serverUrl).toURL(), options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}
	    
	    @Test(dataProvider="getData")
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
		
		
  //SignOut  
	   
//	     //clicking on menu icon
//		 yira.verifyClickingOnMenuIcon();
//		    
//		 //clicking on sign out button  
//		 yira.verifyClickingOnSignOutButton();
//		    
//		 //clicking on confirmation pop up
//		 yira.verifyClickingOnSignOutConfirmationPopUp();
		 

}  
	    
	    @DataProvider
		public Object[][] getData() throws IOException {
			List<HashMap<String,String>> data = getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//JsonData//SignIn.json");
			return new Object[][] {{data.get(0)}};
		}
	    
//	    @DataProvider
//	    public Object[][] getData() throws IOException {
//	        // Fetch the list of HashMap objects from the JSON file
//	        List<HashMap<String, String>> data = getJsonDatatoMap(System.getProperty("user.dir") + "//src//test//java//JsonData//SignIn.json");
//	        
//	        // Initialize a 2D Object array with the size of the data list
//	        Object[][] testData = new Object[data.size()][1];
//	        
//	        // Populate the 2D Object array with all elements from the list
//	        for (int i = 0; i < data.size(); i++) {
//	            testData[i][0] = data.get(i);
//	        }
//	        
//	        // Return the complete test data array
//	        return testData;
//	     }
   
	    
	    //Scrolling page bottom
		
	    public void scrollingGesture() 
	    {
		boolean canScrollMore;
  		do {
  			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
  			"left", 0,
  			"top", 0, 
  			"width", 100,
  			"height", 600,
  		    "direction", "down","percent", 50
  					));
  			}while (canScrollMore);
	    }
	    
	    //hashMaps re-usability code
	    public List<HashMap<String, String>> getJsonDatatoMap(String filePath) throws IOException {
		//read json to string
		String JsonContent=FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);
		//string to HashMap
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data =mapper.readValue(JsonContent, new TypeReference<List<HashMap<String,String>>>() {
		});
		return data;
	    }
	    
	    //Screenshot code
	    
	    public String getScreenshot(String testCaseName, AndroidDriver driver) throws IOException {
		   
		    // Capture the screenshot and store it as a file
		    File source = driver.getScreenshotAs(OutputType.FILE);
		    
		    // Define the destination file path
		    String destinationFile = System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		    File finalDestination = new File(destinationFile);
		    
		    // Copy the screenshot to the destination file
		    FileUtils.copyFile(source, finalDestination);
		    return destinationFile;
		    
		}	    
	    
	    
//    @AfterClass
//    public void tearDown(){
//    	driver.quit();
//    	service.stop();
//    }

}


