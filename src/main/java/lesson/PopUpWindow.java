package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopUpWindow {

  @Test
  void handlePopupModel() throws InterruptedException {
    WebDriverManager.setup("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
    WebDriver driver = WebDriverManager.getDriver();
    driver.findElement(By.xpath("//a[normalize-space()='Follow On Twitter']")).click();

//    Assert.assertEquals(driver.getWindowHandles().size(), 1);
//    driver.switchTo().newWindow(WindowType.WINDOW);
//    Thread.sleep(4000);
//    Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Sign in to X']")).isDisplayed());

  }

}
