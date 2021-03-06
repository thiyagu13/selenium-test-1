package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Test1 {
	@Test
	public void testgooglrsearch(){
		System.setProperty(Constant.GECKO_DRIVER, Constant.GECKO_DRIVER_PATH);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
	
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
	driver.close();
	}

		
	
	
	
}
