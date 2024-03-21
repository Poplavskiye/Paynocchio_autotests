package PageObject;

import com.example.paynocchio_autotests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

// page_url = https://cp.dev.paynocchio.com/sign-in/
public class SignInPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ProfileManagementPage.class));
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
    public void sendKeyEmail(String text) {
        emailField.sendKeys(text);
        LOG.info("Input email");
    }
    public void sendKeyPassword(String text) {
        passwordField.sendKeys(text);
        LOG.info("Input password");
    }
    public void submit(){
        continueButton.submit();
        LOG.info("Click on 'Continue' button");
    }
}