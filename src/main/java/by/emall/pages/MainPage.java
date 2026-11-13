package by.emall.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(@class, 'colour_white__FyCpn')]")
    private WebElement closeCookies1Button;
    @FindBy(xpath = "//button[contains(@class, 'colour_white__FyCpn')]")
    private WebElement closeCookies2Button;
    @FindBy(xpath = "//button[contains(@class, 'KB1 banner_button')]")
    private WebElement closeHiButton;
    @FindBy(xpath = "//button[contains(@class, 'content_confirm_button')]")
    private WebElement confirmButton;

    @FindBy(xpath = "//a[@href='https://emall.by/login?backurl=/']/i")
    private WebElement logInPic;

    public void clickCloseCookies1Button() {
        closeCookies1Button.click();
    }
    public void clickCloseCookies2Button() {
        closeCookies2Button.click();
    }
    public void clickCloseHiButton() {
        closeHiButton.click();
    }
    public void clickConfirmButton() {
        confirmButton.click();
    }

    public void clickLogInPic() {
        logInPic.click();
    }
}
