package steps.ITO;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;
import org.assertj.core.api.Assertions;

public class ValidateTabSelected {
    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("Then validate the <inputTabTitle> tab is selected")
    public void thenValidateTheInputTabTitleTabIsSelected(String inputTabTitle) throws InterruptedException {
        Assertions.assertThat(itoPageObject.locationsTabsSelected().get(itoPageObject.indexLocationsTab(itoPageObject.locationsTabsTitle(), inputTabTitle)).waitUntil(Condition.visible, 25000).scrollTo().getAttribute("class"))
                .withFailMessage("The "+ inputTabTitle +" tab don't select")
                .containsIgnoringCase("av-active-tab-title");
    }
}
