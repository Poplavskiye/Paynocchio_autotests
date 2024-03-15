package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RewardingPage {
    @FindBy(css = "button[type='button']")
    private WebElement newRewardingCampaign;
}
