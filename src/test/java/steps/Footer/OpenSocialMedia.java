package steps.Footer;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import object.FooterPageObject;

import java.util.ArrayList;

public class OpenSocialMedia {
    FooterPageObject footerPageObject = new FooterPageObject();

    @Step("When the <socialMediaValue> is clicked within 'Footer' section")
    public void whenTheSocialMediaValueIsClickedWithinFooterSection(String socialMediaValue) throws InterruptedException {
        //Open social media with a specific string value
        footerPageObject.socialMedia(socialMediaValue).scrollTo().click();
        //Switch to new open tab
        ArrayList<String> tabs = new ArrayList<String> (Driver.webDriver.getWindowHandles());
        Driver.webDriver.switchTo().window(tabs.get(1));
    }
}
