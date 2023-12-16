package steps.Location;

import com.codeborne.selenide.CollectionCondition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;
import org.assertj.core.api.Assertions;

public class ValidateTitleLocationNotDisplay {

    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("Then validate the <inputLocationText> title location is not displayed")
    public void thenValidateTheInputLocationTextTitleLocationIsNotDisplayed(String inputLocationText) throws InterruptedException {
        Assertions.assertThat(itoPageObject.cityCatalog().contains(inputLocationText))
                .withFailMessage("The "+ inputLocationText +" title don't display")
                .isFalse();
    }
}
