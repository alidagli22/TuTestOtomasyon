package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BilgiIslemPage {
    private ElementHelper elementHelper;
    public BilgiIslemPage(WebDriver driver){elementHelper=new ElementHelper(driver);}

    private By Duyurular =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(2) > div.title");
    private By USOMDuyurular =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(3) > div.title");
    private By HaberlerTitle =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(4) > div.title");
    private By HaberArsiviTitle =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div:nth-child(5) > div.title");
    private By BIDBTanitim =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(1) > div > table > tbody > tr > td:nth-child(2) > a");
    private By TeknikDestekTalepFormu =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(2) > div > table > tbody > tr > td:nth-child(2) > a");
    private By Formlar =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(3) > div");
    private By AkademikLisans  =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(4) > div > table > tbody > tr > td:nth-child(2) > a");
    private By EgitimVideolari =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(5) > div > table > tbody > tr > td:nth-child(2) > a");
    private By KullanimKilavuzlari =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(6) > div > table > tbody > tr > td:nth-child(2) > a");
    private By KurumIciDahiliTelefonGorusmeSistemi =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(7) > div > table > tbody > tr > td:nth-child(2) > a");
    private By EDUROM  =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(8) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By BilgiGuvenligiFarkindalikEgitimiSunusu =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(9) > div > table > tbody > tr > td:nth-child(2) > a");
    private By BireyselSiberGuvenlikOnlemleri =By.cssSelector("#f-insert > div > div > div:nth-child(1) > div > ul > li:nth-child(10) > div > table > tbody > tr > td:nth-child(2) > a");
    private By UzaktanYardim =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(1) > div > table > tbody > tr > td:nth-child(2) > a");
    private By EBYSPortal =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(2) > div > table > tbody > tr > td:nth-child(2) > a");
    private By YazismalardaKullanilacakUsulVeEsaslar =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(3) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By EBYSDestekTalepFormu =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(4) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By MobilImza =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(5) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By EPostaKurulumAyarlari =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(6) > div > table > tbody > tr > td:nth-child(1) > a > img");
    private By EPostaVeSifreSifirlama =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(7) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By ULAKNETBaglantiDurumu =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(10) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By KutuphaneVeritabaniIcinUzaktanErisim =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(11) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By RadyoGunebakan =By.cssSelector("#s-insert > div:nth-child(2) > div > div:nth-child(1) > div > ul > li:nth-child(12) > div > table > tbody > tr > td:nth-child(2) > a");
    private By ElektronikPanolar =By.cssSelector("#f-insert > div > div > div:nth-child(2) > div.title");
    private By ElektronikPano =By.cssSelector("#f-insert > div > div > div:nth-child(2) > div.content > ul > li:nth-child(1) > div > table > tbody > tr > td:nth-child(2) > a > span:nth-child(1)");
    private By TumEkranlar =By.cssSelector("#f-insert > div > div > div:nth-child(2) > div.content > ul > li:nth-child(2) > div > table > tbody > tr > td:nth-child(2)");
    private By Kurallar =By.cssSelector("#f-insert > div > div > div:nth-child(3) > div.title");
    private By Baglantilar =By.cssSelector("#f-insert > div > div > div:nth-child(4) > div.title");
    private By AnasayfaTitle =By.cssSelector("#primary-nav > ul > li:nth-child(1) > a");
    private By TanitimKatalogu =By.cssSelector("#primary-nav > ul > li:nth-child(3) > a");
    private By FaaliyetRaporlari =By.cssSelector("#primary-nav > ul > li:nth-child(4) > a");
    private By Istatistikler =By.cssSelector("#primary-nav > ul > li:nth-child(6) > a");
    private By SSSTitle =By.cssSelector("#primary-nav > ul > li:nth-child(7) > a");
    private By BaskanligimizTitle =By.cssSelector("#primary-nav > ul > li.selected > a");
    private By Baskanligimiz =By.cssSelector("#primary-nav > ul > li.selected > a");
    private By GorevVeSorumluluklar =By.cssSelector("#primary-nav > ul > li.selected > ul > li:nth-child(1) > a");
    private By OrganizasyonSemasi =By.cssSelector("#primary-nav > ul > li.selected > ul > li:nth-child(2) > a");
    private By GuvenligiYonetimSistemi =By.cssSelector("#primary-nav > ul > li.selected > a");
    private By BilgiGuvenligiYonetimSistemi =By.cssSelector("#primary-nav > ul > li.selected > a");
    private By BGYSKapsamiVePolitikasi =By.cssSelector("#primary-nav > ul > li.selected > ul > li:nth-child(1) > a");
    private By BilgiGuvenligiPolitikamizTitle =By.cssSelector("#primary-nav > ul > li.selected > ul > li:nth-child(2) > a");
    private By BGYSKUygulamaPolitikalarimiz =By.cssSelector("#primary-nav > ul > li.selected > ul > li:nth-child(3) > a");
    private By TrakyaUniversitesiTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(1) > a");
    private By Hakkimizda =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(2) > a");
    private By MisyonVizyonTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(3) > a");
    private By Degerler =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(4) > a");
    private By PersonelimizTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(5) > a");
    private By IcKontrolSistemi =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(6) > a");
    private By IcKontrolMevzuatTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(6) > ul > li:nth-child(1) > a");
    private By IcKontrolSistemiTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(6) > ul > li:nth-child(2) > a");
    private By StratrjikYonetimBilgiSistemiTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(7) > a");
    private By KaliteTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > a");
    private By KaliteButton =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > a");
    private By TUKalitePolitikasi =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(1) > a");
    private By BirimKaliteKomisyonuVeKaliteTemsilcileri =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(2) > a");
    private By BirimKaliteTakvimiTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(3) > a");
    private By BirimRaporlariTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(4) > a");
    private By DisPaydaslarTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(5) > a");
    private By BirimKaliteCalismalari =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(6) > a");
    private By HizmetStandartlatiTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(8) > ul > li:nth-child(7) > a");
    private By IletisimBilgilerimiz =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(9) > a");
    private By OneriVeSikayetTitle =By.cssSelector("#navcoll > ul:nth-child(1) > li:nth-child(10) > a");
    private By Twitter =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.twitter > a");
    private By English =By.cssSelector("#navcoll > ul.nav.navbar-nav.navbar-right.hidden-sm.hidden-md > li.lang-text > a");







    public void userOnTheGenelSekreterlikPage(){elementHelper.openUrl("https://bidb.trakya.edu.tr/");}

    public String userShouldSeeDuyurularTitleOnBilgiIslemPage(){return elementHelper.getText(Duyurular);}
    public String userShouldSeeUSOMDuyurulariTitleOnBilgiIslemPage(){return elementHelper.getText(USOMDuyurular);}
    public String userShouldSeeHaberlerTitleOnBilgiIslemPage(){return elementHelper.getText(HaberlerTitle);}
    public String userShouldSeeHaberArşiviTitleOnBilgiIslemPage(){return elementHelper.getText(HaberArsiviTitle);}
    public void userShouldSeeBİDBTanitimKatologuButton(){elementHelper.checkElement(BIDBTanitim);}
    public void  userShouldSeeTeknikDestekTalepFormuButton(){elementHelper.checkElement(TeknikDestekTalepFormu);}
    public void userShouldSeeFormlarButton(){elementHelper.checkElement(Formlar);}
    public void userShouldSeeAkademikLisansButton(){elementHelper.checkElement(AkademikLisans);}
    public void userShouldSeeEgitimVideolariButton(){elementHelper.checkElement(EgitimVideolari);}
    public void userShouldSeeKullanimKilavuzlariButton(){elementHelper.checkElement(KullanimKilavuzlari);}
    public void userShouldSeeKurumIciDahiliTelefonGorusmeSistemiButton(){elementHelper.checkElement(KurumIciDahiliTelefonGorusmeSistemi);}
    public void userShouldSeeEDUROMButton(){elementHelper.checkElement(EDUROM);}
    public void userShouldSeeBilgiGuvenligiFarkindalikEgitimiSunusuButton(){elementHelper.checkElement(BilgiGuvenligiFarkindalikEgitimiSunusu);}
    public void userShouldSeeBireyselSiberGuvenlikOnlemleriButton(){elementHelper.checkElement(BireyselSiberGuvenlikOnlemleri);}
    public void userShouldSeeUzaktanYardimButton(){elementHelper.checkElement(UzaktanYardim);}
    public void userShouldSeeEBYSPortalButton(){elementHelper.checkElement(EBYSPortal);}
    public void userShouldSeeResmiYazısmalardaKullanilacakUsulVeEsaslarButton(){elementHelper.checkElement(YazismalardaKullanilacakUsulVeEsaslar);}
    public void userShoulSeeEBYSDestekTalepFormuButton(){elementHelper.checkElement(EBYSDestekTalepFormu);}
    public void userShouldSeeMobilImzaButton(){elementHelper.checkElement(MobilImza);}
    public void userShouldSeeEPostaKurulumAyarlariButton(){elementHelper.checkElement(EPostaKurulumAyarlari);}
    public void userShouldSeeEPostaVeSifreSifirlamaButton(){elementHelper.checkElement(EPostaVeSifreSifirlama);}
    public void userShouldSeeULAKNETBaglantiDurumuButton(){elementHelper.checkElement(ULAKNETBaglantiDurumu);}
    public void userShouldSeeKutuphaneVeritabaniIcinUzaktanErisimButton(){elementHelper.checkElement(KutuphaneVeritabaniIcinUzaktanErisim);}
    public void userShouldSeeRadyoGunebakanButton(){elementHelper.checkElement(RadyoGunebakan);}
    public String userShouldSeeElektronikPanolarTitleOnBilgiIslemPage(){return elementHelper.getText(ElektronikPanolar);}
    public void userShouldSeeElektronikPanoButton(){elementHelper.checkElement(ElektronikPano);}
    public void userShouldSeeTumEkranlarButton(){elementHelper.checkElement(TumEkranlar);}
    public String userShouldSeeKurallarTitleOnBilgiIslemPage(){return elementHelper.getText(Kurallar);}
    public String userShouldSeeBaglantilarTitleOnBilgiIslem(){return elementHelper.getText(Baglantilar);}
    public String userShouldSeeAnasayfaTitleOnBilgiIslemPage(){return elementHelper.getText(AnasayfaTitle);}
    public String userShouldSeeTanitimKataloguTitleOnBilgiIslemPage(){return elementHelper.getText(TanitimKatalogu);}
    public String userShouldSeeFaaliyetRaporlariTitleOnBilgiIslemPage(){return elementHelper.getText(FaaliyetRaporlari);}
    public  String userShouldSeeIstatistiklerTitleOnBilgiIslemPage(){return elementHelper.getText(Istatistikler);}
    public String userShouldSeeSSSTitleOnBilgiIslemPage(){return elementHelper.getText(SSSTitle);}
    public String userShouldSeeBaskanligimizTitleOnBilgiIslemPage(){return elementHelper.getText(BaskanligimizTitle);}
    public void userClickOnBaskanligimizButton(){elementHelper.checkElement(Baskanligimiz);}
    public String userShouldSeeGorevVeSorumluluklarTitleInBaskanligimizOnBilgiIslemPage(){return elementHelper.getText(GorevVeSorumluluklar);}
    public String userShouldSeeOrganizasyonSemasiTitleInBaskanligimizOnBilgiIslemPage(){return elementHelper.getText(OrganizasyonSemasi);}
    public String userShouldSeeBilgiGuvenligiYonetimSistemiTitleOnBilgiIslemPage(){return elementHelper.getText(BilgiGuvenligiYonetimSistemi);}
    public void userClickOnBilgiGuvenligiYonetimSistemiOnBilgiIslem(){elementHelper.click(GuvenligiYonetimSistemi);}
    public String userShouldSeeBGYSKapsamiVePolitikasiTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(){return elementHelper.getText(BGYSKapsamiVePolitikasi);}
    public String userShouldSeeBilgiGuvenligiPolitikamizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(){return elementHelper.getText(BilgiGuvenligiPolitikamizTitle);}
    public String userShouldSeeBGYSKUygulamaPolitikalarimizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(){return elementHelper.getText(BGYSKUygulamaPolitikalarimiz);}
    public String userShouldSeeTrakyaUniversitesiTitleOnBilgiIslemPage(){return elementHelper.getText(TrakyaUniversitesiTitle);}
    public String userShouldSeeHakkimizdaTitleOnBilgiIslemPage(){return elementHelper.getText(Hakkimizda);}
    public String userShouldSeeMisyonVizyonTitleOnBilgiIslemPage(){return elementHelper.getText(MisyonVizyonTitle);}
    public String userShouldSeeDegerlerTitleOnBilgiIslemPage(){return elementHelper.getText(Degerler);}
    public String userShouldSeePersonelimizTitleOnBilgiIslemPage(){return elementHelper.getText(PersonelimizTitle);}
    public void userClickOnIcKontrolSistemiButton(){elementHelper.click(IcKontrolSistemi);}
    public String userShouldSeeIcKontrolMevzuatTitleOnBilgiIslemPage(){return elementHelper.getText(IcKontrolMevzuatTitle);}
    public String userShouldSeeIcKontrolSistemiTitleOnBilgiIslemPage(){return elementHelper.getText(IcKontrolSistemiTitle);}
    public String userShouldSeeStratrjikYonetimBilgiSistemiTitleOnBilgiIslemPage(){return elementHelper.getText(StratrjikYonetimBilgiSistemiTitle);}
    public String userShouldSeeKaliteTitleOnBilgiIslemPage(){return elementHelper.getText(KaliteTitle);}
    public void userClickOnKaliteButton(){elementHelper.click(KaliteButton);}
    public String userShouldSeeTUKalitePolitikasiTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(TUKalitePolitikasi);}
    public String userShouldSeeBirimKaliteKomisyonuVeKaliteTemsilcileriTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(BirimKaliteKomisyonuVeKaliteTemsilcileri);}
    public String userShouldSeeBirimKaliteTakvimiTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(BirimKaliteTakvimiTitle);}
    public String userShouldSeeBirimRaporlariTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(BirimRaporlariTitle);}
    public String userShouldSeeDişPaydaslarTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(DisPaydaslarTitle);}
    public String userShouldSeeBirimKaliteCalismalariTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(BirimKaliteCalismalari);}
    public String userShouldSeeHizmetStandartlatiTitleInKaliteOnBilgiIslemPage(){return elementHelper.getText(HizmetStandartlatiTitle);}
    public String userShouldSeeİletisimBilgilerimizTitleOnBilgiIslemPage(){return elementHelper.getText(IletisimBilgilerimiz);}
    public String userShouldSeeOneriVeSikayetTitleOnBilgiIslemPage(){return elementHelper.getText(OneriVeSikayetTitle);}
    public String userShouldSeeTwitterTitleOnBilgiIslemPage(){return elementHelper.getText(Twitter);}
    public String userShouldSeeEnglishTitleOnBilgiIslemPage(){return elementHelper.getText(English);}



}
