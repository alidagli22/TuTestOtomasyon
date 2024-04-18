package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class KalitePolitikasiPage {
    private ElementHelper elementHelper;
    public KalitePolitikasiPage(WebDriver driver){
        elementHelper=new ElementHelper(driver);
    }
    private By KalitePolitikasi = By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");
    public void userOnTheKalitePolitikasiPage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/kalite-politikamiz");
    }
    public String userShouldSeeKalitePolitikasiTitleOnKalitePolitikasiPage(){
        return elementHelper.getText(KalitePolitikasi);
    }


}
