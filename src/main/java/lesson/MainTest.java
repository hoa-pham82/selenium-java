package lesson;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {

  @BeforeClass
  public void setUp() throws InterruptedException {
    WebDriverManager.setup("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Login.handleLogin();
  }

  @Test()
  void handleRadioBtn() throws InterruptedException {
    RadioButton.handleRadioButton();
  }

  @Test
  void handleDropdown() throws InterruptedException {
    DropdownHandler.handleDropdown();
    Checkbox.handleCheckbox();
  }

  @AfterClass
  public void tearDown() {
    WebDriverManager.teardown();
  }

}

