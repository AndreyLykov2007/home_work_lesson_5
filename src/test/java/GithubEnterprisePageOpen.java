import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class GithubEnterprisePageOpen {
  @BeforeAll
  static void beforeAll() {
      Configuration.browserSize = "1920x1080";
      Configuration.holdBrowserOpen = true;
      Configuration.pageLoadStrategy = "eager";
      Configuration.baseUrl = "https://github.com/";
  }

  @Test
  void githubEnterprisePageOpen(){
    // открыть страницу
      open("");
    // навестись на Solutions
      $("div[class^=header-menu-wrapper").$(byTagAndText("button","Solutions")).hover();
    // кликнуть на Enterprise
      $$("a").findBy(text("Enterprise")).click();
    // проверить наличие заголовка Build like the best
      $("#hero-section-brand-heading").shouldHave(text("""
              The AI-powered
              developer platform.
              """));
    }
}
