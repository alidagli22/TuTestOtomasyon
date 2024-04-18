package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import java.security.PublicKey;

public class GenelSekreterlikPage {
    private ElementHelper elementHelper;
    public GenelSekreterlikPage(WebDriver driver){elementHelper=new ElementHelper(driver);}


    private By Duyurular =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(1) > div.title");
    private By Gunebakan =By.cssSelector("#s-insert > div:nth-child(2) > div > div > div > ul > li:nth-child(2) > div > table");
    private By  YaziIsleriButton=By.cssSelector("#primary-nav > ul > li:nth-child(1) > a");
    private By BIAhmetGoktasTitle =By.cssSelector("#s-insert > div > div > div > div:nth-child(1) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");
    private By BilgiIslemSerpilGiciTitle=By.cssSelector(".block [href='http://personel.trakya.edu.tr/serpilgici/'] > .color");
    private By BilgiIslemMemurAysecanYavuzTitle=By.cssSelector(".block [href='http://personel.trakya.edu.tr/aysecanyavuz/'] > .color");
    private By YonetimVeSenatoButton =By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/yonetim-ve-senato']");
    private By BilgiIslemAhmetOnderOZTURMENTitle =By.cssSelector(".block [href='http://personel.trakya.edu.tr/ahmetonder/'] > .color");
    private By BilgiIslemCuneytKaptanTitle=By.cssSelector(".block [href='http://personel.trakya.edu.tr/cuneytkaptan/'] > .color");
    private By EBYSEIMZAButton=By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/ebys-e-imza']");
    private By OgrGorGungorIlkizYUKSELTitle =By.cssSelector("#s-insert > div > div > div > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");
    private By SekreteryaButton =By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/sekreterya']");
    private By EvrakKayitButton =By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/evrak-kayit-kep']");
    private By BilgİslAytenGILANTitle =By.cssSelector(".block [href='http://personel.trakya.edu.tr/aytenuyar/'] > .color");
    private By BilgİslCıhatCINARTitle =By.cssSelector(".block [href='http://personel.trakya.edu.tr/cihatcinar/'] > .color");
    private By  OgGorGungorIlkizYUKSELTitle=By.cssSelector(".block [href='http://personel.trakya.edu.tr/ilkizyuksel/'] > .color");
    private By KdrIscOguzBATURTitle =By.cssSelector("#s-insert > div > div > div > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");
    private By AfetVeACilDurumButton =By.cssSelector("#primary-nav > .menut > li:nth-of-type(6) > [href='javascript:void(0);']");
    private By SivilSavunmaButton =By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/sivil-savunma']");
    private By BilgİslHuseyinTurkel =By.cssSelector("#s-insert > div > div > div > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");
    private By BirOgrenciDeSenOkutButton=By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/bir-ogrenci-de-sen-okut']");
    private By OgrGorGungorIlkizYuksel =By.cssSelector("#s-insert > div > div > div > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");
    private By ServisOdasiButton =By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/staff/servis-odasi']");
    private By HizmetliFedaiAKGUNTitle =By.cssSelector("#s-insert > div > div > div > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > a");


    public void userOnTheGenelSekreterlikPage(){
        elementHelper.openUrl("");
    }
    public String userShouldSeeDuyurularTitleOnGenelSekreterlikPage(){
        return elementHelper.getText(Duyurular);
    }
    public void userShouldSeeRadyoGunebakanOnGenelSekreterlikPage(){
         elementHelper.checkElement(Gunebakan);
    }
   public void userClickYaziIsleriButtonOnGenelSekreterlikPage(){elementHelper.click(YaziIsleriButton);}
    public String userShouldSeeBilgiIslemAhmetGöktasTitleInYaziIsleriOnGenelSekreterlikPage(){
        return elementHelper.getText(BIAhmetGoktasTitle);
    }
    public String userShouldSeeBilgiIslemSerpilGiciTitleInYaziIsleriOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgiIslemSerpilGiciTitle);
    }
    public String userShouldSeeBilgiIslemMemurAysecanYavuzTitleInYaziIsleriOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgiIslemMemurAysecanYavuzTitle);
    }
    public void userClickYonetimVeSenatoButtonOnGenelSekreterlikPage(){
        elementHelper.click(YonetimVeSenatoButton);
    }
    public String userShouldSeeBilgiIslemAhmetOnderOZTURMENTitleInYönetimVeSenatoOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgiIslemAhmetOnderOZTURMENTitle);
    }
    public String userShouldSeeBilgiIslemCuneytKaptanTitleInYönetimVeSenatoOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgiIslemCuneytKaptanTitle);
    }
    public void userClickEBYSEIMZAButtonOnGenelSekreterlikPage(){
        elementHelper.click(EBYSEIMZAButton);
    }
    public String userShouldSeeOgrGorGungorIlkizYUKSELTitleInEBYSEIMZAOnOnGenelSekreterlikPage(){
        return elementHelper.getText(OgrGorGungorIlkizYUKSELTitle);
    }
    public void userClickSekreteryaButtonOnGenelSekreterlikPage(){
        elementHelper.click(SekreteryaButton);
    }
    public String userShouldSeeKdrIscOguzBATURTitleInSekreteryaOnGenelSekreterlikPage(){
        return elementHelper.getText(KdrIscOguzBATURTitle);
    }


    public void userClickEvrakKayitButtonOnGenelSekreterlikPage(){
        elementHelper.click(EvrakKayitButton);
    }
    public String userShouldSeeBilgİslAytenGILANTitleInEvrakKayitOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgİslAytenGILANTitle);
    }
    public String userShouldSeeBilgİslCıhatCINARTitleInEvrakKayitOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgİslCıhatCINARTitle);
    }
    public String userShouldSeeOgrGorGungorIlkizYUKSELTitleInEvrakKayitOnGenelSekreterlikPage(){
        return elementHelper.getText(OgGorGungorIlkizYUKSELTitle);
    }
    public void userClickAfetVeACilDurumButtonOnGenelSekreterlikPage(){
        elementHelper.click(AfetVeACilDurumButton);
    }
    public void userClickSivilSavunmaButtonOnGenelSekreterlikPage(){
        elementHelper.click(SivilSavunmaButton);
    }
    public String userShouldSeeBilgİslHuseyinTurkelTitleInSivilSavunmaOnGenelSekreterlikPage(){
        return elementHelper.getText(BilgİslHuseyinTurkel);
    }
    public void userClickBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage(){
        elementHelper.click(BirOgrenciDeSenOkutButton);
    }
    public String userShouldSeeOgrGorGungorIlkizYukselTitleInBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage(){
        return elementHelper.getText(OgrGorGungorIlkizYuksel);
    }
    public void userClickServisOdasiButtonOnGenelSekreterlikPage(){
        elementHelper.click(ServisOdasiButton);
    }
    public String userShouldSeeHizmetliFedaiAKGUNTitleInServisOdasiOnGenelSekreterlikPage(){
        return elementHelper.getText(HizmetliFedaiAKGUNTitle);
    }



}
