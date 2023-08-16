package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

  public static void handleRadioButton() throws InterruptedException {

    Base.selectFromSideBar("Admin");
    Base.selectFromTabBar("Configuration", "Email Configuration");

    WebDriver driver = WebDriverManager.getDriver();
    WebElement smtp = driver.findElement(By.xpath("//*[@value='smtp']/following-sibling::span"));

    if (!smtp.isSelected()) {
      smtp.click();
      System.out.println("Sending method SMTP is selected");
    } else {
      System.out.println("Sending method SMTP is pre-selected");

    }

  }

}
