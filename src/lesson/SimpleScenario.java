package lesson;


import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScenario {

  public static void main(String[] args) throws InterruptedException {

    // Add Employee on Orange HRM system
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    Thread.sleep(2000);

    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Admin");

    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("admin123");

    WebElement loginBtn = driver.findElement(By.cssSelector("[type='submit']"));
    loginBtn.click();

    Thread.sleep(2000);

    // Assertion
    Boolean dashboard = driver.findElement(By.xpath("//h6[text()[contains(., 'Dashboard')]]"))
        .isDisplayed();

    if (dashboard) {
      System.out.println("This test is pass");
    } else {
      System.out.println("This test is fail");
    }

    driver.quit();

  }
}
