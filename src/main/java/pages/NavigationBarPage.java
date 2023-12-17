package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class NavigationBarPage {

    private ElementHelper elementHelper;

    public NavigationBarPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
}
