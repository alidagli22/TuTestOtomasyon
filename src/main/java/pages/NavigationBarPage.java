package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class NavigationBarPage {

    private ElementHelper elementHelper;
    private By RektorPageButton = By.cssSelector("");
    private By RektorPage = By.cssSelector("");
    private By RektorYardimciliariOsmanPageButton = By.cssSelector("");
    private By RektorYardimcisiOsmanPage = By.cssSelector("");
    private By RektorYardimcilariAhmetPageButton = By.cssSelector("");
    private By RektorYardimcisiAhmetPage = By.cssSelector("");
    private By RektorYardimcilariMetinPageButton = By.cssSelector("");
    private By RektorYardimcisiMetinPage = By.cssSelector("");
    private By UygulamaliBilimlerPageButton = By.cssSelector("");
    private By UygulamaliBilimlerPage = By.cssSelector("");
    private By GenelSekreterlikButton = By.cssSelector("");
    private By GenelSekreterlikPage = By.cssSelector("");
    private By BilgiIslemPageButton = By.cssSelector("");
    private By BilgiIslemPage = By.cssSelector("");
    private By IcDenetimPageButton = By.cssSelector("");
    private By IcDenetimPage = By.cssSelector("");
    private By IdariMaliPageButton = By.cssSelector("");
    private By IdareiMaliPage = By.cssSelector("");
    private By KutuphanePageButton = By.cssSelector("");
    private By KutuphanePage = By.cssSelector("");
    private By OgrenciIsleriPageButton = By.cssSelector("");
    private By OgrenciIsleriPage = By.cssSelector("");
    private By PersonelDaireIsleriPageButton  = By.cssSelector("");
    private By PersonelDaireIsleriPage = By.cssSelector("");
    private By SaglikKulturPageButton = By.cssSelector("");
    private By SaglikKulturPage = By.cssSelector("");
    private By StratejiPageButton = By.cssSelector("");
    private By StratejiPage = By.cssSelector("");
    private By HastanePageButton = By.cssSelector("");
    private By HastanePage = By.cssSelector("");
    private By YapiIsleriPageButton = By.cssSelector("");
    private By YapiIsleriPage = By.cssSelector("");
    private By DonerSermayePageButton = By.cssSelector("");
    private By DonerSermayePage = By.cssSelector("");
    private By AdayOgrenciPageButton = By.cssSelector("");
    private By AdayOgrenciPage = By.cssSelector("");
    private By OgrenciTopluluklariPageButton = By.cssSelector("");
    private By OgrenciTopluluklariPage = By.cssSelector("");
    private By OgrenciBilgiSistemiPageButton = By.cssSelector("");
    private By OgrenciBilgiSistemiPage = By.cssSelector("");
    private By ErasmusPageButton = By.cssSelector("");
    private By ErasmusPage = By.cssSelector("");
    private By YabanciUygukluOgrenciOfisiPageButton = By.cssSelector("");
    private By YabanciUygukluOgrenciOfisiPage = By.cssSelector("");
    private By ECTSDersKatologuPageButton = By.cssSelector("");
    private By ECTSDersKatologuPage = By.cssSelector("");
    private By DiplomaEkiPageButton = By.cssSelector("");
    private By DiplomaEkiPage = By.cssSelector("");
    private By ZorunluOrtakServisDersleriPageButton = By.cssSelector("");
    private By ZorunluOrtakServisDersleriPage = By.cssSelector("");
    private By OgrenciKonseyiPageButton = By.cssSelector("");
    private By OgrenciKonseyiPage = By.cssSelector("");
    private By KariyerMerkeziPageButton = By.cssSelector("");
    private By KariyerMerkeziPage = By.cssSelector("");
    private By EngelsizTrakyaUniversitesiPageButton = By.cssSelector("");
    private By EngelsizTrakyaUniversitesiPage = By.cssSelector("");
    private By BKEDersiEtkinlikleriPageButton = By.cssSelector("");
    private By BKEEtkinlikleriPage = By.cssSelector("");
    private By EEgitimPageButton = By.cssSelector("");
    private By EEgitimPage = By.cssSelector("");
    private By KaliteKomisyonuPageButton = By.cssSelector("");
    private By KaliteKomisyonuPage = By.cssSelector("");
    private By KaliteKoordinatorluguPageButton = By.cssSelector("");
    private By KaliteKoordinatorluguPage = By.cssSelector("");
    private By LiderlikYonetimKalitePageButton = By.cssSelector("");
    private By LiderlikYonetimKalitePage = By.cssSelector("");
    private By EgitimVeOgretimPageButton = By.cssSelector("");
    private By EgitimVeOgretimPage = By.cssSelector("");
    private By ArastirmaVeGelistirmePageButton = By.cssSelector("");
    private By ArastirmaVeGelistirmePage = By.cssSelector("");
    private By ToplumsalKatkiPageButton = By.cssSelector("");
    private By ToplumsalKatkiPage = By.cssSelector("");
    private By KaliteVeStratejiGelistirmePageButton = By.cssSelector("");
    private By KaliteVeStratejiGelistirmePage = By.cssSelector("");
    private By KaliteSurecleriPageButton = By.cssSelector("");
    private By KaliteSurecleriPage = By.cssSelector("");
    private By AkrediteProgramlarPageButton = By.cssSelector("");
    private By AkrediteProgramlarPage = By.cssSelector("");

    



    public NavigationBarPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    public void userOnNavigationBar() {
        elementHelper.openUrl("https://www.trakya.edu.tr/");
    }

    public void ClickRektorPageButton() {
        elementHelper.click(RektorPageButton);
    }

    public void ShouldSeeRektorPage() {
        elementHelper.checkElement(RektorPage);
    }

    public void ClickRektorYardimciliariOsmanPageButton() {
        elementHelper.click(RektorYardimciliariOsmanPageButton);
    }

    public void ShouldSeeRektorYardimcisiOsmanPage() {
        elementHelper.checkElement(RektorYardimcisiOsmanPage);
    }

    public void ClickRektorYardimcilariAhmetPageButton() {
        elementHelper.click(RektorYardimcilariAhmetPageButton);
    }

    public void ShouldSeeRektorYardimcisiAhmetPage() {
        elementHelper.checkElement(RektorYardimcisiAhmetPage);
    }

    public void ClickRektorYardimcilariMetinPageButton() {
        elementHelper.click(RektorYardimcilariMetinPageButton);
    }

    public void ShouldSeeRektorYardimcisiMetinPage() {
        elementHelper.checkElement(RektorYardimcisiMetinPage);
    }

    public void ClickOnUygulamaliBilimlerPageButton() {
        elementHelper.click(UygulamaliBilimlerPageButton);
    }

    public void ShouldSeeUygulamaliBilimlerPage() {
        elementHelper.checkElement(UygulamaliBilimlerPage);
    }

    public void ClickOnGenelSekreterlikButton() {
        elementHelper.click(GenelSekreterlikButton);
    }

    public void ShouldSeeGenelSekreterlikPage() {
        elementHelper.checkElement(GenelSekreterlikPage);
    }

    public void ClickOnBilgiIslemPageButton() {
        elementHelper.click(BilgiIslemPageButton);
    }

    public void ShouldSeeBilgiIslemPage() {
        elementHelper.checkElement(BilgiIslemPage);
    }

    public void ClickOnIcDenetimPageButton() {
        elementHelper.click(IcDenetimPageButton);
    }

    public void ShouldSeeIcDenetimPage() {
        elementHelper.checkElement(IcDenetimPage);
    }

    public void ClickOnIdariMaliPageButton() {
        elementHelper.click(IdariMaliPageButton);
    }

    public void ShouldSeeIdareiMaliPage() {
        elementHelper.checkElement(IdareiMaliPage);
    }

    public void ClickOnKutuphanePageButton() {
        elementHelper.click(KutuphanePageButton);
    }

    public void ShouldSeeKutuphanePage() {
        elementHelper.checkElement(KutuphanePage);
    }

    public void ClickOnOgrenciIsleriPageButton() {
        elementHelper.click(OgrenciIsleriPageButton);
    }

    public void ShouldSeeOgrenciIsleriPage() {
        elementHelper.checkElement(OgrenciIsleriPage);
    }

    public void ClickOnPersonelDaireIsleriPageButton() {
        elementHelper.click(PersonelDaireIsleriPageButton);
    }

    public void ShouldSeePersonelDaireIsleriPage() {
        elementHelper.checkElement(PersonelDaireIsleriPage);
    }

    public void ClickOnSaglikKulturPageButton() {
        elementHelper.click(SaglikKulturPageButton);
    }

    public void ShouldSeeSaglikKulturPage() {
        elementHelper.checkElement(SaglikKulturPage);
    }

    public void ClickOnStratejiPageButton() {
        elementHelper.click(StratejiPageButton);
    }

    public void ShouldSeeStratejiPage() {
        elementHelper.checkElement(StratejiPage);
    }

    public void ClickOnHastanePageButton() {
        elementHelper.click(HastanePageButton);
    }

    public void ShouldSeeHastanePage() {
        elementHelper.checkElement(HastanePage);
    }

    public void ClickOnYapiIsleriPageButton() {
        elementHelper.click(YapiIsleriPageButton);
    }

    public void ShouldSeeYapiIsleriPage() {
        elementHelper.checkElement(YapiIsleriPage);
    }

    public void ClickOnDonerSermayePageButton() {
        elementHelper.click(DonerSermayePageButton);
    }

    public void ShouldSeeDonerSermayePage() {
        elementHelper.checkElement(DonerSermayePage);
    }

    public void ClickOnAdayOgrenciPageButton() {
        elementHelper.click(AdayOgrenciPageButton);
    }

    public void ShouldSeeAdayOgrenciPage() {
        elementHelper.checkElement(AdayOgrenciPage);
    }

    public void ClickOnOgrenciTopluluklariPageButton() {
        elementHelper.click(OgrenciTopluluklariPageButton);
    }

    public void ShouldSeeOgrenciTopluluklariPage() {
        elementHelper.checkElement(OgrenciTopluluklariPage);
    }

    public void ClickOnOgrenciBilgiSistemiPageButton() {
        elementHelper.click(OgrenciBilgiSistemiPageButton);
    }

    public void ShouldSeeOgrenciBilgiSistemiPage() {
        elementHelper.checkElement(OgrenciBilgiSistemiPage);
    }

    public void ClickOnErasmusPageButton() {
        elementHelper.click(ErasmusPageButton);
    }

    public void ShouldSeeErasmusPage() {
        elementHelper.checkElement(ErasmusPage);
    }

    public void ClickOnYabanciUygukluOgrenciOfisiPageButton() {
        elementHelper.click(YabanciUygukluOgrenciOfisiPageButton);
    }

    public void ShouldSeeYabanciUygukluOgrenciOfisiPage() {
        elementHelper.checkElement(YabanciUygukluOgrenciOfisiPage);
    }

    public void ClickOnECTSDersKatologuPageButton() {
        elementHelper.click(ECTSDersKatologuPageButton);
    }

    public void ShouldSeeECTSDersKatologuPage() {
        elementHelper.checkElement(ECTSDersKatologuPage);
    }

    public void ClickOnDiplomaEkiPageButton() {
        elementHelper.click(DiplomaEkiPageButton);
    }

    public void ShouldSeeDiplomaEkiPage() {
        elementHelper.checkElement(DiplomaEkiPage);
    }

    public void ClickOnZorunluOrtakServisDersleriPageButton() {
        elementHelper.click(ZorunluOrtakServisDersleriPageButton);
    }

    public void ShouldSeeZorunluOrtakServisDersleriPage() {
        elementHelper.checkElement(ZorunluOrtakServisDersleriPage);
    }

    public void ClickOnOgrenciKonseyiPageButton() {
        elementHelper.click(OgrenciKonseyiPageButton);
    }

    public void ShouldSeeOgrenciKonseyiPage() {
        elementHelper.checkElement(OgrenciKonseyiPage);
    }

    public void ClickOnKariyerMerkeziPageButton() {
        elementHelper.click(KariyerMerkeziPageButton);
    }

    public void ShouldSeeKariyerMerkeziPage() {
        elementHelper.checkElement(KariyerMerkeziPage);
    }

    public void ClickOnEngelsizTrakyaUniversitesiPageButton() {
        elementHelper.click(EngelsizTrakyaUniversitesiPageButton);
    }

    public void ShouldSeeEngelsizTrakyaUniversitesiPage() {
        elementHelper.checkElement(EngelsizTrakyaUniversitesiPage);
    }

    public void ClickOnBKEDersiEtkinlikleriPageButton() {
        elementHelper.click(BKEDersiEtkinlikleriPageButton);
    }

    public void ShouldSeeBKEEtkinlikleriPage() {
        elementHelper.checkElement(BKEEtkinlikleriPage);
    }

    public void ClickOnEEgitimPageButton() {
        elementHelper.click(EEgitimPageButton);
    }

    public void ShouldSeeEEgitimPage() {
        elementHelper.checkElement(EEgitimPage);
    }

    public void ClickOnKaliteKomisyonuPageButton() {
        elementHelper.click(KaliteKomisyonuPageButton);
    }

    public void ShouldSeeKaliteKomisyonuPage() {
        elementHelper.checkElement(KaliteKomisyonuPage);
    }

    public void ClickOnKaliteKoordinatorluguPageButton() {
        elementHelper.click(KaliteKoordinatorluguPageButton);
    }

    public void ShoulSeeKaliteKoordinatorluguPage() {
        elementHelper.checkElement(KaliteKoordinatorluguPage);
    }

    public void ClickOnLiderlikYonetimKalitePageButton() {
        elementHelper.click(LiderlikYonetimKalitePageButton);
    }

    public void ShouldSeeLiderlikYonetimKalitePage() {
        elementHelper.checkElement(LiderlikYonetimKalitePage);
    }

    public void ClickOnEgitimVeOgretimPageButton() {
        elementHelper.click(EgitimVeOgretimPageButton);
    }

    public void ShouldSeeEgitimVeOgretimPage() {
        elementHelper.checkElement(EgitimVeOgretimPage);
    }

    public void ClickOnArastirmaVeGelistirmePageButton() {
        elementHelper.click(ArastirmaVeGelistirmePageButton);
    }

    public void ShouldSeeArastirmaVeGelistirmePage() {
        elementHelper.checkElement(ArastirmaVeGelistirmePage);
    }

    public void ClickOnToplumsalKatkiPageButton() {
        elementHelper.click(ToplumsalKatkiPageButton);
    }

    public void ShouldSeeToplumsalKatkiPage() {
        elementHelper.checkElement(ToplumsalKatkiPage);
    }

    public void ClickOnKaliteVeStratejiGelistirmePageButton() {
        elementHelper.click(KaliteVeStratejiGelistirmePageButton);
    }

    public void ShouldSeeKaliteVeStratejiGelistirmePage() {
        elementHelper.checkElement(KaliteVeStratejiGelistirmePage);
    }

    public void ClickOnKaliteSurecleriPageButton() {
        elementHelper.click(KaliteSurecleriPageButton);
    }

    public void ShouldSeeKaliteSurecleriPage() {
        elementHelper.checkElement(KaliteSurecleriPage);
    }

    public void ClickOnAkrediteProgramlarPageButton() {
        elementHelper.click(AkrediteProgramlarPageButton);
    }

    public void ShouldSeeAkrediteProgramlarPage() {
        elementHelper.checkElement(AkrediteProgramlarPage);
    }

    public void ShouldSeeKaliteKoordinatorluguPage() {
        elementHelper.checkElement(KaliteKoordinatorluguPage);
    }
}

