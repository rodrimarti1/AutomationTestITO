package steps.Career;

import com.thoughtworks.gauge.Step;
import object.CareerPageObject;

public class SearchCareer {
    CareerPageObject careerPageObject = new CareerPageObject();
    @Step("When the <inputKeywordToSearchCareer> is input within 'Search Career' text box")
    public void whenTheInputKeywordToSearchCareerIsInputWithinSearchCareerTextBox(String inputKeywordToSearchCareer) {
        //Send keyword to text box
        careerPageObject.careerSearchTextBox().sendKeys(inputKeywordToSearchCareer);
        //Click on text box to have control on it
        careerPageObject.careerSearchTextBox().click();
        //Press enter to execute the search
        careerPageObject.careerSearchTextBox().pressEnter();

    }
}
