package adapter;

import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowWebAdapter implements ServiceNowActions{
    ChromeDriver driver;
    String url = "https://dev89195.service-now.com/";


    public ServiceNowWebAdapter()
    {

         driver = new ChromeDriver();

    }
    public void launchUrl() {
        driver.get(url);

    }

    public void loginApp() {

    }

    public void navToIncident() {

    }

    public void navToIncidentCreation() {

    }

    public void addIncidentDetails() {

    }

    public void createNewIncident() {

    }
}
