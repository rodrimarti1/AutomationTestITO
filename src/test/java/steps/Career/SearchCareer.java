package steps.Career;

import com.thoughtworks.gauge.Step;
import object.CareerPageObject;

public class SearchCareer {
    CareerPageObject careerPageObject = new CareerPageObject();
    @Step("When the <inputKeywordToSearchCareer> is input within 'Search Career' text box")
    public void whenTheInputKeywordToSearchCareerIsInputWithinSearchCareerTextBox(String inputKeywordToSearchCareer) {
        careerPageObject.careerSearchTextBox().sendKeys(inputKeywordToSearchCareer);
        careerPageObject.careerSearchTextBox().click();
        careerPageObject.careerSearchTextBox().pressEnter();

    }
}
