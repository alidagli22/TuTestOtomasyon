package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RektorPage {

    private ElementHelper elementHelper;
    private By RektorPicture = By.cssSelector("[src='//bys.trakya.edu.tr/cache/img-thumb/4/40/404/4042/4042576199c501bb4aef9461fc0a00d7.png']");
    private By  Title = By.cssSelector("#pw_biyografi");
    private By  RektorName = By.cssSelector("#nln");
    private By  YayinlarTitle = By.cssSelector("#pw_yayinlar");
    private By  BildiriTitle = By.cssSelector("#body-layout div:nth-of-type(4) p");
    private By  TrakyaUniversitesiButton = By.cssSelector(".header-left-menu [href='http://www.trakya.edu.tr']");
    private By  PersonelAramaPage = By.cssSelector(".header-left-menu li:nth-of-type(2)");
    private By  DuyuruTakibi = By.cssSelector(".header-left-menu li:nth-of-type(3)");






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

    public String ShouldSeeTrakyaUniversitesiPage() {
        return elementHelper.getUrl();
    }

    public void   ClickOnPersonelAramaButton() {
        elementHelper.checkElement(PersonelAramaPage);
    }

    public String  ShouldSeePersonelAramaPage() {
        return  elementHelper.getUrl();

    }

    public void ClickOnDuyuruTakibi() {
        elementHelper.click(DuyuruTakibi);
    }

    public String  ShouldSeeDuyuruTakibiPage() {
        return elementHelper.getUrl();
    }
}

