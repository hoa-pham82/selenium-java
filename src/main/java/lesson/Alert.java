package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert {

  @BeforeClass
  public void setUp() {
    WebDriverManager.setup("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
  }

  @Test
  void handleAlert() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    driver.switchTo().alert().accept();

  }

  @AfterClass
  public void tearDown() {
    WebDriverManager.teardown();
  }
}
