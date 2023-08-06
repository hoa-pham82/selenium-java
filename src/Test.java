import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
//        options.setBrowserVersion("117");
        String driverPath = SeleniumManager.getInstance().getDriverPath(options, false ).driverPath;
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://github.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println(driverPath);
        driver.quit();
}}