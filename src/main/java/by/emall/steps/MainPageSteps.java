package by.emall.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import by.emall.pages.MainPage;
import org.openqa.selenium.WebDriver;

@Log4j2
public class MainPageSteps {

    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        mainPage = new MainPage(driver);
    }

    @Step("Close all tech messages")
    public void closeAllTechMessages() {
        log.info("Click Close cookies1 button");
        mainPage.getCloseCookies1Button().click();
        log.info("Click Close cookies2 button");
        mainPage.getCloseCookies2Button().click();
        log.info("Click Close Hi button");
        mainPage.getCloseHiButton().click();
        log.info("Click Confirm button");
        mainPage.getConfirmButton().click();
    }

    @Step("Click LogIn pic")
    public void clickLogInPic() {
        log.info("Click LogIn pic");
        mainPage.getLogInPic().click();
    }
}
