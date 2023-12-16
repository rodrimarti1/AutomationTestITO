package steps.Google;

import com.thoughtworks.gauge.Step;
import object.GooglePageObject;

public class InputValueToSearch {

    GooglePageObject googlePageObject = new GooglePageObject();
    @Step("When the <valueSearchValue> is input within 'Search' text box")
    public void whenTheInputSearchValueIsInputWithinSearchTextBox(String valueSearchValue) {
        googlePageObject.searchTextBox().sendKeys(valueSearchValue);
        googlePageObject.searchTextBox().pressEscape();
    }
}
