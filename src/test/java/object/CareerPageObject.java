package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CareerPageObject {

    public static SelenideElement careerSearchTextBox(){
        Condition visible = Condition.and("There was a problem trying to find the search text box within career page.", Condition.visible);
        return $(By.cssSelector("input#search_keywords")).waitUntil(visible, 25000);
    }
}
