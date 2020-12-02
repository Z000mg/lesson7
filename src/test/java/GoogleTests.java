import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

    @Test
    public void willGoogleFindQAGuru () {
        open("https://google.com");
        $(byName("q")).val("QAGURU").pressEnter();
        $("#res").shouldHave(text("QAGURU"));
    }
}
