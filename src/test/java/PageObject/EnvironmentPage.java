package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvironmentPage {
    @FindBy(css = "button[type='button']")
    private WebElement newEnvironment;
    public EnvironmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

