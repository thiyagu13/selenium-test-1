package selenium;

import org.openqa.selenium.WebDriver;

public class Constant {
	// call getcko driver (For latest fire fox version)
		public static  String GECKO_DRIVER = "webdriver.gecko.driver";

		// Selenium getcko driver .exe path
		public static  String GECKO_DRIVER_PATH = ".\\geckodriver.exe";
		
		// Site URL
		public static String URL= "https://www.google.co.in";
		
		//Screenshot folder - in eclipse
		public static final String SCREENSHOT_FOLDER = ".\\Screenshot\\";
		
	    //Excel path
		public static String EXCEL_PATH =".\\Testcase.xlsx";
	
		/*Call driver */
		public static WebDriver driver = Utils.getWebDriverInstance();
	
}
