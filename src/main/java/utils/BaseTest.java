package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    String OurTab = "Sale";

    By ourTabLocator = By.xpath("//a//span[text()='" + OurTab + "']");

    public void waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    @BeforeMethod
    public void startDriver(){
        if (driver==null){
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
        }
    }


    public void closeDriver() throws InterruptedException {
        if(driver!=null){
            Thread.sleep(3000);
            driver.close();
        }
    }

    public void clickOnDesiredTab(){
        driver.findElement(ourTabLocator).click();
    }

}
