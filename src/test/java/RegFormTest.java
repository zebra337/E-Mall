import by.emall.driver.DriverManager;
import by.emall.models.UserData;
import by.emall.steps.MainPageSteps;
import by.emall.steps.RegFormSteps;
import by.emall.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegFormTest extends BaseTest {

    protected WebDriver driver;
    private MainPageSteps mainPageSteps;
    private RegFormSteps regFormSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        mainPageSteps = new MainPageSteps(driver);
        regFormSteps = new RegFormSteps(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegFormData(UserData userData) throws InterruptedException {
        mainPageSteps.clickCloseCookies1Button();
        mainPageSteps.clickCloseCookies2Button();
        mainPageSteps.clickCloseHiButton();
        mainPageSteps.clickConfirmButton();
        mainPageSteps.clickLogInPic();
        regFormSteps.clickRegistrationButton();
        regFormSteps.setFirstName(userData.getFirstName());
        regFormSteps.setLastName(userData.getLastName());
        regFormSteps.setPatronymicName(userData.getPatronymicName());
        regFormSteps.setPhoneNumber(userData.getPhoneNumber());
        regFormSteps.setMail(userData.getMail());
        regFormSteps.setPassword(userData.getPassword());
        regFormSteps.setRePassword(userData.getRePassword());
        regFormSteps.clickUserAgreementCheckBox();
        regFormSteps.clickUserDataCheckBox();
        regFormSteps.clickFollowDownButton();
        Thread.sleep(1000);
        regFormSteps.clickCheckAllCheckBox();
        regFormSteps.clickAgreeButton();
        regFormSteps.clickNextButton();
        Assert.assertTrue(regFormSteps.getAwaitCodeTitle().contains(userData.getAwaitCodeTitle()));
    }
}