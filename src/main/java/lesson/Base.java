package lesson;

import static java.lang.Thread.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Base {

  public static void selectFromTabBar(String tabBar, String option) throws InterruptedException {
    WebDriver driver = WebDriverManager.getDriver();

    driver.findElement(By.xpath(String.format("//*[text()='%s ']", tabBar))).click();
    driver.findElement(By.xpath(String.format("//a[text()='%s']", option))).click();

    sleep(4000);

    Assert.assertTrue(
        driver.findElement(By.xpath(String.format("//*[text()='%s']", option))).isDisplayed());
    System.out.println(option + " is selected!!!");

  }

  public static void selectFromSideBar(String option) throws InterruptedException {
    WebDriver driver = WebDriverManager.getDriver();

    driver.findElement(By.xpath(String.format("//span[text()='%s']/..", option))).click();
    System.out.println(option + " selected!!!");

    sleep(2000);
  }

}
