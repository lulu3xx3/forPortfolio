package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends utils.BaseTest {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailBox;

    @FindBy(id="pass")
    WebElement passwordBox;

    @FindBy(xpath = "//button[@id='send2'] //span")
    WebElement signInButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterCredentials(String email, String password){
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        signInButton.click();


    }

}
