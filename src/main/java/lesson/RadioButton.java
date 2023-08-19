package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RadioButton {

  public static void handleRadioButton() throws InterruptedException {

    Base.selectFromSideBar("Admin");
    Base.selectFromTabBar("Configuration", "Email Configuration");

    WebDriver driver = WebDriverManager.getDriver();
    WebElement smtp = driver.findElement(By.xpath("//*[@value='smtp']"));

    if (!smtp.isSelected()) {
      Actions act = new Actions(driver);
      act.moveToElement(smtp).click().build().perform();
      System.out.println("Sending method SMTP is selected");
    }

    Assert.assertTrue(smtp.isSelected(), "Sending method SMTP is pre-selected");

  }

}
