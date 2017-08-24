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


public class MyTest {

   private static HashMap<String, WebDriver> driverObjMap=new HashMap<String, WebDriver>();
  //  WebDriver driver;
    public static WebDriver gerDriverDetails(String className){
        return driverObjMap.get(className);
    }

    public static HashMap<String, WebDriver> gerDriverObjMap(){
        return driverObjMap;
    }

	WebDriver driver = Utils.getWebDriverInstance();
   

    @Test(priority=1)
    public void openFacebook(){
        driver.get("http://facebook.com");
        System.out.println("Facebook Opened ..");
      //  Assert.fail("Test was failed");

    }

    @Test(priority=2)
    public void openGoogle(){
        driver.get("http://google.com");
        System.out.println("Google Opened ..");
      //  Assert.fail("Test was failed");
        driver.quit();

    }

  
}