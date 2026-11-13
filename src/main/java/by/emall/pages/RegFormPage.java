package by.emall.pages;

import by.emall.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement eMailField;
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

    public void clickRegistrationButton() {
        registrationButton.click();
    }
    public void setFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }
    public void setLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void setPatronymicName(String patronymicName) {
        patronymicNameField.sendKeys(patronymicName);
    }
    public void setPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void setEMail(String eMail) {
        eMailField.sendKeys(eMail);
    }
    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void setRePassword(String rePassword) {
        rePasswordField.sendKeys(rePassword);
    }
    public void clickUserAgreementCheckBox() {
        userAgreementCheckBox.click();
    }
    public void clickUserDataCheckBox() {
        userDataCheckBox.click();
    }
    public void clickFollowDownButton() {
        followDownButton.click();
    }
    public void clickCheckAllCheckBox() {
        Waiters.waitForVisibility(checkAllCheckBox);
        checkAllCheckBox.click();
    }
    public void clickAgreeButton() {
        agreeButton.click();
    }
    public void clickNextButton() {
        nextButton.click();
    }
    public String getAwaitCodeTitle() {
        return awaitCodeTitle.getText();
    }
}
