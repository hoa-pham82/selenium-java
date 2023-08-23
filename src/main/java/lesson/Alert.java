package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert {

  @BeforeClass
  public void setUp() {
    WebDriverManager.setup("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
  }

  @Test
  void handleAlertOK() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    driver.switchTo().alert().accept();

  }

  @Test
  void handleAlertCancel() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
    driver.switchTo().alert().dismiss();

    Assert.assertEquals(driver.findElement(By.id("confirm-demo")).getText(), "You pressed Cancel!");
  }

  @Test
  void handleAlertInput() {
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
    driver.switchTo().alert().sendKeys("I agree!!");
    driver.switchTo().alert().accept();

    Assert.assertEquals(driver.findElement(By.id("prompt-demo")).getText(),
        "You have entered 'I agree!!' !");
  }

  @AfterClass
  public void tearDown() {
    WebDriverManager.teardown();
  }
}
