import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegTest {
    @Test
    public void checkRegistrationFormData() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\0_0_0_Black\\Pzz\\chromedriver.exe");
        driver.get("https://emall.by");
        driver.manage().window().maximize();
    }
}