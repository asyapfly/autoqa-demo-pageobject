package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButtonByText(String text){
       $(byText(text)).click();
    }

    public void clickButtonByCss(String cssLocator){
        $(cssLocator).click();
    }

    public void clickCheckBox(String cssLocator){
        $(cssLocator).click();
    }

    public void contentIsVisible(String text){
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(visible);
    }
}
