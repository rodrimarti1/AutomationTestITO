package steps.Google;

import com.thoughtworks.gauge.Step;
import object.GooglePageObject;
import org.assertj.core.api.Assertions;

public class ValidateOptionSearchIsDisplayed {

    GooglePageObject googlePageObject = new GooglePageObject();
    @Step("Then validate the <inputValue> is displayed in search result page")
    public void thenValidateTheInputValueIsDisplayedInSearchResultPage(String inputValue) {
        //Validate if a specific reusult is displayed on the results list
        Assertions.assertThat(googlePageObject.IsSearchResultDisplayed(googlePageObject.searchResultCollection (),inputValue))
                .withFailMessage("The Value don't display")
                .isTrue();
    }
}
