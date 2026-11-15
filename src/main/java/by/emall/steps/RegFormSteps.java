package by.emall.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import by.emall.pages.RegFormPage;
import by.emall.utils.Waiters;
import org.openqa.selenium.WebDriver;

@Log4j2
public class RegFormSteps {

    private RegFormPage regFormPage;

    public RegFormSteps(WebDriver driver) {
        regFormPage = new RegFormPage(driver);
    }

    @Step("Click Registration button")
    public void clickRegistrationButton() {
        log.info("Click Registration button");
        regFormPage.getRegistrationButton().click();
    }
    @Step("Enter First name")
    public void setFirstName(String firstName) {
        log.info("Enter First name");
        regFormPage.getFirstNameField().sendKeys(firstName);
    }
    @Step("Enter Last name")
    public void setLastName(String lastName) {
        log.info("Enter Last name");
        regFormPage.getLastNameField().sendKeys(lastName);
    }
    @Step("Enter Patronymic name")
    public void setPatronymicName(String patronymicName) {
        log.info("Enter Patronymic name");
        regFormPage.getPatronymicNameField().sendKeys(patronymicName);
    }
    @Step("Enter Phone number")
    public void setPhoneNumber(String phoneNumber) {
        log.info("Enter Phone number");
        regFormPage.getPhoneNumberField().sendKeys(phoneNumber);
    }
    @Step("Enter eMail")
    public void setMail(String mail) {
        log.info("Enter eMail");
        regFormPage.getMailField().sendKeys(mail);
    }
    @Step("Enter Password")
    public void setPassword(String password) {
        log.info("Enter Password");
        regFormPage.getPasswordField().sendKeys(password);
    }
    @Step("Enter RePassword")
    public void setRePassword(String rePassword) {
        log.info("Enter RePassword");
        regFormPage.getRePasswordField().sendKeys(rePassword);
    }
    @Step("Enter first name")
    public void clickUserAgreementCheckBox() {
        log.info("Click User agreement check-box");
        regFormPage.getUserAgreementCheckBox().click();
    }
    @Step("Click User agreement check-box")
    public void clickUserDataCheckBox() {
        log.info("Click User data check-box");
        regFormPage.getUserDataCheckBox().click();
    }
    @Step("Click Follow-down button")
    public void clickFollowDownButton() {
        log.info("Click Follow-down button");
        regFormPage.getFollowDownButton().click();
    }
    @Step("Click Check-All check-box")
    public void clickCheckAllCheckBox() {
        log.info("Click Check-All check-box");
        Waiters.waitForVisibility(regFormPage.getCheckAllCheckBox());
        regFormPage.getCheckAllCheckBox().click();
    }
    @Step("Click Agree button")
    public void clickAgreeButton() {
        log.info("Click Agree button");
        regFormPage.getAgreeButton().click();
    }
    @Step("Click Next button")
    public void clickNextButton() {
        log.info("Click Next button");
        regFormPage.getNextButton().click();
    }
    @Step("Get Await code title")
    public String getAwaitCodeTitle() {
        log.info("Get Await code title");
        return regFormPage.getAwaitCodeTitle().getText();
    }
}
