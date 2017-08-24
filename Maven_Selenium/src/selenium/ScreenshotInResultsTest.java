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
    WebDriver driver;
    
    @BeforeClass
    public void browserInstantiate(){
    	System.out.println("Getting Web driver instance from util class");
		System.setProperty(Constant.GECKO_DRIVER, Constant.GECKO_DRIVER_PATH);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		 driver = new FirefoxDriver(capabilities);
        /*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
        driver=new FirefoxDriver();
    	System.setProperty(Constant.GECKO_DRIVER, Constant.GECKO_DRIVER_PATH);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
        driverObjMap.put(getClass().getName(),driver);
        driver.manage().window().maximize();
        System.out.println("Browser Instantiated..");*/
    }

  /*  @Test
    public void openFacebook(){
        driver.get("http://facebook.com");
        System.out.println("Facebook Opened ..");
        Assert.fail("Test was failed");

    }*/

    @Test
    public void openGoogle(){
        driver.get("http://google.com");
        System.out.println("Google Opened ..");
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