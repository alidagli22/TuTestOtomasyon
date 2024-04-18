package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class NavigationBarPage {

    private ElementHelper elementHelper;
    private By RektorPageButton = By.cssSelector("#navbar > li li li:nth-of-type(1) > [href='javascript:void(0);']");
    private By RektorPage = By.cssSelector("#navbar > li li li:nth-of-type(1) > [href='javascript:void(0);']");
    private By RektorYardimciliariOsmanPageButton = By.cssSelector("[href='https://personel.trakya.edu.tr/osmanh']");
    private By RektorYardimcisiOsmanPage = By.cssSelector("[href='https://personel.trakya.edu.tr/osmanh']");
    private By RektorYardimcilariAhmetPageButton = By.cssSelector("[href='https://personel.trakya.edu.tr/ahamdizafer']");
    private By RektorYardimcisiAhmetPage = By.cssSelector("[href='https://personel.trakya.edu.tr/ahamdizafer']");
    private By RektorYardimcilariMetinPageButton = By.cssSelector("[href='https://personel.trakya.edu.tr/metina']");
    private By RektorYardimcisiMetinPage = By.cssSelector("[href='https://personel.trakya.edu.tr/metina']");
    private By UygulamaliBilimlerPageButton = By.cssSelector("[href='https://ubf.trakya.edu.tr/']");
    private By UygulamaliBilimlerPage = By.cssSelector("[href='https://ubf.trakya.edu.tr/']");
    private By GenelSekreterlikButton = By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/']");
    private By GenelSekreterlikPage = By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/']");
    private By BilgiIslemPageButton = By.cssSelector("[href='https://bidb.trakya.edu.tr/']");
    private By BilgiIslemPage = By.cssSelector("[href='https://bidb.trakya.edu.tr/']");
    private By HukukMusavirligiPage = By.cssSelector("[href='https://hukukmusavirligi.trakya.edu.tr/']");
    private By HukukMusavirligiPageButton = By.cssSelector("[href='https://hukukmusavirligi.trakya.edu.tr/']");
    private By IcDenetimPageButton = By.cssSelector("[href='https://icdenetim.trakya.edu.tr/']");
    private By IcDenetimPage = By.cssSelector("[href='https://icdenetim.trakya.edu.tr/']");
    private By IdariMaliPageButton = By.cssSelector("[href='https://imdb.trakya.edu.tr/']");
    private By IdareiMaliPage = By.cssSelector("[href='https://imdb.trakya.edu.tr/']");
    private By KutuphanePageButton = By.cssSelector(".none [href='https://kutuphane.trakya.edu.tr/']");
    private By KutuphanePage = By.cssSelector(".none [href='https://kutuphane.trakya.edu.tr/']");
    private By OgrenciIsleriPageButton = By.cssSelector("[href='https://oidb.trakya.edu.tr/']");
    private By OgrenciIsleriPage = By.cssSelector("[href='https://oidb.trakya.edu.tr/']");
    private By PersonelDaireIsleriPageButton  = By.cssSelector("[href='https://pdb.trakya.edu.tr/']");
    private By PersonelDaireIsleriPage = By.cssSelector("[href='https://pdb.trakya.edu.tr/']");
    private By SaglikKulturPageButton = By.cssSelector("[href='https://sks.trakya.edu.tr/']");
    private By SaglikKulturPage = By.cssSelector("[href='https://sks.trakya.edu.tr/']");
    private By StratejiPageButton = By.cssSelector("[href='https://sgdb.trakya.edu.tr/']");
    private By StratejiPage = By.cssSelector("[href='https://sgdb.trakya.edu.tr/']");
    private By HastanePageButton = By.cssSelector("[href='https://tuh.trakya.edu.tr']");
    private By HastanePage = By.cssSelector("[href='https://tuh.trakya.edu.tr']");
    private By YapiIsleriPageButton = By.cssSelector("[href='https://yitdb.trakya.edu.tr/']");
    private By YapiIsleriPage = By.cssSelector("[href='https://yitdb.trakya.edu.tr/']");
    private By DonerSermayePageButton = By.cssSelector(".none [href='https://donersermaye.trakya.edu.tr/']");
    private By DonerSermayePage = By.cssSelector(".none [href='https://donersermaye.trakya.edu.tr/']");
    private By AdayOgrenciPageButton = By.cssSelector("[href='https://aday.trakya.edu.tr/']");
    private By AdayOgrenciPage = By.cssSelector("[href='https://aday.trakya.edu.tr/']");
    private By OgrenciTopluluklariPageButton = By.cssSelector("[href='https://sks.trakya.edu.tr/pages/ogrenci-topluluklari']");
    private By OgrenciTopluluklariPage = By.cssSelector("[href='https://sks.trakya.edu.tr/pages/ogrenci-topluluklari']");
    private By OgrenciBilgiSistemiPageButton = By.cssSelector("[href='https://obs.trakya.edu.tr/']");
    private By OgrenciBilgiSistemiPage = By.cssSelector("[href='https://obs.trakya.edu.tr/']");
    private By ErasmusPageButton = By.cssSelector("[href='https://erasmus.trakya.edu.tr']");
    private By ErasmusPage = By.cssSelector("[href='https://erasmus.trakya.edu.tr']");
    private By YabanciUygukluOgrenciOfisiPageButton = By.cssSelector("[href='https://student.trakya.edu.tr/']");
    private By YabanciUygukluOgrenciOfisiPage = By.cssSelector("[href='https://student.trakya.edu.tr/']");
    private By ECTSDersKatologuPageButton = By.cssSelector("[href='https://eos.trakya.edu.tr/']");
    private By ECTSDersKatologuPage = By.cssSelector("[href='https://eos.trakya.edu.tr/']");
    private By DiplomaEkiPageButton = By.cssSelector("[href='https://oidb.trakya.edu.tr/pages/diploma-eki']");
    private By DiplomaEkiPage = By.cssSelector("[href='https://oidb.trakya.edu.tr/pages/diploma-eki']");
    private By ZorunluOrtakServisDersleriPageButton = By.cssSelector("[href='https://zosd.trakya.edu.tr/']");
    private By ZorunluOrtakServisDersleriPage = By.cssSelector("[href='https://zosd.trakya.edu.tr/']");
    private By OgrenciKonseyiPageButton = By.cssSelector("[href='https://ogrencikonseyi.trakya.edu.tr/']");
    private By OgrenciKonseyiPage = By.cssSelector("[href='https://ogrencikonseyi.trakya.edu.tr/']");
    private By KariyerMerkeziPageButton = By.cssSelector("[href='https://kariyer.trakya.edu.tr/']");
    private By KariyerMerkeziPage = By.cssSelector("[href='https://kariyer.trakya.edu.tr/']");
    private By EngelsizTrakyaUniversitesiPageButton = By.cssSelector("[href='https://engelsiz.trakya.edu.tr/']");
    private By EngelsizTrakyaUniversitesiPage = By.cssSelector("[href='https://engelsiz.trakya.edu.tr/']");
    private By BKEDersiEtkinlikleriPageButton = By.cssSelector("[href='https://bkeders.trakya.edu.tr/']");
    private By BKEEtkinlikleriPage = By.cssSelector("[href='https://bkeders.trakya.edu.tr/']");
    private By EEgitimPageButton = By.cssSelector("[href='https://e-egitim.trakya.edu.tr/']");
    private By EEgitimPage = By.cssSelector("[href='https://e-egitim.trakya.edu.tr/']");
    private By KaliteKomisyonuPageButton = By.cssSelector("[href='https://www.trakya.edu.tr/staff/kalite-komisyonu']");
    private By KaliteKomisyonuPage = By.cssSelector("[href='https://www.trakya.edu.tr/staff/kalite-komisyonu']");
    private By KaliteKoordinatorluguPageButton = By.cssSelector("[href='https://www.trakya.edu.tr/staff/kalite-koordinatoru']");
    private By KaliteKoordinatorluguPage = By.cssSelector("[href='https://www.trakya.edu.tr/staff/kalite-koordinatoru']");
    private By LiderlikYonetimKalitePageButton = By.cssSelector("[href='/liderlik-yonetim-ve-kalite']");
    private By LiderlikYonetimKalitePage = By.cssSelector("[href='/liderlik-yonetim-ve-kalite']");
    private By EgitimVeOgretimPageButton = By.cssSelector("[href='/egitim-ve-ogretim']");
    private By EgitimVeOgretimPage = By.cssSelector("[href='/egitim-ve-ogretim']");
    private By ArastirmaVeGelistirmePageButton = By.cssSelector("[href='/arastirma-ve-gelistirme']");
    private By ArastirmaVeGelistirmePage = By.cssSelector("[href='/arastirma-ve-gelistirme']");
    private By ToplumsalKatkiPageButton = By.cssSelector("[href='/toplumsal-katki']");
    private By ToplumsalKatkiPage = By.cssSelector("[href='/toplumsal-katki']");
    private By KaliteVeStratejiGelistirmePageButton = By.cssSelector(".none [href='https://kalite.trakya.edu.tr/']");
    private By KaliteVeStratejiGelistirmePage = By.cssSelector(".none [href='https://kalite.trakya.edu.tr/']");
    private By KaliteSurecleriPageButton = By.cssSelector("[href='/kalite-guvencesi/mevzuat']");
    private By KaliteSurecleriPage = By.cssSelector("[href='/kalite-guvencesi/mevzuat']");
    private By AkrediteProgramlarPageButton = By.cssSelector("[href='/akreditasyon/akredite-programlar']");
    private By AkrediteProgramlarPage = By.cssSelector("[href='/akreditasyon/akredite-programlar']");

    



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

    public void ShouldSeeHukukMusavirligiPageButton() {elementHelper.click(HukukMusavirligiPageButton);}

    public void ShouldSeeHukukMusavirligiPage() {elementHelper.checkElement(HukukMusavirligiPage);}
}

