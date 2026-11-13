package by.emall.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ResourceBundle;

public class DriverManager {

    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");

    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "D:\\0_0_0_Black\\Pzz\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get(bundle.getString("path_to_url"));
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}