package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RektorYardimcilariPage {
    private ElementHelper elementHelper;
    private By UniversiteButton = By.cssSelector("#navbar > li:nth-of-type(1) > [href='javascript:void(0);']");
    private By YonetimPageButton = By.cssSelector("#navbar > li > .dropdown > li:nth-of-type(1) > [href='javascript:void(0);']");
    private By RektorPageButton = By.cssSelector("");
    private By ErhanTabakogluButton= By.cssSelector("");
    private By RektorYardimcilariPageButton = By.cssSelector("");
    private By RektorYardimcilariGorevDagilimiButton = By.cssSelector("");
    private By SenatoButton = By.cssSelector("");
    private By YonetimKuruluButton = By.cssSelector("");
    private By GecmisDonemRektorlerimizButton = By.cssSelector("");
    private By TanitimPageButton = By.cssSelector("");
    private By UniversiteHakkindaPageButton = By.cssSelector("");
    private By MisyonVeVizyonButton= By.cssSelector("");
    private By TemelDegerlerButton = By.cssSelector("");
    private By EtikDavranisIlkelerimizButton = By.cssSelector("");
    private By KalitePolitikamizButton = By.cssSelector("");
    private By HesapVerebilirlikPolitikasiButton = By.cssSelector("");
    private By TarihceButton = By.cssSelector("");
    private By KurumsalKimlikButton = By.cssSelector("");
    private By BalkanKongreMerkeziButton = By.cssSelector("");
    private By KurumIciDegerlendirmeRaporuButton = By.cssSelector("");
    private By MevzuatButton = By.cssSelector("");
    private By StratejikPlanButton = By.cssSelector("");
    private By YilButton = By.cssSelector("");
    private By SecondYilButton = By.cssSelector("");
    private By ThirdYilButton = By.cssSelector("");
    private By AkademikButton = By.cssSelector("");
    private By BalkanArastirmaEnstitusuPageButton = By.cssSelector("");
    private By FenBilimleriEnstitusuPageButton = By.cssSelector("");
    private By RomanDiliVeKulturuArastirmalariEnstitusuPageButton = By.cssSelector("");
    private By SaglikBilimleriEnstitusuPageButton = By.cssSelector("");
    private By SosyalBilimlerEnstitusuPageButton = By.cssSelector("");
    private By ArastirmaVeUygulamaMerkezleriPageButton = By.cssSelector("");
    private By UNESCOChairOfQualityEducationDigitalTranformationPageButton = By.cssSelector("");
    private By DisHekimligiFakultesiPageButton = By.cssSelector("");
    private By EczacilikFakultesiPageButton = By.cssSelector("");
    private By EdebiyatFakultesiPageButton = By.cssSelector("");
    private By EgitimFakultesiPageButton = By.cssSelector("");
    private By FenFakultesiPageButton = By.cssSelector("");
    private By GuzelSanatlarFakultesiPageButton = By.cssSelector("");
    private By IktisadiVeIdariBilimlerFakultesiPageButton = By.cssSelector("");
    private By IlahiyatFakultesiPageButton = By.cssSelector("");
    private By KirpinarSporBilimleriFakultesiPageButtonrastirmaEnstitusuPageButton = By.cssSelector("");
    private By MimarlikFakultesiPageButton = By.cssSelector("");
    private By MuhendislikFakultesiPageButton = By.cssSelector("");
    private By SaglikBilimleriFakultesiPageButton = By.cssSelector("");
    private By TipFakultesiPageButton = By.cssSelector("");
    private By UygulamaliBilimlerFakultesiPageButton = By.cssSelector("");
    private By DevletKonservatuvariPageButton = By.cssSelector("");
    private By KesanHakkiYorukSaglikYuksekokuluPageButton = By.cssSelector("");
    private By KesanYusufCaprazUygulamaliBilimlerYuksekokuluPageButton = By.cssSelector("");
    private By UzunkopruUygulamaliBilimlerYuksekokuluPageButton = By.cssSelector("");
    private By YabanciDillerYuksekokuluPageButton = By.cssSelector("");
    private By ArdaMeslekYuksekokuluPageButton = By.cssSelector("");
    private By EdirneSosyalBilimlerMeslekYuksekokuluPageButton = By.cssSelector("");
    private By EdirneTeknikBilimlerMeslekYuksekokuluPageButton = By.cssSelector("");
    private By HavsaMeslekYuksekokuluPageButton = By.cssSelector("");
    private By IpsalaMeslekYuksekokuluPageButton = By.cssSelector("");
    private By KesanMeslekYuksekokuluPageButton = By.cssSelector("");
    private By SaglikHizmetleriMeslekYuksekokuluPageButton = By.cssSelector("");
    private By SehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPageButton = By.cssSelector("");
    private By TuncaMeslekYuksekokuluPageButton = By.cssSelector("");
    private By UzunkopruMeslekYuksekokuluPageButton = By.cssSelector("");
    private By IdariButton = By.cssSelector("");
    private By GenelSekreterlikPageButton = By.cssSelector("");
    private By BilgiIslemDaireBaskanligiPageButton = By.cssSelector("");
    private By HukukMusavirligiPageButton = By.cssSelector("");
    private By IcDenetimBirimiPageButton = By.cssSelector("");
    private By IdariVeMaliIslerDaireBaskanligiPageButton = By.cssSelector("");
    private By KutuphaneVeDokumantasyonDaireBaskanligiPageButton = By.cssSelector("");
    private By OgrenciIsleriDaireBaskanligiPageButton = By.cssSelector("");
    private By PersonelDaireBaskanligiPageButton = By.cssSelector("");
    private By SaglikKulturVeSporDaireBaskanligiPageButton = By.cssSelector("");
    private By StratejiGelistirmeDaireBaskanligiPageButton = By.cssSelector("");
    private By TUHastanesiBasmudurluguPageButton = By.cssSelector("");
    private By YapiIsleriVeTeknikDaireBaskanligiPageButton = By.cssSelector("");
    private By DonerSermayeIsletmeMudurluguPageButton = By.cssSelector("");
    private By ClickOnOgrenciButton = By.cssSelector("");
    private By YabanciUyrukluOgrenciOfisiPageButton = By.cssSelector("");
    private By EEgitimButton = By.cssSelector("");
    private By KaliteGuvencesiButton = By.cssSelector("");
    private By EnglishButton = By.cssSelector("");
    private By EnglishTitleOnRektorYardimcilariGorevDagilimiPage = By.cssSelector("");
    private By KullaniciGirisiButton = By.cssSelector("");
    private By OsmanNuriHatipogluButton = By.cssSelector("");
    private By AhmetHamdiZaferButton = By.cssSelector("");



    public RektorYardimcilariPage(WebDriver driver) {elementHelper = new ElementHelper(driver);}
    public void userOnTheRektorYardimcilariGorevDagilimiPage(){elementHelper.openUrl("https://www.trakya.edu.tr/rektor-yardimcilari-gorev-dagilimi");};
    public void ClickOnUniversiteButton(){elementHelper.click(UniversiteButton);}
    public  void ClickOnYonetimPageButton(){elementHelper.click(YonetimPageButton);}
    public void ClickOnRektorPageButton(){elementHelper.click(RektorPageButton);}
    public void ClickOnErhanTabakogluButton(){elementHelper.click(ErhanTabakogluButton);}
    public String ShouldSeeErhanTabakogluPage(){return elementHelper.getUrl();}
    public void ClickOnRektorYardimcilariPageButton(){elementHelper.click(RektorYardimcilariPageButton);}
    public String ShouldSeeRektorYardimcisiOsmanNHatipogluPage(){return elementHelper.getUrl();}
    public String ShouldSeeRektorYardimcisiAhmetHamdiZaferPage(){return elementHelper.getUrl();}
    public String ShouldSeeRektorYardimcisiMetinAydogduPage(){return elementHelper.getUrl();}
    public void ClickOnRektorYardimcilariGorevDagilimiButton(){elementHelper.click(RektorYardimcilariGorevDagilimiButton);}
    public String ShouldSeeRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public void ClickOnSenatoButton(){elementHelper.click(SenatoButton);}
    public String ShouldSeeSenatoPage(){return elementHelper.getUrl();}
    public void ClickOnYonetimKuruluButton(){elementHelper.click(YonetimKuruluButton);}
    public String ShouldSeeYonetimKuruluPage(){return elementHelper.getUrl();}
    public void ClickOnGecmisDonemRektorlerimizButton(){elementHelper.click(GecmisDonemRektorlerimizButton);}
    public String ShouldSeeGecmisDonemRektorlerimizPage(){return elementHelper.getUrl();}
    public void ClickOnTanitimPageButton(){elementHelper.click(TanitimPageButton);}
    public String ShouldSeeTanitimKatologuPage(){return elementHelper.getUrl();}
    public String ShouldSeeTanitimFilmiPage(){return elementHelper.getUrl();}
    public void ClickOnUniversiteHakkindaPageButton(){elementHelper.click(UniversiteHakkindaPageButton);}
    public void ClickOnMisyonVeVizyonButton(){elementHelper.click(MisyonVeVizyonButton);}
    public String ShouldSeeMisyonVeVizyonPage(){return elementHelper.getUrl();}
    public void ClickOnTemelDegerlerButton(){elementHelper.click(TemelDegerlerButton);}
    public String ShouldSeeTemelDegerlerPage(){return elementHelper.getUrl();}
    public void ClickOnEtikDavranisIlkelerimizButton(){elementHelper.click(EtikDavranisIlkelerimizButton);}
    public String ShouldSeeEtikDavranısİlkelerimizPage(){return elementHelper.getUrl();}
    public void ClickOnKalitePolitikamizButton(){elementHelper.click(KalitePolitikamizButton);}
    public String ShouldSeeKalitePolitikamizPage(){return elementHelper.getUrl();}
    public void ClickOnHesapVerebilirlikPolitikasiButton(){elementHelper.click(HesapVerebilirlikPolitikasiButton);}
    public String ShouldSeeHesapVerebilirlikPolitikasiPage(){return elementHelper.getUrl();}
    public void ClickOnTarihceButton(){elementHelper.click(TarihceButton);}
    public String ShouldSeeTarihcePage(){return elementHelper.getUrl();}
    public void ClickOnKurumsalKimlikButton(){elementHelper.click(KurumsalKimlikButton);}
    public String ShouldSeeKurumsalKimlikPage(){return elementHelper.getUrl();}
    public void ClickOnBalkanKongreMerkeziButton(){elementHelper.click(BalkanKongreMerkeziButton);}
    public String ShouldSeeBalkanKongreMerkeziPage(){return elementHelper.getUrl();}
    public void ClickOnKurumIciDegerlendirmeRaporuButton(){elementHelper.click(KurumIciDegerlendirmeRaporuButton);}
    public String ShouldSeeKurumİciDegerlendirmeRaporuPage(){return elementHelper.getUrl();}
    public void ClickOnMevzuatButton(){elementHelper.click(MevzuatButton);}
    public String ShouldSeeMevzuatPage(){return elementHelper.getUrl();}
    public void ClickOnStratejikPlanButton(){elementHelper.click(StratejikPlanButton);}
    public void ClickOnYilButton(){ elementHelper.click(YilButton);}
    public String ShouldSeeYilPage(){return elementHelper.getUrl();}
    public void ClickOnSecondYilButton(){elementHelper.click(SecondYilButton);}
    public String ShouldSeeSecondYilPage(){return elementHelper.getUrl();}
    public void ClickOnThirdYilButton(){elementHelper.click(ThirdYilButton);}
    public String ShouldSeeThirdYilPage(){return elementHelper.getUrl();}
    public void ClickOnAkademikButton(){ elementHelper.click(AkademikButton);}
    public String ShouldSeeEnstitülerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public void ClickOnBalkanArastirmaEnstitusuPageButton(){elementHelper.click(BalkanArastirmaEnstitusuPageButton);}
    public void ClickOnFenBilimleriEnstitusuPageButton(){elementHelper.click(FenBilimleriEnstitusuPageButton);}
    public String ShouldSeeFenBilimleriEnstitusuPage(){return elementHelper.getUrl();}
    public void ClickOnRomanDiliVeKulturuArastirmalariEnstitusuPageButton(){elementHelper.click(RomanDiliVeKulturuArastirmalariEnstitusuPageButton);}
    public String ShouldSeeRomanDiliVeKulturuArastirmalariEnstitusuPage(){return elementHelper.getUrl();}
    public void ClickOnSaglikBilimleriEnstitusuPageButton(){elementHelper.click(SaglikBilimleriEnstitusuPageButton);}
    public String ShouldSeeSaglikBilimleriEnstitusuPage(){return elementHelper.getUrl();}
    public void ClickOnSosyalBilimlerEnstitusuPageButton(){elementHelper.click(SosyalBilimlerEnstitusuPageButton);}
    public String ShouldSeeSosyalBilimlerEnstitusuPage(){return elementHelper.getUrl();}
    public void ClickOnArastirmaVeUygulamaMerkezleriPageButton(){elementHelper.click(ArastirmaVeUygulamaMerkezleriPageButton);}
    public String ShouldSeeArastirmaVeUygulamaMerkezleriPage(){return elementHelper.getUrl();}
    public void ClickOnUNESCOChairOfQualityEducationDigitalTranformationPageButton(){elementHelper.click(UNESCOChairOfQualityEducationDigitalTranformationPageButton);}
    public String ShouldSeeUNESCOChairOfQualityEducationDigitalTranformationPage(){return elementHelper.getUrl();}
    public void ClickOnDisHekimligiFakultesiPageButton(){elementHelper.click(DisHekimligiFakultesiPageButton);}
    public String ShouldSeeDisHekimligiFakultesiPageButton(){return elementHelper.getUrl();}
    public void ClickOnEczacilikFakultesiPageButton(){elementHelper.click(EczacilikFakultesiPageButton);}
    public String ShouldSeeEczacilikFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnEdebiyatFakultesiPageButton(){elementHelper.click(EdebiyatFakultesiPageButton);}
    public String ShouldSeeEdebiyatFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnEgitimFakultesiPageButton(){elementHelper.click(EgitimFakultesiPageButton);}
    public String ShouldSeeEgitimFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnFenFakultesiPageButton(){elementHelper.click(FenFakultesiPageButton);}
    public String ShouldSeeFenFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnGuzelSanatlarFakultesiPageButton(){elementHelper.click(GuzelSanatlarFakultesiPageButton);}
    public String ShouldSeeGuzelSanatlarFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnIktisadiVeIdariBilimlerFakultesiPageButton(){elementHelper.click(IktisadiVeIdariBilimlerFakultesiPageButton);}
    public String ShouldSeeIktisadiVeIdariBilimlerFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnIlahiyatFakultesiPageButton(){ elementHelper.click(IlahiyatFakultesiPageButton);}
    public String ShouldSeeIlahiyatFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnKirpinarSporBilimleriFakultesiPageButton(){elementHelper.click(KirpinarSporBilimleriFakultesiPageButtonrastirmaEnstitusuPageButton);}
    public String ShouldSeeKirpinarSporBilimleriFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnMimarlikFakultesiPageButton(){elementHelper.click(MimarlikFakultesiPageButton);}
    public String ShouldSeeMimarlikFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnMuhendislikFakultesiPageButton(){elementHelper.click(MuhendislikFakultesiPageButton);}
    public String ShouldSeeMuhendislikFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnSaglikBilimleriFakultesiPageButton(){elementHelper.click(SaglikBilimleriFakultesiPageButton);}
    public String ShouldSeeSaglikBilimleriFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnTipFakultesiPageButton(){elementHelper.click(TipFakultesiPageButton);}
    public String ShouldSeeTipFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnUygulamaliBilimlerFakultesiPageButton(){ elementHelper.click(UygulamaliBilimlerFakultesiPageButton);}
    public String ShouldSeeUygulamaliBilimlerFakultesiPage(){return elementHelper.getUrl();}
    public void ClickOnDevletKonservatuvariPageButton(){elementHelper.click(DevletKonservatuvariPageButton);}
    public String ShouldSeeDevletKonservatuvariPage(){return elementHelper.getUrl();}
    public void ClickOnKesanHakkiYorukSaglikYuksekokuluPageButton(){elementHelper.click(KesanHakkiYorukSaglikYuksekokuluPageButton);}
    public String ShouldSeeKesanHakkiYorukSaglikYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnKesanYusufCaprazUygulamaliBilimlerYuksekokuluPageButton(){elementHelper.click(KesanYusufCaprazUygulamaliBilimlerYuksekokuluPageButton);}
    public String ShouldSeeKesanYusufCaprazUygulamaliBilimlerYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnUzunkopruUygulamaliBilimlerYuksekokuluPageButton(){elementHelper.click(UzunkopruUygulamaliBilimlerYuksekokuluPageButton);}
    public String ShouldSeeUzunkopruUygulamaliBilimlerYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnYabanciDillerYuksekokuluPageButton(){elementHelper.click(YabanciDillerYuksekokuluPageButton);}
    public String ShouldSeeYabanciDillerYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnArdaMeslekYuksekokuluPageButton(){elementHelper.click(ArdaMeslekYuksekokuluPageButton);}
    public String ShouldSeeArdaMeslekYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnEdirneSosyalBilimlerMeslekYuksekokuluPageButton(){ elementHelper.click(EdirneSosyalBilimlerMeslekYuksekokuluPageButton);}
    public String ShouldSeeEdirneSosyalBilimlerMeslekYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnEdirneTeknikBilimlerMeslekYuksekokuluPageButton(){elementHelper.click(EdirneTeknikBilimlerMeslekYuksekokuluPageButton);}
    public String ShouldSeeEdirneTeknikBilimlerMeslekYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnHavsaMeslekYuksekokuluPageButton(){elementHelper.click(HavsaMeslekYuksekokuluPageButton);}
    public String ShouldSeeHavsaMeslekYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnIpsalaMeslekYuksekokuluPageButton(){elementHelper.click(IpsalaMeslekYuksekokuluPageButton);}
    public String ShouldSeeIpsalaMeslekYuksekokuluPage(){return elementHelper.getUrl();}
    public void ClickOnKesanMeslekYuksekokuluPageButton(){elementHelper.click(KesanMeslekYuksekokuluPageButton);}
    public String ShouldSeeKesanMeslekYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnSaglikHizmetleriMeslekYuksekokuluPageButton(){elementHelper.click(SaglikHizmetleriMeslekYuksekokuluPageButton);}
    public String ShouldSeeSaglikHizmetleriMeslekYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnSehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPageButton(){elementHelper.click(SehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPageButton);}
    public String ShouldSeeSehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnTuncaMeslekYuksekokuluPageButton(){elementHelper.click(TuncaMeslekYuksekokuluPageButton);}
    public String ShouldSeeTuncaMeslekYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnUzunkopruMeslekYuksekokuluPageButton(){elementHelper.click(UzunkopruMeslekYuksekokuluPageButton);}
    public String ShouldSeeUzunkopruMeslekYuksekokuluPageButton(){return elementHelper.getUrl();}
    public void ClickOnIdariButton(){ elementHelper.click(IdariButton);}
    public String ShouldSeeIdariButton(){return elementHelper.getUrl();}
    public void ClickOnGenelSekreterlikPageButton(){elementHelper.click(GenelSekreterlikPageButton);}
    public String ShouldSeeGenelSekreterlikPageButton(){return elementHelper.getUrl();}
    public void ClickOnBilgiIslemDaireBaskanligiPageButton(){elementHelper.click(BilgiIslemDaireBaskanligiPageButton);}
    public String ShouldSeeBilgiIslemDaireBaskanligiPageButtone(){return elementHelper.getUrl();}
    public void ClickOnHukukMusavirligiPageButton(){elementHelper.click(HukukMusavirligiPageButton);}
    public String ShouldSeeHukukMusavirligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnIcDenetimBirimiPageButton(){elementHelper.click(IcDenetimBirimiPageButton);}
    public String ShouldSeeIcDenetimBirimiPageButton(){return elementHelper.getUrl();}
    public void ClickOnIdariVeMaliIslerDaireBaskanligiPageButton(){elementHelper.click(IdariVeMaliIslerDaireBaskanligiPageButton);}
    public String ShouldSeeIdariVeMaliIslerDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnKutuphaneVeDokumantasyonDaireBaskanligiPageButton(){elementHelper.click(KutuphaneVeDokumantasyonDaireBaskanligiPageButton);}
    public String ShouldSeeKutuphaneVeDokumantasyonDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnOgrenciIsleriDaireBaskanligiPageButton(){elementHelper.click(OgrenciIsleriDaireBaskanligiPageButton);}
    public String ShouldSeeOgrenciIsleriDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnPersonelDaireBaskanligiPageButton(){elementHelper.click(PersonelDaireBaskanligiPageButton);}
    public String ShouldSeePersonelDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnSaglikKulturVeSporDaireBaskanligiPageButton(){elementHelper.click(SaglikKulturVeSporDaireBaskanligiPageButton);}
    public String ShouldSeeSaglikKulturVeSporDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnStratejiGelistirmeDaireBaskanligiPageButton(){ elementHelper.click(StratejiGelistirmeDaireBaskanligiPageButton);}
    public String ShouldSeeStratejiGelistirmeDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnTUHastanesiBasmudurluguPageButton(){elementHelper.click(TUHastanesiBasmudurluguPageButton);}
    public String ShouldSeeTUHastanesiBasmudurluguPageButton(){return elementHelper.getUrl();}
    public void ClickOnYapiIsleriVeTeknikDaireBaskanligiPageButton(){elementHelper.click(YapiIsleriVeTeknikDaireBaskanligiPageButton);}
    public String ShouldSeeYapiIsleriVeTeknikDaireBaskanligiPageButton(){return elementHelper.getUrl();}
    public void ClickOnDonerSermayeIsletmeMudurluguPageButton(){elementHelper.click(DonerSermayeIsletmeMudurluguPageButton);}
    public String ShouldSeeDonerSermayeIsletmeMudurluguPageButton(){return elementHelper.getUrl();}
    public void ClickOnClickOnOgrenciButton(){elementHelper.click(ClickOnOgrenciButton);}
    public void ClickOnClickOnYabanciUyrukluOgrenciOfisiPageButton(){elementHelper.click(YabanciUyrukluOgrenciOfisiPageButton);}
    public String ShouldSeeYabanciUyrukluOgrenciOfisiPageButton(){return elementHelper.getUrl();}
    public void ClickOnEEgitimButton(){elementHelper.click(EEgitimButton);}
    public void ClickOnKaliteGuvencesiButton(){ elementHelper.click(KaliteGuvencesiButton);}
    public String ShouldSeeKaliteGuvencesiButton(){return elementHelper.getUrl();}
    public void ClickOnEnglishButton(){elementHelper.click(EnglishButton);}
    public String ShouldSeeEnglishTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeEnglishHomePage(){return elementHelper.getUrl();}
    public void ClickOnKullaniciGirisiButton(){elementHelper.click(KullaniciGirisiButton);}
    public String ShouldSeeTeknoktaPage(){return elementHelper.getUrl();}
    public String ShouldSeeRektorYardimcilariGorevDagilimiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public void ClickOnMetinAydogduButton(){elementHelper.click(EnglishButton);}
    public String ShouldSeeOgrenciIsleriDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeBilgiIslemDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeFakultelerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeTeknoparkTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeBEKTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeYenilikcilikVeGirisimcilikTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeOYPTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeZorunluOrtakDerslerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeBilimselDergilerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeEnstitulerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeDisKaynakliProjelerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeOnDegerlendirmeKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeYazOkuluTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSinaiMulkiyetDegerlendirmeKuruluTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeTeknolojiTransferUygulamaVeArastirmaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public void ClickOnOsmanNuriHatipogluButton(){elementHelper.click(OsmanNuriHatipogluButton);}
    public String ShouldSeeStratejiGelistirmeDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeYapiIsleriVeTeknikDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeIdariVeMaliIslerDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeBilimselArastirmaProjeleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSaglikArasirmaVeUygulamaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeAgizVeDisSagligiUygulamaVeArastirmaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSagliklaIlgiliDigerArastirmaVeUygulamaMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeTUDonerSermayeYurutmeKuruluBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeKiralamaIslemleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeUAKTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSaglikBilimleriBilimselArastirmaVeYayınEtigiKurulBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeDisIliskilerMerkezMudurluguTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public void ClickOnAhmetHamdiZaferButton(){elementHelper.click(AhmetHamdiZaferButton);}
    public String ShouldSeeKutuphaneVeDokumantasyonDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSaglikKulturVeSporDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeKongreMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeGuzelSanatlarFakultesiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeDevletKonservatuvariTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeBalkanArastirmaEnstitusuTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeIIBayezitKulliyesiIcerisindekiKuruluslarTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeLojmanlarTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeArastirmaVeUygulamaMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSivilToplumOrgutleriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeSosyalFaaliyetlerTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeYuksekokullarVeMeslekYuksekokullariTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeEngelsizUniversiteBirimiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeUniversiteTurizmIliskileriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeTrakyaUniversitelerBirligiTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeBalkanArboretumuVeEDTUHerbaryumuTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeMevzuatKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getText(EnglishTitleOnRektorYardimcilariGorevDagilimiPage);}
    public String ShouldSeeUniversiteYerelYonetimIlıskileriTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}
    public String ShouldSeeYayinKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(){return elementHelper.getUrl();}

}
