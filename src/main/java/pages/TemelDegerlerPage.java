package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class TemelDegerlerPage {
    private ElementHelper elementHelper;

    public TemelDegerlerPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private By TemelDegerlertitle=By.cssSelector("#wrapper > div > section:nth-child(2) > div > div > div > div > p:nth-child(1) > strong");


    public void userOnTheTemelDegerlerPage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/temel-degerler");

    }
    public String userShouldSeeTemelDegerlerTitle(){
        return elementHelper.getText(TemelDegerlertitle);
    }
}
