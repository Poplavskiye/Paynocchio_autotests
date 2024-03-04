package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
