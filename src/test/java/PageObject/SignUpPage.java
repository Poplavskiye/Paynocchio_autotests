package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page_url = https://cp.dev.paynocchio.com/sign-up/
public class SignUpPage {
    @FindBy(xpath = "//*[@id=\":rb:\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[@id=\":rc:\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[@id=\":rd:\"]")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id=\":rf:\"]")
    private WebElement phoneField;
    @FindBy(xpath = "//*[@id=\":rg:\"]\n")
    private WebElement organizationNameField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div/form/div/div[7]/span/input")
    private WebElement checkboxTermsAndCond;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div/form/div/div[8]/button\n")
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
        checkboxTermsAndCond.submit();
        continueButton.submit();
    }
    public void sendKeyPassword(String text) {
        passwordField.sendKeys(text);
    }
    public void sendKeyConfirmPassword(String text) {
        confirmPassword.sendKeys(text);
    }
}
