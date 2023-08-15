package lesson;

public class MainFlow {

  public static void main(String[] args) throws InterruptedException {
    // Login to HRM system and check the job title
    Login.handleLogin();
    DropdownHandler.handleDropdown();
  }
}
