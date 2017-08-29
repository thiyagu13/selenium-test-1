package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;


public class ScreenshotInResultsTest {

    private static HashMap<String, WebDriver> driverObjMap=new HashMap<String, WebDriver>();
    public static WebDriver driver; 
    
    @BeforeClass
    public void browserInstantiate(){
    	System.out.println("Getting Web driver instance from util class");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Easy solutions\\git\\selenium-test\\Maven_Selenium\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
    	//driver = new ChromeDriver();
    }

    @Test
    public void openFacebook(){
        driver.get("http://facebook.com");
      //we expect the title “Google “ should be present
    	String Expectedtitle = "Facebook � log in or sign up";
    	//it will fetch the actual title
    	String Actualtitle = driver.getTitle();
    	System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
    	//it will compare actual title and expected title
    	Assert.assertEquals(Actualtitle, Expectedtitle);
    	//print out the result
    	System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
       // Assert.fail("Test was failed");

    }

    @Test
    public void openGoogle(){
    	//it will open the goggle page
    	driver.get("http://google.in");
    	//we expect the title “Google “ should be present
    	String Expectedtitle = "Google";
    	//it will fetch the actual title
    	String Actualtitle = driver.getTitle();
    	System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
    	//it will compare actual title and expected title
    	Assert.assertEquals(Actualtitle, Expectedtitle);
    	//print out the result
    	System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
       // Assert.fail("Test was failed");

    }

    public static WebDriver gerDriverDetails(String className){
        return driverObjMap.get(className);
    }

    public static HashMap<String, WebDriver> gerDriverObjMap(){
        return driverObjMap;
    }

    @AfterClass
    public void quitDriver(){
        if(gerDriverObjMap().get(getClass().getName())!=null){
            gerDriverObjMap().get(getClass().getName()).quit();
            gerDriverObjMap().remove(getClass().getName());
            System.out.println("driver for class : "+ getClass().getName() + "is closed");
        }
    }
}