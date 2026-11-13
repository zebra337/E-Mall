import by.emall.driver.DriverManager;
import by.emall.models.UserData;
import by.emall.pages.MainPage;
import by.emall.pages.RegFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {new UserData("Sasha", "Sashin", "Sashevich", "259999999", "aa@aa.aa", "As000000", "As000000", "Введите код")}
        };
    }

    @Test(dataProvider = "data-provider")
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
        regFormPage.setEMail(userData.getEMail());
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