package bridge;

import browserConfigs.BrowserTypes;

public class BridgeTest {
	
	public static void main(String[] args) {
		
		//WebDriverImpl impl = new WebDriverImpl();
		//PlaywrightImpl impl = new PlaywrightImpl();
		//BrowserDriver driver = BrowserFlow.browserType(BrowserType);
		WebActions impl = DriverFactory.driverFactory(DriverTypes.Playwright );
		impl.launch("http://leaftaps.com/opentaps", BrowserTypes.EDGE);
		impl.type("//input[@id='username']", "demosalesmanager");
		impl.type("//input[@id='password']", "crmsfa");
		impl.click("//input[@class='decorativeSubmit']");
		impl.close();
	}

}
