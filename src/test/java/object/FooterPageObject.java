package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FooterPageObject {

    public static SelenideElement socialMedia(String valueSocialMedia){
        Condition visible = Condition.and("There was a problem trying to find the search text box within career page.", Condition.visible);
        return $(By.cssSelector("footer#socket  .icon_count_4.noLightbox.social_bookmarks  a[title='"+valueSocialMedia+"']")).waitUntil(visible, 25000);
    }
}
