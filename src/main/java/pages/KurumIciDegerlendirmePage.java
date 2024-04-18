package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class KurumIciDegerlendirmePage {
    private ElementHelper elementHelper;

    public KurumIciDegerlendirmePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private By KurumIciDegerlendirmetitle= By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");
    public void userOnTheKurumIciDegerlendirmePage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/kurum-ic-degerlendirme-raporu");

    }
    public String userShouldSeeKurumIciDegerlendirmeTitleOnKurumIciDegerlendirmePage(){
        return elementHelper.getText(KurumIciDegerlendirmetitle);
    }

}
