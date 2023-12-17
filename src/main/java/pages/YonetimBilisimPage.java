package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class YonetimBilisimPage {
    private ElementHelper elementHelper;

    public YonetimBilisimPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

}
