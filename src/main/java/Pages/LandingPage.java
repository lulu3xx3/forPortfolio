package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class LandingPage extends BaseTest {
    WebDriver driver;

    @FindBy (xpath = "//div[@class='panel header']//ul[@class='header links']//li[@class='authorization-link']//a[contains(text(), 'Sign In')]")
    WebElement signInButton;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void openURL(String url){
        driver.get(url);

    }
    public void clickSignInButton(){
        waitForElementToBeClickable(signInButton);
        signInButton.click();
    }

}
