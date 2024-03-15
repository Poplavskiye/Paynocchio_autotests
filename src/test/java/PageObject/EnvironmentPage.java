package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironmentPage {
    @FindBy(css = "button[type='button']")
    private WebElement newEnvironment;
}
