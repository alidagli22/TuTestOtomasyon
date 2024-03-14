package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class TarihcePage {
    private ElementHelper elementHelper;

    public TarihcePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private By Tarihcetitle= By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");
    public void userOnTheTarihcePage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/tarihce");

    }
    public String userShouldSeeTarihceTitleOnTarihcePage(){
        return
                elementHelper.getText(Tarihcetitle);
    }
}
