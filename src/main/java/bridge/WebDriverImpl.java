package bridge;

import java.time.Duration;

import browserConfigs.BrowserDriverFactory;
import browserConfigs.BrowserTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverImpl implements WebActions{

	private WebDriver driver;
	
	@Override
	public void launch(String url, BrowserTypes browserType) {
		driver = BrowserDriverFactory.driverFactory(browserType);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Override
	public void type(String locator, String text) {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	@Override
	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	@Override
	public String getText(String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}

	@Override
	public void close() {
		driver.close();
	}

}
