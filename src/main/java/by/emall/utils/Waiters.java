package by.emall.utils;

import by.emall.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Waiters {

    public static void waitForVisibility(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(element));
    }
}