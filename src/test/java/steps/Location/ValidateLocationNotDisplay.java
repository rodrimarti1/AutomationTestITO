package steps.Location;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;
import org.assertj.core.api.Assertions;

public class ValidateLocationNotDisplay {

    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("Then validate the <inputTitleValue> not title is displayed")
    public void thenValidateTheInputTitleValueNotTitleIsDisplayed(String inputTitleValue) throws InterruptedException {
        Assertions.assertThat(itoPageObject.centralAmericaTitle().is(Condition.text(inputTitleValue)))
                .withFailMessage("The "+ inputTitleValue +" title don't display")
                .isFalse();
    }
}
