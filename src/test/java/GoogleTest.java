import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertNotNull;

public class GoogleTest {

    @Test
    public void hello() {
        //open("https://google.com");
        open("https://duckduckgo.com");
        $(By.name("q"))
                .setValue("selenide heisenbug")
                .pressEnter();

        $(".active")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("hello"));

        sleep(5000);
    }
}
