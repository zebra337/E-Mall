package by.emall.steps;

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

    public void clickRegistrationButton() {
        log.info("Click Registration button");
        regFormPage.getRegistrationButton().click();
    }
    public void setFirstName(String firstName) {
        log.info("Enter First name");
        regFormPage.getFirstNameField().sendKeys(firstName);
    }
    public void setLastName(String lastName) {
        log.info("Enter Last name");
        regFormPage.getLastNameField().sendKeys(lastName);
    }
    public void setPatronymicName(String patronymicName) {
        log.info("Enter Patronymic name");
        regFormPage.getPatronymicNameField().sendKeys(patronymicName);
    }
    public void setPhoneNumber(String phoneNumber) {
        log.info("Enter Phone number");
        regFormPage.getPhoneNumberField().sendKeys(phoneNumber);
    }
    public void setMail(String mail) {
        log.info("Enter eMail");
        regFormPage.getMailField().sendKeys(mail);
    }
    public void setPassword(String password) {
        log.info("Enter Password");
        regFormPage.getPasswordField().sendKeys(password);
    }
    public void setRePassword(String rePassword) {
        log.info("Enter RePassword");
        regFormPage.getRePasswordField().sendKeys(rePassword);
    }
    public void clickUserAgreementCheckBox() {
        log.info("Click User agreement check-box");
        regFormPage.getUserAgreementCheckBox().click();
    }
    public void clickUserDataCheckBox() {
        log.info("Click User data check-box");
        regFormPage.getUserDataCheckBox().click();
    }
    public void clickFollowDownButton() {
        log.info("Click Follow-down button");
        regFormPage.getFollowDownButton().click();
    }
    public void clickCheckAllCheckBox() {
        log.info("Click Check-All check-box");
        Waiters.waitForVisibility(regFormPage.getCheckAllCheckBox());
        regFormPage.getCheckAllCheckBox().click();
    }
    public void clickAgreeButton() {
        log.info("Click Agree button");
        regFormPage.getAgreeButton().click();
    }
    public void clickNextButton() {
        log.info("Click Next button");
        regFormPage.getNextButton().click();
    }
    public String getAwaitCodeTitle() {
        log.info("Get Await code title");
        return regFormPage.getAwaitCodeTitle().getText();
    }
}
