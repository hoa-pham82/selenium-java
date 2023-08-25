package lesson;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import support.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class Executor {

  @Test
  void jsExecutor() {
    WebDriver driver = WebDriverManager.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get("https://www.google.com.vn/");

    String text = "how to do this do that?";

    js.executeScript(
        "document.querySelector(\"[jsname='yZiJbe']\").setAttribute('value', 'argument[0]');",
        text);
    driver.quit();
  }

}
