package support;

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

  public static void setup(String url) {
    WebDriver driver = WebDriverManager.getDriver();
    driver.get(url);
    driver.manage().window().maximize();
  }

  public static void teardown() {
    driver.quit();
  }

}
