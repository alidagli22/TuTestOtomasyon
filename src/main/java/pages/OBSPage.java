package pages;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OBSPage {
    private ElementHelper elementHelper;

    public OBSPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By eposta = By.cssSelector("");
    private By sifre = By.cssSelector("");
    private By LoginButton = By.cssSelector("");
    private By OBSButton = By.cssSelector("");
    private By kapatbutton = By.cssSelector("");
    private By ogrencititle = By.cssSelector(".col-md-10 > div:nth-of-type(1) > div:nth-of-type(1) dt");
    private By AnaAdi = By.cssSelector("");
    private By DogumYeri = By.cssSelector("");
    private By Sinif = By.cssSelector("");
    private By IkincilEPosta = By.cssSelector("");
    private By GSM = By.cssSelector("");
    private By DanismanEPosta = By.cssSelector("");
    private By Birim =By.cssSelector("");
    private By Program =By.cssSelector("");
    private By MufredatAdi =By.cssSelector("");
    private By TCKimlik =By.cssSelector("");
    private By BabaAdi =By.cssSelector("");
    private By YariYil =By.cssSelector("");
    private By Danisman =By.cssSelector("");
    private By Bolum =By.cssSelector("");
    private By Durum =By.cssSelector("");
    private By AdSoyad =By.cssSelector("");
    private By DogumTarihi =By.cssSelector("");
    private By KurumsalEPoosta =By.cssSelector("");
    private By AnaBilimDali =By.cssSelector("");
    private By OgrenciBilgileriButton =By.cssSelector("");
    private By DersProgramiButton =By.cssSelector("");
    private By DersProgrami =By.cssSelector("");
    private By Pazartesi =By.cssSelector("");
    private By Sali =By.cssSelector("");
    private By Carsamba =By.cssSelector("");
    private By Persembe =By.cssSelector("");
    private By Cuma =By.cssSelector("");
    private By Cumartesi =By.cssSelector("");
    private By Pazar =By.cssSelector("");
    private By GoogleClassroomButton =By.cssSelector("");
    private By GoogleClassroom =By.cssSelector("");
    private By DersMufraddatiButton =By.cssSelector("");
    private By DersMufredati =By.cssSelector("");
    private By DevamDurumuButton =By.cssSelector("");
    private By DevamDurumu =By.cssSelector("");
    private By SinavProgramiButton =By.cssSelector("");
    private By SinavProgrami =By.cssSelector("");
    private By AkademikTakvimButton =By.cssSelector("");
    private By AkademikTakvim =By.cssSelector("");
    private By AktiviteTakvimGecmistir =By.cssSelector("");
    private By AktiviteTarihiIcerisindesiniz =By.cssSelector("");
    private By AktiviteTarihiGelmemistir =By.cssSelector("");
    private By OgrenciBilgi =By.cssSelector("");
    private By OgrenciDisiplinCezalariButton =By.cssSelector("");
    private By OgrenciDisiplinCezalari =By.cssSelector("");
    private By TaleplerimButton =By.cssSelector("");
    private By Taleplerim =By.cssSelector("");
    private By KayitYeniilemeIslemleriButton =By.cssSelector("");
    private By DersKayirIslemleriButton =By.cssSelector("");
    private By OgrenciNo =By.cssSelector("");
    private By DKIProgram =By.cssSelector("");
    private By DKIAdSoyad =By.cssSelector("");
    private By DersKayitIslemleri =By.cssSelector("");
    private By DKIBirim =By.cssSelector("");
    private By DKIAnaBilimDali =By.cssSelector("");
    private By HarcBorcu =By.cssSelector("");
    private By NotIslemleri =By.cssSelector("");
    private By NotGoruntulemeButton =By.cssSelector("");
    private By NotGoruntuleme =By.cssSelector("");
    private By YuksekOnurBelgesiButton =By.cssSelector("");
    private By YuksekOnurBelgesi =By.cssSelector("");
    private By SinavTalepIslemleriButton =By.cssSelector("");
    private By MuafiyetBasvurusuButton =By.cssSelector("");
    private By ErasmusBasvuruIslemleriButton =By.cssSelector("");
    private By ErasmusBasvurulariButton =By.cssSelector("");
    private By ErasmusBasvurulari =By.cssSelector("");
    private By  HarcBorcIslemleriButton=By.cssSelector("");
    private By BankaBilgilerimButton =By.cssSelector("");
    private By BankaBilgilerim =By.cssSelector("");
    private By HarcBorcBilgileriButton =By.cssSelector("");
    private By HarcBilgileri =By.cssSelector("");
    private By BasvuruIslemleriButton =By.cssSelector("");
    private By CAPVeYAPBasvurulariButton =By.cssSelector("");
    private By AdayBaşvurulari =By.cssSelector("");
    private By BasvuruTuru =By.cssSelector("");
    private By Yil =By.cssSelector("");
    private By Donem =By.cssSelector("");
    private By KurumIciButton =By.cssSelector("");
    private By Basvurular =By.cssSelector("");
    private By StajBasvuruIslemleriButton =By.cssSelector("");
    private By BasvuruYapilabilecekAcikStajIlanlari =By.cssSelector("");
    private By StajBasvurulariniz =By.cssSelector("");
    private By Siniftitle =By.cssSelector("");
    private By Bolumtitle =By.cssSelector("");
    private By DKIDanisman =By.cssSelector("");



    public void userOnTheObsLoginPage() {
        elementHelper.openUrl("https://teknokta.trakya.edu.tr/obs");
    }

    public void userFillTheEmptyBoxesOnObsLoginPage() {
        elementHelper.sendKeys(eposta, "alidagli");
        elementHelper.sendKeys(sifre, "37114260150");
    }////

    public void userClickLogInButtonOnObsLoginPage() {
        elementHelper.click(LoginButton);
    }

    public void userClickOBSButtonOnObsLoginPage() {
        elementHelper.click(OBSButton);
    }

    public void userShouldClickKapatButtonOnObsPage() {
        elementHelper.click(kapatbutton);
    }

    public String userShouldSeeOgrenciNoTitleOnObsPage() {
        return elementHelper.getText(ogrencititle);
    }

    public String userShouldSeeAnaAdiTitleOnObsPage() {
        return elementHelper.getText(AnaAdi);
    }

    public String userShouldSeeDogumYeriTitleOnObsPage() {
        return elementHelper.getText(DogumYeri);
    }

    public String userShouldSeeSinifTitleOnObsPage() {
        return elementHelper.getText(Sinif);
    }

    public String userShouldSeeIkincilEPostaTitleOnObsPage() {
        return elementHelper.getText(IkincilEPosta);
    }

    public String userShouldSeeGSMNoTitleOnObsPage() {
        return elementHelper.getText(GSM);
    }

    public String userShouldSeeDanismanEPostaTitleOnObsPage() {
        return elementHelper.getText(DanismanEPosta);
    }
    public String userShouldSeeBirimTitleOnObsPage(){
        return elementHelper.getText(Birim);
    }
    public String userShouldSeeProgramTitleOnObsPage(){
        return  elementHelper.getText(Program);
    }
    public String userShouldSeeMufredatAdTitleOnObsPage(){
        return elementHelper.getText(MufredatAdi);
    }
    public String userShouldSeeTCKimlikNoTitleOnObsPage(){
        return elementHelper.getText(TCKimlik);
    }
    public String userShouldSeeBabaAdiTitleOnObsPage(){
        return elementHelper.getText(BabaAdi);
    }
    public String userShouldSeeYariYilTitleOnObsPage(){
        return elementHelper.getText(YariYil);
    }
    public  String userShouldSeeDanismanTitleOnObsPage(){
        return elementHelper.getText(Danisman);
    }
    public String userShouldSeeBolumTitleOnObsPage(){
        return elementHelper.getText(Bolum);
    }
    public String userShouldSeeDurumTitleOnObsPage(){
        return elementHelper.getText(Durum);
    }
    public String userShouldSeeAdSoyadTitleOnObsPage(){
        return elementHelper.getText(AdSoyad);
    }
    public String userShouldSeeDogumTarihiTitleOnObsPage(){
        return elementHelper.getText(DogumTarihi);
    }
    public String userShouldSeeKurumsalEPostaTitleOnObsPage(){
        return elementHelper.getText(KurumsalEPoosta);
    }
    public String userShouldSeeAnaBilimDaliTitleOnObsPage(){
        return elementHelper.getText(AnaBilimDali);
    }
    public void userClickOgrenciBilgileriButtonOnTheOBSPage(){
        elementHelper.click(OgrenciBilgileriButton);
    }
    public void userClickDersProgramiButtonOnTheOBSPage(){
        elementHelper.click(DersProgramiButton);
    }
    public String shouldSeeDersProgramiTitleInDersProgramiPageOnObsPage(){
        return elementHelper.getText(DersProgrami);
    }
    public String userSholudSeePazartasiTitleInDersProgramiPageOnTheObs(){
        return elementHelper.getText(Pazartesi);
    }
    public String userSholudSeeSaliTitleInDersProgramiPageOnTheObs(){
        return elementHelper.getText(Sali);
    } public String userSholudSeeCarsambaTitleInDersProgramiPageOnTheObs(){
        return elementHelper.getText(Carsamba);
    } public String userSholudSeePersembeTitleInDersProgramiPageOnTheObs(){
        return elementHelper.getText(Persembe);
    } public String userSholudSeeCumaTitleInDersProgramiPageOnTheObs(){
        return elementHelper.getText(Cuma);
    }
    public String userSholudSeeCumartesiTitleInDersProgramiPageOnTheObsPage(){
        return elementHelper.getText(Cumartesi);
    }
    public String userSholudSeePazarTitleInDersProgramiPageOnTheObsPage(){
        return elementHelper.getText(Pazar);
    }
    public void userClickGoogleClassroomButtonOnTheOBSPage(){
        elementHelper.click(GoogleClassroomButton);
    }
    public String userSholudSeeGoogleClassroomTitleInDersProgramiPageOnTheObsPage(){
        return elementHelper.getText(GoogleClassroom);
    }
    public void userClickTumDersMufreddatiButtonOnTheOBSPage(){
         elementHelper.click(DersMufraddatiButton);
    }
    public String userSholudSeeTumDersMufredatiTitleInDersProgramiPageOnTheObsPage(){
        return  elementHelper.getText(DersMufredati);
    }
    public void userClickOgrenciBilgileriButtonOnTheObsPage(){
        elementHelper.click(OgrenciBilgileriButton);
    }
    public  void userClickDevamDurumuButtonOnTheObsPage(){
        elementHelper.click(DevamDurumuButton);
    }
    public String userShouldSeeDevamDurumuTitleInDevamDurumuPageOnTheObsPage(){
        return  elementHelper.getText(DevamDurumu);
    }
    public void userClickSinavProgramiButtonOnTheObsPage(){
        elementHelper.click(SinavProgramiButton);
    }
    public String userShouldSeeSinavProgramiTitleInSinavProgramiPageOnTheObsPage(){
        return elementHelper.getText(SinavProgrami);
    }
    public void userClickOgrenciBilgileriButtonOnObsPage(){
        elementHelper.click(OgrenciBilgileriButton);
    }
    public void userClickAkademikTakvimButtonOnTheObsPage(){
        elementHelper.click(AkademikTakvimButton);
    }
    public String userShouldSeAkademikTakvimTitleInAkademikTakvimOnTheObsPage(){
        return elementHelper.getText(AkademikTakvim);
    }
    public String userShouldSeeAktiviteTakvimGecmistirTitleInAkademikTakvimPageOnTheObsPage(){
        return elementHelper.getText(AktiviteTakvimGecmistir);
    }
    public String userShouldSeeAktiviteTarihiIcerisindesinizTitleInAkademikTakvimPageOnTheObsPage(){
        return elementHelper.getText(AktiviteTarihiIcerisindesiniz);
    }
    public  String userShouldSeeAktiviteTarihiGelmemistirTitleInAkademikTakvimPageOnTheObsPage(){
        return elementHelper.getText(AktiviteTarihiGelmemistir);
    }
    public void userClickOnOgrenciBilgiButtonOnTheObsPage(){
        elementHelper.click(OgrenciBilgi);
    }
    public void userClickOgrenciDisiplinCezalariButtonOnTheObsPage(){
        elementHelper.click(OgrenciDisiplinCezalariButton);
    }
    public String userShouldSeeKaliteKoordinatorluguPageOgrenciDisiplinCezalariTitleInOgrenciDisiplinCezalariOnTheObsPage(){
        return elementHelper.getText(OgrenciDisiplinCezalari);
    }
    public void userclickOgrenciBilgileriButtonOnTheObsPage(){
        elementHelper.click(OgrenciBilgileriButton);
    }
    public void userClickTaleplerimButtonOnTheObsPage(){
        elementHelper.click(TaleplerimButton);
    }
    public String userShouldSeeTaleplerimTitleInTaleplerimPageOnTheObsPage(){
        return elementHelper.getText(Taleplerim);
    }
    public void userClickKayitYenilemeİslemleriPageOnTheObsPage(){
        elementHelper.click(KayitYeniilemeIslemleriButton);
    }
    public void userClickDersKayitIslemleriPageOnTheObsPage(){
        elementHelper.click(DersKayirIslemleriButton);
    }
    public String userShouldSeeOgrenciNoTitleInDersKayitIslemleriOnTheObsPage(){
        return  elementHelper.getText(OgrenciNo);
    }
    public String userShouldSeeSinifTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(Siniftitle);
    }
    public String userShouldSeeDanismanTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DKIDanisman);
    }
    public String userShouldSeeBolumTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(Bolumtitle);
    }
    public String userShouldSeeProgramTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DKIProgram);
    }
    public String userShouldSeeAdSoyadTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DKIAdSoyad);
    }
    public String userShouldSeeYariYilTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DersKayitIslemleri);
    }
    public String userShouldSeeBirimTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DKIBirim);
    }
    public String userShouldSeeAnaBilimDaliTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(DKIAnaBilimDali);
    }
    public String userShouldSeeHarcBorcuTitleInDersKayitIslemleriOnTheObsPage(){
        return elementHelper.getText(HarcBorcu);
    }
    public void userClickNotIslemleriButtonOnTheObsPage(){
        elementHelper.click(NotIslemleri);
    }
    public void userClickNotGoruntulemeButtonOnTheObsPage(){
        elementHelper.click(NotGoruntulemeButton);
    }
    public String userShouldSeeNotGoruntulemeTitleInNotGoruntulemeOnTheObsPage(){
        return elementHelper.getText(NotGoruntuleme);
    }
    public void userClickOnurYuksekOnurBelgesiButtonOnTheObsPage(){
        elementHelper.click(YuksekOnurBelgesiButton);
    }
    public String userShouldSeeOnurYuksekOnurBelgesiTitleInNotIslemleriOnTheObsPage(){
        return elementHelper.getText(YuksekOnurBelgesi);
    }
    public void userClickSinavTalepIslemleriButtonOnTheObsPage(){
        elementHelper.click(SinavTalepIslemleriButton);
    }
    public void userClickMuafiyetBasvurusuButtonOnTheObsPage(){
        elementHelper.click(MuafiyetBasvurusuButton);
    }
    public void userClickErasmusBasvuruIslemleriButtonOnTheObsPage(){
        elementHelper.click(ErasmusBasvuruIslemleriButton);
    }
    public void userClickErasmusBasvurulariButtonOnTheObsPage(){
        elementHelper.click(ErasmusBasvurulariButton);
    }
    public String shouldSeeErasmusBasvurulariTitleInErasmusBasvuruIslemleriOnTheObsPage(){
        return elementHelper.getText(ErasmusBasvurulari);
    }
    public void userClickHarcBorcIslemleriButtonOnTheObsPage(){
        elementHelper.click(HarcBorcIslemleriButton);
    }
    public void userClickBankaBilgilerimButtonOnTheObsPage(){
        elementHelper.click(BankaBilgilerimButton);
    }
    public String userShouldSeeBankaBilgilerimTitleInHarcBorcIslemleriOnTheObsPage(){
        return elementHelper.getText(BankaBilgilerim);
    }
    public void userClickHarcBorcBilgileriButtonOnTheObsPage(){
        elementHelper.click(HarcBorcBilgileriButton);
    }
    public String userShouldSeeHarcBilgileriTitleInHarcBorcIslemleriOnTheObsPage(){
        return elementHelper.getText(HarcBilgileri);
    }
    public void userClickBasvuruIslemleriButtonOnTheObsPage(){
        elementHelper.click(BasvuruIslemleriButton);
    }
    public void userClickCAPVeYAPBasvurulariButtonOnTheObsPage(){
        elementHelper.click(CAPVeYAPBasvurulariButton);
    }
    public String userShouldSeeAdayBaşvurulariTitleInCAPVeYAPBasvurulariOnTheObsPage(){
        return elementHelper.getText(AdayBaşvurulari);
    }
    public String userShouldSeeBasvuruTuruTitleInCAPVeYAPBasvurulariOnTheObsPage(){
        return elementHelper.getText(BasvuruTuru);
    }
    public String userShouldSeeYilTitleInCAPVeYAPBasvurulariOnTheObsPage(){
        return elementHelper.getText(Yil);
    }
    public String userShouldSeeDonemTitleInCAPVeYAPBasvurulariOnTheObsPage(){
        return elementHelper.getText(Donem);
    }
    public void userClickKurumIciButtonOnTheObsPage(){
        elementHelper.click(KurumIciButton);
    }
    public String userShouldSeeBasvurularTitleInBasvuruIslemleriOnTheObsPage(){
        return elementHelper.getText(Basvurular);
    }
    public void userClickStajBasvuruIslemleriButtonOnTheObsPage(){
        elementHelper.click(StajBasvuruIslemleriButton);
    }
    public String userShouldSeeBasvuruYapilabilecekAcıkStajIlanlariTitleInStajBasvuruIslemleriOnTheObsPage(){
        return elementHelper.getText(BasvuruYapilabilecekAcikStajIlanlari);
    }
    public String userShouldSeeStajBasvurularinizTitleInStajBasvuruIslemleriOnTheObsPage(){
        return elementHelper.getText(StajBasvurulariniz);
    }





}
