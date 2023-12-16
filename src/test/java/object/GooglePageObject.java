package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GooglePageObject {
    public static SelenideElement searchTextBox() {
        Condition visible = Condition.and("There was a problem trying to find the 'Search' text box.", Condition.visible);
        return $(By.cssSelector("textarea#APjFqb")).waitUntil(visible, 25000);
    }

    public static SelenideElement searchButton() {
        Condition visible = Condition.and("There was a problem trying to find the 'Search' button.", Condition.visible);
        return $(By.cssSelector(".FPdoLc [class='gNO89b']")).waitUntil(visible, 25000);
    }

    public static ElementsCollection searchResultCollection() {
        return $$(By.cssSelector(".g > div  .yuRUbf > div > span > a > div > div > div > cite[role='text']"));
    }

    public static  Boolean IsSearchResultDisplayed(ElementsCollection searchResultOptions, String optionValue){
        Boolean isSearDisplayed = false;
        searchResultOptions.get(0).waitUntil(Condition.visible, 25000);
        for (int i=0; i < searchResultOptions.size(); i++){
            if(searchResultOptions.get(i).text().equals(optionValue)){
                isSearDisplayed = true;
            }
        }
        return isSearDisplayed;
    }
}
