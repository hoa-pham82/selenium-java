package lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      driver = new ChromeDriver();
    }
    return driver;
  }

  public static void setup() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  public static void teardown() {
    driver.quit();
  }

}
