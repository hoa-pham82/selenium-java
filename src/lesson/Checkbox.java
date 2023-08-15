package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

  public static void handleCheckbox() {
    WebDriver driver = WebDriverManager.getDriver();
    WebElement firstCheckbox = driver.findElement(
        By.xpath("//input[@value='0']/following-sibling::span"));
    if (!firstCheckbox.isSelected()) {
      firstCheckbox.click();

    }
    System.out.println("The first checkbox is selected");
  }

}
