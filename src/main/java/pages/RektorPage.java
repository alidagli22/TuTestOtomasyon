package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RektorPage {

    private ElementHelper elementHelper;
    private By RektorPicture = By.cssSelector("");
    private By  Title = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");
    private By  = By.ByCssSelector("");



    public RektorPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    public void userOnTheRektorPage() {
        elementHelper.openUrl("https://personel.trakya.edu.tr/erhantabakoglu");
    }

    public void ShouldSeeRektorPicture() {
        elementHelper.checkElement(RektorPicture);
    }

    public String ShouldSeeTitle() {
        return elementHelper.getText(Title);
    }
}

