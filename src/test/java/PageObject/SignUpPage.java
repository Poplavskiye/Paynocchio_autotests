package PageObject;

import com.example.paynocchio_autotests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

//page_url = https://cp.dev.paynocchio.com/sign-up/
public class SignUpPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ProfileManagementPage.class));
    @FindBy(css = "input[name='firstName']")
    private WebElement firstNameField;
    @FindBy(css = "input[name='lastName']")
    private WebElement lastNameField;
    @FindBy(css = "input[name='email']")
    private WebElement emailField;
    @FindBy(css = "input[name='phone']")
    private WebElement phoneField;
    @FindBy(css = "input[name='organizationName']")
    private WebElement organizationNameField;
    @FindBy(css = "input[name='termOfUse']")
    private WebElement checkboxTermsAndCond;
    @FindBy(css = "button[type='button']")
    private WebElement continueButton;

    @FindBy(css = "input[name='password']")
    private WebElement passwordField;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPassword;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void sendKeyFirstName(String text){
        firstNameField.sendKeys(text);
        LOG.info("Input first name");
    }
    public void sendKeyLastName(String text) {
        lastNameField.sendKeys(text);
    }
    public void sendKeyEmail(String text) {
        emailField.sendKeys(text);
    }
    public void sendKeyPhone(String text) {
        phoneField.sendKeys(text);
    }
    public void sendKeyOrganization(String text) {
        organizationNameField.sendKeys(text);
    }
    public void submit() {
        //TODO verify submit or click on checkbox required
        checkboxTermsAndCond.click();
        continueButton.submit();
    }
    public void sendKeyPassword(String text) {
        passwordField.sendKeys(text);
        confirmPassword.sendKeys(text);
    }
}
