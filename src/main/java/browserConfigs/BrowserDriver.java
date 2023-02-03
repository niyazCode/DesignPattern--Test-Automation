package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface BrowserDriver {

    WebDriver launch();

    void launchUrl(String url);

    void maximize();

    void closeBrowser();
}
