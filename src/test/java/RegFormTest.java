import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegFormTest {
    @Test
    public void checkRegFormData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\0_0_0_Black\\Pzz\\chromedriver.exe");
        driver.get("https://emall.by");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        WebElement closeCookies1 = driver.findElement(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]"));
        closeCookies1.click();

        WebElement closeCookies2 = driver.findElement(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]"));
        closeCookies2.click();

        WebElement closeHi = driver.findElement(By.xpath("//button[contains(@class, 'KB1 banner_button')]"));
        closeHi.click();

        WebElement confirmButton = driver.findElement(By.xpath("//button[contains(@class, 'content_confirm_button')]"));
        confirmButton.click();

        WebElement logInPic = driver.findElement(By.xpath("//a[@href='https://emall.by/login?backurl=/']/i"));
        logInPic.click();

        WebElement registrationButton = driver.findElement(By.xpath("//button[contains(@class, 'btn_btn_colour_white')]"));
        registrationButton.click();

      driver.quit();
    }
}