package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HesapVerebilirlikPage {
    private ElementHelper elementHelper;

    public HesapVerebilirlikPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private By HesapVerebilirliktitle=By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");

    public void userOnTheHesapverebilirlikPolitikasiPage() {
        elementHelper.openUrl("https://www.trakya.edu.tr/hesap-verilebilirlik-politikasi");

    }
    public String userShouldSeeHesapVerebilirlikPolitikasıTitle(){
        return elementHelper.getText(HesapVerebilirliktitle);
    }



}
