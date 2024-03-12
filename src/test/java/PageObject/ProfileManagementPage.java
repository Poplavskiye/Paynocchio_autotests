package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.codeborne.selenide.Selenide.$;

// page_url = https://cp.dev.paynocchio.com/sign-in/
public class ProfileManagementPage {

    private static WebDriver driver;

    @FindBy(css = "button[type='submit']")
    private WebElement sendCodeButton;

    public ProfileManagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

