package steps;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl(){
        open("http://аргон19.рф/");
    }
}
