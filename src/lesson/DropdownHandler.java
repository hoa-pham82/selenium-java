package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandler {

  public static void handleDropdown() throws InterruptedException {
    WebDriver driver = WebDriverManager.getDriver();

    driver.findElement(By.xpath("//span[text()='Admin']/..")).click();

    System.out.println("Admin clicked!!!!");

    Thread.sleep(2000);

    driver.findElement(By.xpath("//*[text()='Job ']")).click();
    driver.findElement(By.xpath("//a[text()='Job Titles']")).click();

    Thread.sleep(2000);

    if (driver.findElement(By.xpath("//h6[text()= 'Job Titles']")).isDisplayed()) {
      System.out.println("Title is selected");
    } else {
      System.out.println("Test failed!!!!!");
    }

    WebDriverManager.teardown();
  }

}
