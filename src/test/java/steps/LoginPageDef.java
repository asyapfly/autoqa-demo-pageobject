package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageDef {

    LoginPage loginPage = new LoginPage();

    @Then("Input Login")
    public void inputLogin() {
        loginPage.enterLogin(UserConfig.USER_LOGIN);
    }
    @Then("Input PassWord")
    public void inputPassWord() {
        loginPage.enterPassword(UserConfig.USER_PASSWORD);
    }

}
