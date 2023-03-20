package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String text) {
        basicPage.clickButtonByText(text);
    }

    @Then("Click Войти {string}")
    public void clickВойти(String cssLocator) {
        basicPage.clickButtonByCss(cssLocator);
    }

    @Then("Content with {string} visible")
    public void contentVisible(String text) {
        basicPage.contentIsVisible(text);
    }
}
