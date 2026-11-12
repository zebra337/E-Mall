import by.emall.pages.MainPage;
import by.emall.pages.RegFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegFormTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private RegFormPage regFormPage;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        System.setProperty("webdriver.chrome.driver", "D:\\0_0_0_Black\\Pzz\\chromedriver.exe");
        driver.get("https://emall.by");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        regFormPage = new RegFormPage(driver, wait);
        mainPage = new MainPage(driver, wait);
    }

    @Test
    public void checkRegFormData() throws InterruptedException {

        mainPage.clickCloseCookies1Button();
        mainPage.clickCloseCookies2Button();
        mainPage.clickCloseHiButton();
        mainPage.clickConfirmButton();
        mainPage.clickLogInPic();
        regFormPage.clickRegistrationButton();
        regFormPage.setFirstName("Sasha");
        regFormPage.setLastName("Sashin");
        regFormPage.setPatronymicName("Sashevich");
        regFormPage.setPhoneNumber("259999999");
        regFormPage.setEMail("aa@aa.aa");
        regFormPage.setPassword("As000000");
        regFormPage.setRePassword("As000000");
        regFormPage.clickUserAgreementCheckBox();
        regFormPage.clickUserDataCheckBox();
        regFormPage.clickFollowDownButton();
        Thread.sleep(1000);
        regFormPage.clickCheckAllCheckBox();
        regFormPage.clickAgreeButton();
        regFormPage.clickNextButton();
        Assert.assertTrue(regFormPage.getAwaitCodeTitle().getText().contains("Введите код"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}