package bridge;

import browserConfigs.BrowserTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebActions {
	
	public void launch(String url, BrowserTypes type);
	public void type(String locator, String text);
	public void click(String locator);
	public String getText(String locator);
	public void close();

}
