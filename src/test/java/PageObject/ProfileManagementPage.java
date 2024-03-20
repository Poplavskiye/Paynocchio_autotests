package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// page_url = https://cp.dev.paynocchio.com/sign-in/
public class ProfileManagementPage {

    private static WebDriver driver;

    //TODO change ID for all buttons
    @FindBy(css = "input[name='phone']")
    private WebElement phoneNumberIn2faField;
    @FindBy(css = "button[type='submit']")
    private WebElement sendCodeButton;

    @FindBy(css = "button[type='button']")
    private WebElement editPersonalInfoButton;

    public ProfileManagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

