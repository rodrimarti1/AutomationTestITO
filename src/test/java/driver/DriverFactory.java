package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver(String testName) {

        String browser = System.getenv(SystemConstants.BROWSER);
        switch (browser)
        {
            case SystemConstants.EDGE:
                return new InternetExplorerDriver();
            case SystemConstants.FIREFOX:
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette",true);
                return new FirefoxDriver();
            case SystemConstants.CHROME:
            default:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setCapability("name", testName);
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.addArguments("--allow-insecure-localhost");
                return new ChromeDriver(chromeOptions);
        }
    }
}
