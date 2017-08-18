package selenium;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	// for email template
	private static HashMap<String, WebDriver> driverObjMap = new HashMap<String, WebDriver>();
	WebDriver driver;

	public static WebDriver gerDriverDetails(String className) {
		return driverObjMap.get(className);
	}

	public static HashMap<String, WebDriver> gerDriverObjMap() {
		return driverObjMap;
	}

	//

	@Test(groups={"Functional"})
	public void Testcase1() throws InterruptedException {
		driver = new ChromeDriver();
		driverObjMap.put(getClass().getName(), driver);
		driver.get("https://accounts.google.com/");
		Assert.fail("Failed Test case");
		Thread.sleep(300);
		}
	
	@Test(groups={"Functional"})
	public void functional_Test()
	{
		System.out.println("Smoke Scenario passed");
	}
	@Test(groups={"Regression"})
	
	public void Regression_Test()
	{
		System.out.println("Registration done");
		
	}
	
}

