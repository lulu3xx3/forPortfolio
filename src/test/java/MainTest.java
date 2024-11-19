import Pages.LoginPage;
import Pages.SalesTabPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import Pages.LandingPage;

import java.util.Objects;

public class MainTest extends BaseTest {


    @Test
    public void mainTest(){
        String desiredTab = "Shorts";
        LandingPage landingPage = new LandingPage(driver);
        landingPage.openURL("https://magento.softwaretestingboard.com/");
        landingPage.clickSignInButton();
        Assert.assertEquals(driver.getTitle(),"Customer Login");
        LoginPage loginPage = new LoginPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        loginPage.enterCredentials("jm.varun222@gmail.com","#hm&M$^,,?\"b5.W");
        Assert.assertEquals(driver.getTitle(),"Home Page");
        clickOnDesiredTab();
        Assert.assertEquals(driver.getTitle(),"Sale");
        SalesTabPage salesTabPage = new SalesTabPage(driver);
        salesTabPage.findDesiredCategory(desiredTab);
        Assert.assertTrue(Objects.requireNonNull(driver.getTitle()).contains(desiredTab));
    }
}
