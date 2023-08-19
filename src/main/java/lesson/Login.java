package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {

  public static void handleLogin() throws InterruptedException {

    WebDriver driver = WebDriverManager.getDriver();

    Thread.sleep(2000);

    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector("[type='submit']")).click();

    Thread.sleep(2000);

    // Assertion
    boolean dashboard = driver.findElement(By.xpath("//h6[text()[contains(., 'Dashboard')]]"))
        .isDisplayed();

    Assert.assertTrue(dashboard, "Login failed!!!!");
    System.out.println("Login to dashboard successfully");

  }
}
