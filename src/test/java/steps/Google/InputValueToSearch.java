package steps.Google;

import com.thoughtworks.gauge.Step;
import object.GooglePageObject;

public class InputValueToSearch {

    GooglePageObject googlePageObject = new GooglePageObject();
    @Step("When the <valueSearchValue> is input within 'Search' text box")
    public void whenTheInputSearchValueIsInputWithinSearchTextBox(String valueSearchValue) {
        //Sen value to textbox
        googlePageObject.searchTextBox().sendKeys(valueSearchValue);
        //Press esc to hide the suggestion
        googlePageObject.searchTextBox().pressEscape();
    }
}
