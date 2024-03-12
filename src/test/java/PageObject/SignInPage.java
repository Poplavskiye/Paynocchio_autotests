package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.codeborne.selenide.Selenide.$;

// page_url = https://cp.dev.paynocchio.com/sign-in/
public class SignInPage {
    private static WebDriver driver;
    @FindBy(css = "input[name='email']")
    private WebElement emailField;
    @FindBy(css = "input[name='password']")
    private WebElement passwordField;
    @FindBy(css = "button[tabindex='0']")
    private WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[3]/p")
    private WebElement forgotPasswordButton;
    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void sendKey(){
        System.out.println("Email and password inputed: \"i.poplavsky+29@paynocchio.com\"," +
                " \"Qwerye1!2345\"");
    }
    public void sendKeyEmail(String text) {
        emailField.sendKeys(text);
    }
    public void sendKeyPassword(String text) {
        passwordField.sendKeys(text);
    }
    public void submit(){
        continueButton.submit();
    }
}