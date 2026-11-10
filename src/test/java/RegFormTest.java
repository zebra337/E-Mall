import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegFormTest {
    @Test
    public void checkRegFormData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\0_0_0_Black\\Pzz\\chromedriver.exe");
        driver.get("https://emall.by");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        WebElement closeCookies1 = driver.findElement(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]"));
        closeCookies1.click();

        WebElement closeCookies2 = driver.findElement(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]"));
        closeCookies2.click();

        WebElement closeHi = driver.findElement(By.xpath("//button[contains(@class, 'KB1 banner_button')]"));
        closeHi.click();

        WebElement confirmButton = driver.findElement(By.xpath("//button[contains(@class, 'content_confirm_button')]"));
        confirmButton.click();

        WebElement logInPic = driver.findElement(By.xpath("//a[@href='https://emall.by/login?backurl=/']/i"));
        logInPic.click();

        WebElement registrationButton = driver.findElement(By.xpath("//button[contains(@class, 'btn_btn_colour_white')]"));
        registrationButton.click();

        WebElement firstNameField = driver.findElement(By.xpath("//input[@autocomplete='given-name']"));
        firstNameField.sendKeys("Sasha");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@autocomplete='family-name']"));
        lastNameField.sendKeys("Sashin");

        WebElement patronymicNameField = driver.findElement(By.xpath("//input[@autocomplete='additional-name']"));
        patronymicNameField.sendKeys("Sashevich");

        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@autocomplete='tel']"));
        phoneNumberField.sendKeys("259999999");

        WebElement eMailField = driver.findElement(By.xpath("//input[@autocomplete='email']"));
        eMailField.sendKeys("aa@aa.aa");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='_r_c_']"));
        passwordField.sendKeys("As000000");

        WebElement rePasswordField = driver.findElement(By.xpath("//input[@id='_r_d_']"));
        rePasswordField.sendKeys("As000000");

        WebElement userAgreementCheckBox = driver.findElement(By.xpath("//span[contains(text(), ') и')]/parent::div//i"));
        userAgreementCheckBox.click();

        WebElement userDataCheckBox = driver.findElement(By.xpath("//span[contains(text(), ') с')]/parent::div//i"));
        userDataCheckBox.click();

        WebElement followDownButton = driver.findElement(By.xpath("//button[contains(@class, 'scroll_to_bottom')]"));
        followDownButton.click();
        Thread.sleep(1000);

        WebElement checkAllCheckBox = driver.findElement(By.xpath("//label[contains(@class, 'checkbox__PbQ_G')]//i"));
        checkAllCheckBox.click();

        WebElement agreeButton = driver.findElement(By.xpath("//div[@class='policy-consent_actions___YqG_']/button[2]"));
        agreeButton.click();

        WebElement nextButton = driver.findElement(By.xpath("//button[contains(@class, 'btn_btn__jx6SQ')]"));
        nextButton.click();

        WebElement userDataText = driver.findElement(By.xpath("//h1[@class='wrapper_title__hxKZS']"));
        Assert.assertTrue(userDataText.getText().contains("Введите код"));

      driver.quit();
    }
}