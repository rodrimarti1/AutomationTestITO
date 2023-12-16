package steps.ITO;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;
import org.assertj.core.api.Assertions;

public class ValidateNowHiringIsDisplayed {
    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("Then validate the 'Now hiring' button is displayed")
    public void thenValidateTheNowHiringButtonIsDisplayed() throws InterruptedException {
        Assertions.assertThat(itoPageObject.nowHiringButton().waitUntil(Condition.visible, 25000).scrollTo().isDisplayed())
                .withFailMessage("The now hiring button don't display")
                .isTrue();
    }
}
