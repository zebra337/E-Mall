package by.emall.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegFormPage extends BasePage {

    public RegFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class, 'btn_btn_colour_white')]")
    private WebElement registrationButton;
    @FindBy(xpath = "//input[@autocomplete='given-name']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@autocomplete='family-name']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@autocomplete='additional-name']")
    private WebElement patronymicNameField;
    @FindBy(xpath = "//input[@autocomplete='tel']")
    private WebElement phoneNumberField;
    @FindBy(xpath = "//input[@autocomplete='email']")
    private WebElement mailField;
    @FindBy(xpath = "//input[@id='_r_c_']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='_r_d_']")
    private WebElement rePasswordField;
    @FindBy(xpath = "//span[contains(text(), ') и')]/parent::div//i")
    private WebElement userAgreementCheckBox;
    @FindBy(xpath = "//span[contains(text(), ') с')]/parent::div//i")
    private WebElement userDataCheckBox;
    @FindBy(xpath = "//button[contains(@class, 'scroll_to_bottom')]")
    private WebElement followDownButton;
    @FindBy(xpath = "//label[contains(@class, 'checkbox__PbQ_G')]//i")
    private WebElement checkAllCheckBox;
    @FindBy(xpath = "//div[@class='policy-consent_actions___YqG_']/button[2]")
    private WebElement agreeButton;
    @FindBy(xpath = "//button[contains(@class, 'btn_btn__jx6SQ')]")
    private WebElement nextButton;
    @FindBy(xpath = "//h1[@class='wrapper_title__hxKZS']")
    private WebElement awaitCodeTitle;

    public WebElement getRegistrationButton() {
        return registrationButton;
    }
    public WebElement getFirstNameField() {
        return firstNameField;
    }
    public WebElement getLastNameField() {
        return lastNameField;
    }
    public WebElement getPatronymicNameField() {
        return patronymicNameField;
    }
    public WebElement getPhoneNumberField() {
        return phoneNumberField;
    }
    public WebElement getMailField() {
        return mailField;
    }
    public WebElement getPasswordField() {
        return passwordField;
    }
    public WebElement getRePasswordField() {
        return rePasswordField;
    }
    public WebElement getUserAgreementCheckBox() {
        return userAgreementCheckBox;
    }
    public WebElement getUserDataCheckBox() {
        return userDataCheckBox;
    }
    public WebElement getFollowDownButton() {
        return followDownButton;
    }
    public WebElement getCheckAllCheckBox() {
        return checkAllCheckBox;
    }
    public WebElement getAgreeButton() {
        return agreeButton;
    }
    public WebElement getNextButton() {
        return nextButton;
    }
    public WebElement getAwaitCodeTitle() {
        return awaitCodeTitle;
    }
}
