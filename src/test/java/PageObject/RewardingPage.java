package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardingPage {
    @FindBy(css = "button[type='button']")
    private WebElement newRewardingCampaign;
    public RewardingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

