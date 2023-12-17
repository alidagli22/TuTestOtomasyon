package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RektorPage {

    private ElementHelper elementHelper;
    private By RektorPicture = By.cssSelector("");
    private By  Title = By.cssSelector("");
    private By  RektorName = By.cssSelector("");
    private By  YayinlarTitle = By.cssSelector("");
    private By  BildiriTitle = By.cssSelector("");
    private By  TrakyaUniversitesiButton = By.cssSelector("");
    private By  TrakyaUniversitesiPage = By.cssSelector("");
    private By  PersonelAramaButton = By.cssSelector("");
    private By  PersonelAramaPage = By.cssSelector("");
    private By  DuyuruTakibi = By.cssSelector("");
    private By  DuyuruTakibiPage = By.cssSelector("");






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

    public String ShouldSeeRektorName() {
        return elementHelper.getText(RektorName);
    }

    public void ShouldSeeYayinlarTitle() {
        elementHelper.checkElement(YayinlarTitle);
    }

    public void ShouldSeeBildiriTitle() {
        elementHelper.checkElement(BildiriTitle);
    }

    public void ClickOnTrakyaUniversitesiButton() {
        elementHelper.click(TrakyaUniversitesiButton);
    }

    public void ShouldSeeTrakyaUniversitesiPage() {
        elementHelper.checkElement(TrakyaUniversitesiPage);
    }

    public void ClickOnPersonelAramaButton() {
        elementHelper.click(PersonelAramaButton);
    }

    public void ShouldSeePersonelAramaPage() {
        elementHelper.checkElement(PersonelAramaPage);
    }

    public void ClickOnDuyuruTakibi() {
        elementHelper.click(DuyuruTakibi);
    }

    public void ShouldSeeDuyuruTakibiPage() {
        elementHelper.checkElement(DuyuruTakibiPage);
    }
}

