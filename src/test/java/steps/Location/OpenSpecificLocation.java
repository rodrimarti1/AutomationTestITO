package steps.Location;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.ItoPageObject;

public class OpenSpecificLocation {

    ItoPageObject itoPageObject = new ItoPageObject();
    @Step("When the <inputLocationValue> is clicked")
    public void whenTheInputLocationValueIsClicked(String inputLocationValue) throws InterruptedException {
        //Send a value and open a specific location
        itoPageObject.locationsTitle().scrollTo();
        itoPageObject.locationsTabsTitle().findBy(Condition.text(inputLocationValue)).waitUntil(Condition.visible, 25000).click();
    }
}
