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

    js.executeScript(
        "document.querySelector(\"[jsname='yZiJbe']\").value='how to do this do that?';");
    driver.quit();
  }

}
