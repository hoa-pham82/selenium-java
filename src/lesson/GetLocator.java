package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        // Get element by ID
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("how to config docker");
    }
}
