import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }
    @Test
    void dragAndDrop(){
    open("/drag_and_drop");
    actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
    $$(".column").first().shouldHave(text("B"));
    }
}
