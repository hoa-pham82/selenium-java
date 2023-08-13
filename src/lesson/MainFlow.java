package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainFlow {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = WebDriverManager.getDriver();

    // Login to HRM system
    Login.handleLogin();
    DropdownHandler.handleDropdown();
    driver.quit();

  }
}
