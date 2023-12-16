package steps.Location;

import com.thoughtworks.gauge.Step;
import object.ItoPageObject;
import org.assertj.core.api.Assertions;


public class LocationTextHeader {
    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("Then validate the <inputLocationText> title location is displayed")
    public void thenValidateTheInputLocationTextTitleLocationIsDisplayed(String inputLocationText) throws InterruptedException {
        Assertions.assertThat(itoPageObject.cityCatalog().toString())
                .withFailMessage("The "+ inputLocationText +" title don't display")
                .containsIgnoringCase(inputLocationText);
    }
}
