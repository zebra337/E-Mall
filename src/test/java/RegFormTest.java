import by.emall.driver.DriverManager;
import by.emall.pages.MainPage;
import by.emall.pages.RegFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegFormTest extends BaseTest {

    protected WebDriver driver;
    private RegFormPage regFormPage;
    private MainPage mainPage;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        mainPage = new MainPage(driver);
        regFormPage = new RegFormPage(driver);
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
        Assert.assertTrue(regFormPage.getAwaitCodeTitle().contains("Введите код"));
    }
}