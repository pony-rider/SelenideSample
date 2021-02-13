import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertNotNull;

public class GoogleTest {

    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @Test
    public void searchTest() {
        //open("https://google.com");
        Configuration.browser = "edge";
        open("https://duckduckgo.com");
        $(By.name("q"))
                .setValue("selenide heisenbug")
                .pressEnter();

        $$(".results_links_deep").shouldHave(CollectionCondition.sizeGreaterThan(5));
      /*  $(".active")
                .shouldBe(visible)
                .shouldHave(text("hello"));
*/
        sleep(4000);
    }
}
