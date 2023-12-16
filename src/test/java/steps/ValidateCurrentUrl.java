package steps;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.junit.Assert;

public class ValidateCurrentUrl {
    @Step("Then validate the <urlValue> as a current URL")
    public void implementation1(String urlValue) throws InterruptedException {
        String URL = Driver.webDriver.getCurrentUrl();
        Assert.assertEquals(URL, urlValue);
    }
}
