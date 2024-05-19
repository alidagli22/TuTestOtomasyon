package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class KurumsalKimlikPage {
    private ElementHelper elementHelper;
    public KurumsalKimlikPage(WebDriver driver){elementHelper=new ElementHelper(driver);}

    private By LogoIndirme =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div.title");
    private By NormalKullanim =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(1) > div > strong");
    private By NormalKullanimIngilizce =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(2) > div > strong");
    private By YatayKullanim =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > strong");
    private By YatayKullanimIngilizce =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(2) > div > strong");
    private By KurumsalKimlikRehberi =By.cssSelector("#primary-nav > ul > li:nth-child(1) > a");
    private By Anasayfa =By.cssSelector("#primary-nav > ul > li:nth-child(2) > a");
    private By BirimLogolari =By.cssSelector("#primary-nav > ul > li:nth-child(3) > a");
    private By BizeUlasin =By.cssSelector("#primary-nav > ul > li:nth-child(4) > a");
    private By TrakyaUniversitesiButton =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(1) > a");
    private By SSS =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.rss > a");
    private By Twitter =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.twitter > a");
    private By Facebook =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.facebook > a");
    private By Youtube =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.youtube > a");

    public void userOnTheKurumsalKimlikPage(){elementHelper.openUrl("https://kurumsalkimlik.trakya.edu.tr/");}
    public String userShouldSeeLogoIndirmeTitleOnKurumsalKimlikPage(){return elementHelper.getText(LogoIndirme);}
    public String userShouldSeeNormalKullanimTitleOnKurumsalKimlikPage(){return elementHelper.getText(NormalKullanim);}

    public String userShouldSeeNormalKullanimIngilizceTitleOnKurumsalKimlikPage(){return elementHelper.getText(NormalKullanimIngilizce);}
    public String userShouldSeeYatayKullanimTitleOnKurumsalKimlikPage(){return elementHelper.getText(YatayKullanim);}
    public String userShouldSeeYatayKullanimIngilizceTitleOnKurumsalKimlikPage(){return elementHelper.getText(YatayKullanimIngilizce);}
    public void userClickOnKurumsalKimlikRehberiButton(){elementHelper.click(KurumsalKimlikRehberi);}
    public void userClickOnAnasayfaButton(){elementHelper.click(Anasayfa);}
    public void userClickOnBirimLogolariButton(){elementHelper.click(BirimLogolari);}
    public void userClickOnBizeUlasinButton(){elementHelper.click(BizeUlasin);}
    public void userClickOnTrakyaUniversitesiButtonButton(){elementHelper.click(TrakyaUniversitesiButton);}
    public String userShouldSeeSSSTitleOnKurumsalKimlikPage(){return elementHelper.getText(SSS);}
    public String userShouldSeeTwitterTitleOnKurumsalKimlikPage(){return elementHelper.getText(Twitter);}
    public String userShouldSeeFacebookTitleOnKurumsalKimlikPage(){return elementHelper.getText(Facebook);}
    public String userShouldSeeYoutubeTitleOnKurumsalKimlikPage(){return elementHelper.getText(Youtube);}




}
