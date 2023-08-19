package lesson;

import org.testng.annotations.Test;

public class MainFlow {

  @Test
  void test() throws InterruptedException {
//    Setup
    WebDriverManager.setup();
    Login.handleLogin();

//    Test
//    DropdownHandler.handleDropdown();
//    Checkbox.handleCheckbox();
    RadioButton.handleRadioButton();

//    teardown
    WebDriverManager.teardown();
  }

}

