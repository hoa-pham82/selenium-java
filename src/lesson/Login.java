package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

  public static void handleLogin() throws InterruptedException {

    WebDriver driver = WebDriverManager.getDriver();
    WebDriverManager.setup();

    Thread.sleep(2000);

    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector("[type='submit']")).click();

    Thread.sleep(2000);

    // Assertion
    boolean dashboard = driver.findElement(By.xpath("//h6[text()[contains(., 'Dashboard')]]"))
        .isDisplayed();

    if (dashboard) {
      System.out.println("Login to dashboard successfully");
    } else {
      System.out.println("Login failed!!!!");
    }

  }

}
