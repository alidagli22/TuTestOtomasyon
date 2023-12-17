package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class YonetimBilisimPage {
    private ElementHelper elementHelper;

    public YonetimBilisimPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private By TrakyaUniversi = By.cssSelector("");
    private By FakultemizButton = By.cssSelector("");
    private By PersonelimizButton = By.cssSelector("");
    private By OgrenciButton = By.cssSelector("");
    private By TrakyaUniversityAmblem = By.cssSelector("");
    private By Title = By.cssSelector("");
    private By InstagramButton = By.cssSelector("");
    private By AnasayfaTitle = By.cssSelector("");
    private By DuyurularTitle = By.cssSelector("");
    private By HaberlerTitle = By.cssSelector("");
    private By BolumBaskanindanButton = By.cssSelector("");
    private By AdayOgrenciButton = By.cssSelector("");
    private By DersProgramiButton = By.cssSelector("");
    private By DijitalDonusumButton = By.cssSelector("");
    private By OgrenciEPostaButton = By.cssSelector("");
    private By KurumsalKimlikButton = By.cssSelector("");
    private By PersonelWebHavuzuButton = By.cssSelector("");
    private By ERehberButton = By.cssSelector("");
    private By IhaleIlanlariButton = By.cssSelector("");
    private By AylikYemekListesiButton = By.cssSelector("");
    private By SiteHaritasiButton = By.cssSelector("");
    private By SayfaSorumlulariButton = By.cssSelector("");
    private By TrakyaUniversitesiButton = By.cssSelector("");
    private By TrakyaUniversitesiPage = By.cssSelector("");
    private By FakultemizPage = By.cssSelector("");
    private By BolumumuzButton = By.cssSelector("");
    private By BolumumuzPage = By.cssSelector("");
    private By YonetimButtonOnPersonelimiz = By.cssSelector("");
    private By AkademikPersonelOnPersonelimiz = By.cssSelector("");
    private By AkademikPersonelPage = By.cssSelector("");
    private By IdariPersonelOnPersonelimiz = By.cssSelector("");
    private By IdariPersonelPage = By.cssSelector("");
    private By AnabilimDallariButton = By.cssSelector("");
    private By AnabilimDallariPage = By.cssSelector("");
    private By BolognaButton = By.cssSelector("");
    private By BolognaPage = By.cssSelector("");
    private By DanismanListesiButton = By.cssSelector("");
    private By DanismanListesiPage = By.cssSelector("");
    private By DersPlaniButton = By.cssSelector("");
    private By DersPlaniPage = By.cssSelector("");
    private By HaftalikDersProgramlariButton = By.cssSelector("");
    private By HaftalikDersProgramlariPage = By.cssSelector("");
    private By AkademikTakvimButton = By.cssSelector("");
    private By AkademikTakvimPage = By.cssSelector("");
    private By IletisimButton = By.cssSelector("");
    private By IletisimPage = By.cssSelector("");
    private By OneriVeSikayetButton = By.cssSelector("");
    private By OneriVeSikayetPage = By.cssSelector("");




    public void userOnTheYonetimBilisimHomePage () {
        elementHelper.openUrl("https://ybs.trakya.edu.tr/");
    }

    public void ShouldSeeTrakyaUniversi() {
        elementHelper.checkElement(TrakyaUniversi);
    }

    public void ShouldSeeFakultemizButton() {
        elementHelper.checkElement(FakultemizButton);
    }

    public void ShouldSeeBolumumuzButton() {
        elementHelper.checkElement(BolumumuzButton);
    }

    public void ShouldSeePersonelimizButton() {
        elementHelper.checkElement(PersonelimizButton);
    }

    public void ShouldSeeAnabilimDallariButton() {
        elementHelper.checkElement(AnabilimDallariButton);
    }

    public void ShouldSeeOgrenciButton() {
        elementHelper.checkElement(OgrenciButton);
    }

    public void SouldSeeIletisimButton() {
        elementHelper.checkElement(IletisimButton);
    }

    public void ShouldSeeOneriVeSikayetButton() {
        elementHelper.checkElement(OneriVeSikayetButton);
    }

    public void ShouldSeeTrakyaUniversityAmblem() {
        elementHelper.checkElement(TrakyaUniversityAmblem);
    }

    public String ShouldSeeTitle() {
        return elementHelper.getText(Title);
    }

    public void ShouldSeeInstagramButton() {
        elementHelper.checkElement(InstagramButton);
    }

    public void ShouldSeeAnasayfaTitle() {
        elementHelper.checkElement(AnasayfaTitle);
    }

    public void ShouldSeeDuyurularTitle() {
        elementHelper.checkElement(DuyurularTitle);
    }

    public void ShouldSeeHaberlerTitle() {
        elementHelper.checkElement(HaberlerTitle);
    }

    public void ShouldSeeBolumBaskanindanButton() {
        elementHelper.checkElement(BolumBaskanindanButton);
    }

    public void ShouldSeeAdayOgrenciButton() {
        elementHelper.checkElement(AdayOgrenciButton);
    }

    public void ShouldSeeAkademikTakvimButton() {
        elementHelper.checkElement(AkademikTakvimButton);
    }

    public void ShouldSeeDersProgramiButton() {
        elementHelper.checkElement(DersProgramiButton);
    }

    public void ShouldSeeDijitalDonusumButton() {
        elementHelper.checkElement(DijitalDonusumButton);
    }

    public void ShouldSeeOgrenciEPostaButton() {
        elementHelper.checkElement(OgrenciEPostaButton);
    }

    public void ShouldSeeBolognaButton() {
        elementHelper.checkElement(BolognaButton);
    }

    public void ShouldSeeKurumsalKimlikButton() {
        elementHelper.checkElement(KurumsalKimlikButton);
    }

    public void ShouldSeePersonelWebHavuzuButton() {
        elementHelper.checkElement(PersonelWebHavuzuButton);
    }

    public void ShouldSeeERehberButton() {
        elementHelper.checkElement(ERehberButton);
    }

    public void ShouldSeeIhaleIlanlariButton() {
        elementHelper.checkElement(IhaleIlanlariButton);
    }

    public void ShouldSeeAylikYemekListesiButton() {
        elementHelper.checkElement(AylikYemekListesiButton);
    }

    public void ShouldSeeSiteHaritasiButton() {
        elementHelper.checkElement(SiteHaritasiButton);
    }

    public void ShouldSeeSayfaSorumlulariButton() {
        elementHelper.checkElement(SayfaSorumlulariButton);
    }

    public void ClickOnTrakyaUniversitesiButton() {
        elementHelper.click(TrakyaUniversitesiButton);
    }

    public void ShouldSeeTrakyaUniversitesiPage() {
        elementHelper.checkElement(TrakyaUniversitesiPage);
    }

    public void ClickOnFakultemizButton() {
        elementHelper.click(FakultemizButton);
    }

    public void ShouldSeeFakultemizPage() {
        elementHelper.checkElement(FakultemizPage);
    }

    public void ClickOnBolumumuzButton() {
        elementHelper.click(BolumumuzButton);
    }

    public void ShouldSeeBolumumuzPage() {
        elementHelper.checkElement(BolumumuzPage);
    }

    public void ClickOnYonetimButtonOnPersonelimiz() {
        elementHelper.click(YonetimButtonOnPersonelimiz);
    }

    public void ClickOnAkademikPersonelOnPersonelimiz() {
        elementHelper.click(AkademikPersonelOnPersonelimiz);
    }

    public void ShouldSeeAkademikPersonelPage() {
        elementHelper.checkElement(AkademikPersonelPage);
    }

    public void ClickOnIdariPersonelOnPersonelimiz() {
        elementHelper.click(IdariPersonelOnPersonelimiz);
    }

    public void ShouldSeeIdariPersonelPage() {
        elementHelper.checkElement(IdariPersonelPage);
    }

    public void ClickOnAnabilimDallariButton() {
        elementHelper.click(AnabilimDallariButton);
    }

    public void ShouldSeeAnabilimDallariPage() {
        elementHelper.checkElement(AnabilimDallariPage);
    }

    public void ClickOnBolognaButton() {
        elementHelper.click(BolognaButton);
    }

    public void SohuldSeeBolognaPage() {
        elementHelper.checkElement(BolognaPage);
    }

    public void ClickOnDanismanListesiButton() {
        elementHelper.click(DanismanListesiButton);
    }

    public void ShouldSeeDanismanListesiPage() {
        elementHelper.checkElement(DanismanListesiPage);
    }

    public void ClickOnDersPlaniButton() {
        elementHelper.click(DersPlaniButton);
    }

    public void ShouldSeeDersPlaniPage() {
        elementHelper.checkElement(DersPlaniPage);
    }

    public void ClickOnHaftalikDersProgramlariButton() {
        elementHelper.click(HaftalikDersProgramlariButton);
    }

    public void ShouldSeeHaftalikDersProgramlariPage() {
        elementHelper.checkElement(HaftalikDersProgramlariPage);
    }

    public void ClickOnAkademikTakvimButton() {
        elementHelper.click(AkademikTakvimButton);
    }

    public void ShouldSeeAkademikTakvimPage() {
        elementHelper.checkElement(AkademikTakvimPage);
    }

    public void ClickOnIletisimButton() {
        elementHelper.click(IletisimButton);
    }

    public void ShouldSeeIletisimPage() {
        elementHelper.checkElement(IletisimPage);
    }

    public void ClickOnOneriVeSikayetButton() {
        elementHelper.click(OneriVeSikayetButton);
    }

    public void ShouldSeeOneriVeSikayetPage() {
        elementHelper.checkElement(OneriVeSikayetPage);
    }
}
