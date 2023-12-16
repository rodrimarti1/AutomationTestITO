package steps.ITO;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;

public class OpenLocationPage {
    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("When the <optionMenuValue> tab is clicked")
    public void whenTheOptionMenuValueTabIsClicked(String optionMenuValue) throws InterruptedException {
        itoPageObject.optionMenuTab().findBy(Condition.text(optionMenuValue)).waitUntil(Condition.visible, 25000).click();
    }
}
