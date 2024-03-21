package PageObject;
import com.example.paynocchio_autotests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

// page_url = https://cp.dev.paynocchio.com/sign-in/
public class ProfileManagementPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ProfileManagementPage.class));
    @FindBy(css = "input[id=\":r4:\"]")
    private WebElement phoneNumberIn2faField;
    @FindBy(css = "button[id='btn-2fa-send-code']")
    private WebElement sendCodeButton;

    @FindBy(css = "button[id='btn-personal-edit']")
    private WebElement editPersonalInfoButton;
    @FindBy(css = "div[class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters" +
            " MuiListItemButton-root MuiListItemButton-gutters css-1kisfmx']")
    private WebElement logoutButton;

    public ProfileManagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnLogoutButton() {
        logoutButton.click();
        LOG.info("Click on logout button");

    }
}

