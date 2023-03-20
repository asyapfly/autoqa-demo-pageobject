package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private ElementsCollection resultInputs = $$(".auth__input");

    private SelenideElement loginInput = resultInputs.findBy(name("USER_LOGIN"));
    private SelenideElement passwordInput = resultInputs.findBy(name("USER_PASSWORD"));
    private SelenideElement submitButton = $(".auth__checkbutton");
    private SelenideElement rememberMeCheckBox = $("#auth__checkbox");
    public void enterLogin(String text){
        this.loginInput.val(text);
    }

    public void enterPassword(String text){
        this.passwordInput.val(text);
    }

}
