package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://cp.dev.paynocchio.com/sign-in/
public class SignInPage {
    @FindBy(xpath = "//*[@id=\":r8:\"]")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id=\"outlined-adornment-password-login\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[4]/button")
    private WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[3]/p")
    private WebElement forgotPasswordButton;
}
