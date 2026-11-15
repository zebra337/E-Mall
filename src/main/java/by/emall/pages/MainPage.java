package by.emall.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
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

    public WebElement getCloseCookies1Button() {
        return closeCookies1Button;
    }
    public WebElement getCloseCookies2Button() {
        return closeCookies2Button;
    }
    public WebElement getCloseHiButton() {
        return closeHiButton;
    }
    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getLogInPic() {
        return logInPic;
    }
}
