package lesson;

public class MainFlow {

  public static void main(String[] args) throws InterruptedException {
    // Setup
    WebDriverManager.setup();
    Login.handleLogin();

//     Test
//    DropdownHandler.handleDropdown();
//    Checkbox.handleCheckbox();
    RadioButton.handleRadioButton();

    // Teardown
    WebDriverManager.teardown();
  }
}
