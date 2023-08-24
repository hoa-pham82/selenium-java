package lesson;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import support.WebDriverManager;

public class popUpWindow {

  @BeforeClass
  void setUp() {
    WebDriverManager.setup("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
  }

  @Test
  void handlePopupModel() {
    WebDriver driver = WebDriverManager.getDriver();
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Assert only one current window is open
    String originalWindow = driver.getWindowHandle();
    Assert.assertEquals(driver.getWindowHandles().size(), 1);

    // Click to the popup button
    driver.findElement(By.xpath("//a[normalize-space()='Follow On Twitter']")).click();

    // Switch to new window
    for (String windowHandle : driver.getWindowHandles()) {
      if (!originalWindow.contentEquals(windowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }

    // Wait until the new login modal is displayed
    wait.until(d -> driver.findElement(By.xpath("//span[text()='Sign in to X']"))
        .isDisplayed());

    Assert.assertTrue(
        driver.findElement(By.xpath("//span[normalize-space()='Sign in to X']")).isDisplayed());

  }

  @AfterClass
  void tearDown() {
    WebDriverManager.teardown();
  }

}
