import by.emall.driver.DriverManager;
import by.emall.models.UserData;
import by.emall.pages.MainPage;
import by.emall.pages.RegFormPage;
import by.emall.utils.JsonReader;
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

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegFormData(UserData userData) throws InterruptedException {
        mainPage.clickCloseCookies1Button();
        mainPage.clickCloseCookies2Button();
        mainPage.clickCloseHiButton();
        mainPage.clickConfirmButton();
        mainPage.clickLogInPic();
        regFormPage.clickRegistrationButton();
        regFormPage.setFirstName(userData.getFirstName());
        regFormPage.setLastName(userData.getLastName());
        regFormPage.setPatronymicName(userData.getPatronymicName());
        regFormPage.setPhoneNumber(userData.getPhoneNumber());
        regFormPage.setMail(userData.getMail());
        regFormPage.setPassword(userData.getPassword());
        regFormPage.setRePassword(userData.getRePassword());
        regFormPage.clickUserAgreementCheckBox();
        regFormPage.clickUserDataCheckBox();
        regFormPage.clickFollowDownButton();
        Thread.sleep(1000);
        regFormPage.clickCheckAllCheckBox();
        regFormPage.clickAgreeButton();
        regFormPage.clickNextButton();
        Assert.assertTrue(regFormPage.getAwaitCodeTitle().contains(userData.getAwaitCodeTitle()));
    }
}