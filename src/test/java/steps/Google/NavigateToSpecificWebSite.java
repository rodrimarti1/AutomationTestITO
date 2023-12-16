package steps.Google;

import com.thoughtworks.gauge.Step;
import driver.Driver;

public class NavigateToSpecificWebSite {

    @Step("Go to the website with the URL <InputWebSiteAddress>")
    public void goToTheWebsiteWithTheURL(String InputWebSiteAddress) throws InterruptedException {
        Driver.webDriver.get(InputWebSiteAddress);
    }
}
