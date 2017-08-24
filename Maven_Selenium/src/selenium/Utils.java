package selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils {

	// Returns the webdriver instance using the provided web drivnt and path of
	// selenium installation path
	/*
	 * public static WebDriver getWebDriverInstance() {
	 * System.out.println("Getting Web driver instance from util class");
	 * System.setProperty(Constants.GECKO_DRIVER, Constants.GECKO_DRIVER_PATH);
	 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 * capabilities.setCapability("marionette", true); return new
	 * FirefoxDriver(capabilities);
	 * 
	 * 
	 * }
	 */

	public static WebDriver getWebDriverInstance() {
		System.out.println("Getting Web driver instance from util class");
		System.setProperty(Constant.GECKO_DRIVER, Constant.GECKO_DRIVER_PATH);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		//driver.get(Constant.URL);
		
		return driver;
	}

	public static void getScreenShot(String file) throws IOException {
		try {

			File scrFile = ((TakesScreenshot) Constant.driver)
					.getScreenshotAs(OutputType.FILE);
			DateFormat dateFormat = new SimpleDateFormat("HH_mm_ssa yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			FileUtils.copyFile(scrFile,new File(file + dateFormat.format(cal.getTime())));
		} catch (IOException ioe) {
			ioe.getStackTrace();
		}
	}
	
	
	

	/*public static XSSFSheet getExcelSheet() throws IOException {
		FileInputStream file = new FileInputStream(Constant.EXCEL_PATH);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		return sheet;
	}*/

	
		
	
	

}
