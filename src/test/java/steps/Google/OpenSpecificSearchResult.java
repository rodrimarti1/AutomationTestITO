package steps.Google;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.GooglePageObject;

public class OpenSpecificSearchResult {
    GooglePageObject googlePageObject = new GooglePageObject();
    @Step("When <inputPageToOpen> is clicked")
    public void whenInputPageToOpenIsClicked(String inputPageToOpen) throws InterruptedException {
        //Open search result
        googlePageObject.searchResultCollection().findBy(Condition.text(inputPageToOpen)).waitUntil(Condition.visible, 25000).click();
    }
}
