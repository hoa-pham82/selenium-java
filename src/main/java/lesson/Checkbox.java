package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import support.WebDriverManager;

public class Checkbox {

  public static void handleCheckbox() {
    WebDriver driver = WebDriverManager.getDriver();
    WebElement firstCheckbox = driver.findElement(
        By.xpath("//input[@value='0']"));

    if (!firstCheckbox.isSelected()) {
      Actions act = new Actions(driver);
      act.moveToElement(firstCheckbox).click().build().perform();
    }

    Assert.assertTrue(firstCheckbox.isSelected(), "Checkbox is not checked as expected!!");
    System.out.println("The first option is checked as: " + firstCheckbox.isSelected());

  }
}
