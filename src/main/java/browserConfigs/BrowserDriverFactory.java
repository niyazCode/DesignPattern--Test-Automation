package browserConfigs;

import bridge.DriverTypes;
import bridge.PlaywrightImpl;
import bridge.WebActions;
import bridge.WebDriverImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
	
	
	public static WebDriver driverFactory(BrowserTypes type) {
		
		switch(type) {
			case CHROME:  return new ChromeDriver();
			case FIREFOX: return new FirefoxDriver();
			default : return null;
		}
		
	}

}
