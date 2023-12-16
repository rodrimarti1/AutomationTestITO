package steps.Google;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;
import object.GooglePageObject;

public class SubmitSearch {
    GooglePageObject googlePageObject = new GooglePageObject();
    @Step("When the 'Search' button is clicked")
    public void whenTheSearchButtonIsClicked() {
        //Submit the search clicked the search button
        googlePageObject.searchButton().waitUntil(Condition.visible, 25000).click();
    }
}
