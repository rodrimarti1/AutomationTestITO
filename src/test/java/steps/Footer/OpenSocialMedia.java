package steps.Footer;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import object.FooterPageObject;

import java.util.ArrayList;

public class OpenSocialMedia {
    FooterPageObject footerPageObject = new FooterPageObject();

    @Step("When the <socialMediaValue> is clicked within 'Footer' section")
    public void whenTheSocialMediaValueIsClickedWithinFooterSection(String socialMediaValue) throws InterruptedException {
        footerPageObject.socialMedia(socialMediaValue).scrollTo().click();
        ArrayList<String> tabs = new ArrayList<String> (Driver.webDriver.getWindowHandles());
        Driver.webDriver.switchTo().window(tabs.get(1));
    }
}
