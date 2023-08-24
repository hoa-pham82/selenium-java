package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import support.WebDriverManager;

public class Iframe {

  @BeforeClass
  void setUp() {
    WebDriverManager.setup("https://the-internet.herokuapp.com/iframe");
  }

  @Test
  void handleIframe() {
    WebDriver driver = WebDriverManager.getDriver();

    // Find the iframe by its ID
    WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
    driver.switchTo().frame(iframe);

    // Interact with the text box
    WebElement textbox = driver.findElement(By.cssSelector("#tinymce"));
    textbox.clear();
    textbox.sendKeys("Hi Christy!!");

  }

  @AfterClass(alwaysRun = false)
  void tearDown() {
    WebDriverManager.teardown();
  }

}
