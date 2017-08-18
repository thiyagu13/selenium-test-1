package selenium;



import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	// for email template
	 private static HashMap<String, WebDriver> driverObjMap=new HashMap<String, WebDriver>();
	 WebDriver driver;
	 
	 public static WebDriver gerDriverDetails(String className){
	        return driverObjMap.get(className);
	    }

	    public static HashMap<String, WebDriver> gerDriverObjMap(){
	        return driverObjMap;
	    }
	   
	    //
	    
      @Test(priority=1)
      public void Login() {
	  /*System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Selenium_Project\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);  */
    	driver = new ChromeDriver();  
    	driverObjMap.put(getClass().getName(),driver);
		driver.get("http://192.168.1.12:8080");
		//Assert.fail("Test was failed");
	  
  }
      @Test(priority=2)
      public void invaliduser1() throws InterruptedException, IOException {
    	  Thread.sleep(1000);
	   driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/ul/li[5]/a")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("invaliduser1");;
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("invalidpwd1");;
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//*[@id='submitbtn']"));
	   Thread.sleep(1000);
	   Assert.fail("Test was failed");
	//   Utils.getScreenShot(Constant.SCREENSHOT_FOLDER + "\\Test.png");
	  // Reporter.log("<a href= " + Constant.SCREENSHOT_FOLDER + "> <img width='100' height='100' src=" + Constant.SCREENSHOT_FOLDER + "> </a>");
	  
  }
      @Test(priority=3)
      public void invaliduser2() throws InterruptedException {
    	  Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/ul/li[5]/a")).click();
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("invaliduser1");;
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("invalidpwd1");;
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='submitbtn']"));
   	   Thread.sleep(1000);
  }
      @Test(priority=4)
      public void validuser() throws InterruptedException {
    	  Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/ul/li[5]/a")).click();
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("invaliduser1");;
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("invalidpwd1");;
   	   Thread.sleep(1000);
   	   driver.findElement(By.xpath(".//*[@id='submiftbtn']"));
   	   Thread.sleep(1000);
	  
  }
      
      @Test(priority=4)
      public void browserclose() throws Exception {
    	  Thread.sleep(2000);
    	  driver.close();
    	//  SendMail.execute("customized-emailable-report.html");
  }
      
}
