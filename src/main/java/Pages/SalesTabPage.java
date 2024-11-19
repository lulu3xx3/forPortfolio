package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesTabPage extends utils.BaseTest {
    WebDriver driver;

    @FindBy(css = "ul[class='items'] li[class='item'] a")
    List<WebElement> itemCategory;

    public SalesTabPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void findDesiredCategory(String itemType){
        itemCategory.stream().filter(s->s.getText().contains(itemType)).findFirst().ifPresent(WebElement::click);


    }
}
