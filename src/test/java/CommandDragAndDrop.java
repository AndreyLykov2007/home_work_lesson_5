import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class CommandDragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }
        @Test
    void dragAndDropThroughCommand(){
        open("/drag_and_drop");
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
    }
    }
