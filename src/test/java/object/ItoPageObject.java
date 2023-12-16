package object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ItoPageObject {

    public static SelenideElement nowHiringButton() {
        Condition visible = Condition.and("There was a problem trying to find the 'Now hiring' button.", Condition.visible);
        return $(By.cssSelector(".avia-button.avia-color-custom.avia-icon_select-yes-right-icon.avia-position-left.avia-size-medium > .avia_iconbox_title")).waitUntil(visible, 25000);
    }

    public static ElementsCollection optionMenuTab() {
        return $$(By.cssSelector(".menu-item > a > span.avia-menu-text"));
    }

    public static ElementsCollection locationsTabsSelected(){
        return $$(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-small > a.av-section-tab-title.av-tab-no-icon.av-tab-with-image.noHover"));
    }

    public static ElementsCollection locationsTabsTitle(){
        return $$(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-small > a.av-section-tab-title.av-tab-no-icon.av-tab-with-image.noHover span.av-inner-tab-title"));
    }

    public static SelenideElement locationsTitle(){
        Condition visible = Condition.and("There was a problem trying to find the 'Location' header.", Condition.visible);
        return $(By.cssSelector("[itemprop='headline']")).waitUntil(visible, 25000);
    }

    public static int indexLocationsTab(ElementsCollection locationsText, String specificLocationText){
        int tabSelected = 0;
        locationsText.get(0).waitUntil(Condition.visible, 25000);
        for (int i=0; i < locationsText.size(); i++){
            if(locationsText.get(i).text().equals(specificLocationText)){
                tabSelected = i;
            }
        }
        return tabSelected;
    }

    public static SelenideElement centralAmericaTitle(){
        Condition visible = Condition.and("There was a problem trying to find the 'Central america' header.", Condition.visible);
        return $(By.cssSelector("[data-tab-section-id='central-america'] h2")).waitUntil(visible, 25000);
    }

    public static ElementsCollection cityCatalog(){
        return $$(By.cssSelector(".av_textblock_section .avia_textblock h3 b"));
    }
}
