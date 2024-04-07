import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GithubEnterprisePageOpen {
  @BeforeAll
  static void beforeAll() {
      Configuration.browserSize = "1920x1080";
      Configuration.holdBrowserOpen = true;
      Configuration.baseUrl = "https://github.com/";
  }

  @Test
  void githubEnterprisePageOpen(){

    }
}
