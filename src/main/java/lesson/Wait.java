package lesson;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import support.WebDriverManager;

public class Wait {

  @BeforeClass
  public void setUp() {
    WebDriverManager.setup("https://www.selenium.dev/selenium/web/dynamic.html");
  }

  @Test
  public void threadSleep() throws InterruptedException {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.id("adder")).click();
    Thread.sleep(2000);
    Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());
  }

  @Test
  public void implicitWaits() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.id("adder")).click();

    // Set implicit wait for every element location
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    // Assert
    Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());
  }

  @Test
  public void explicitWaits() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.id("adder")).click();

    // Set explicit wait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box0")));

    // Assert
    Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());
  }

  @Test
  public void fluentWait() {
    WebDriver driver = WebDriverManager.getDriver();
    org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(
        Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(200)).ignoring(
        ElementNotInteractableException.class);

    WebElement revealed = driver.findElement(By.id("revealed"));
    driver.findElement(By.id("reveal")).click();
    wait.until(d -> {
      revealed.sendKeys("Displayed");
      return true;
    });

    Assert.assertEquals(revealed.getAttribute("value"), "Displayed");

  }


  @AfterClass(enabled = true)
  public void tearDown() {
    WebDriverManager.teardown();
  }
}
