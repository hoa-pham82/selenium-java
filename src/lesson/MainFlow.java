package lesson;

import org.openqa.selenium.WebDriver;

public class MainFlow {

  public static void main(String[] args) throws InterruptedException {
    // Setup

    WebDriver driver = WebDriverManager.getDriver();
    WebDriverManager.setup();

    // Test
    Login.handleLogin();
    DropdownHandler.handleDropdown();
    Checkbox.handleCheckbox();

    // Teardown
    WebDriverManager.teardown();
  }
}
