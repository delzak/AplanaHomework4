package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Алексей on 24.01.2019
 */
public class TravelAndShopingPage {

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']")
    WebElement title;

    @FindBy(linkText = "Оформить онлайн")
    public WebElement registrationButton;

    public TravelAndShopingPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void findTitle(String titleItem) {
        title.findElement(By.xpath(".//*[text()='" + titleItem + "']")).isEnabled();
    }
}
