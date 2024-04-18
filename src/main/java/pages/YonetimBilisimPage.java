package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class YonetimBilisimPage {
    private ElementHelper elementHelper;

    public YonetimBilisimPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private By TrakyaUniversi = By.cssSelector("By.cssSelector(\"#navcoll [href='http://www.trakya.edu.tr']\")");
    private By FakultemizButton = By.cssSelector("By.cssSelector(\"#navcoll [href='https://ubf.trakya.edu.tr/']\")");
    private By PersonelimizButton = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(4) > .dropdown-toggle\")");
    private By OgrenciButton = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(6) > .dropdown-toggle\")");
    private By TrakyaUniversityAmblem = By.cssSelector("By.cssSelector(\"[src='https://ybs.trakya.edu.tr/admin/tools/theme/units_themev2/images/logo.png']\")");
    private By Title = By.cssSelector("By.cssSelector(\".brand-span-large\")");
    private By InstagramButton = By.cssSelector("By.cssSelector(\"ul:nth-of-type(2) [href='http://instagram.com/ybstrakya']\")");
    private By AnasayfaTitle = By.cssSelector("By.cssSelector(\".text > [href='https://ybs.trakya.edu.tr/']\")");
    private By DuyurularTitle = By.cssSelector("By.cssSelector(\".block-region-1 > div:nth-of-type(1) > .title\")");
    private By HaberlerTitle = By.cssSelector("By.cssSelector(\".block-region-1 > div:nth-of-type(2) > .title\")");
    private By BolumBaskanindanButton = By.cssSelector("By.cssSelector(\".image_btn [href='https://ybs.trakya.edu.tr/news/bolum-baskanimizdan-aday-ogrencilerimize'] > span:nth-of-type(1)\")");
    private By AdayOgrenciButton = By.cssSelector("By.cssSelector(\".image_btn td:nth-of-type(2) > [target='_blank']\")");
    private By DersProgramiButton = By.cssSelector("By.cssSelector(\".image_btn > li:nth-of-type(4) span:nth-of-type(1)\")");
    private By DijitalDonusumButton = By.cssSelector("By.cssSelector(\".image_btn [href='https://tudijit.trakya.edu.tr/'] > span:nth-of-type(1)\")");
    private By OgrenciEPostaButton = By.cssSelector("By.cssSelector(\".image_btn [href='https://sifresifirla.trakya.edu.tr/'] > span:nth-of-type(1)\")");
    private By KurumsalKimlikButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='http://kurumsalkimlik.trakya.edu.tr/']\")");
    private By PersonelWebHavuzuButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='https://www.trakya.edu.tr/personel/']\")");
    private By ERehberButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='https://www.trakya.edu.tr/erehber/']\")");
    private By IhaleIlanlariButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='http://ihale.trakya.edu.tr']\")");
    private By AylikYemekListesiButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='https://www.trakya.edu.tr/yemeklistesi']\")");
    private By SiteHaritasiButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='https://ybs.trakya.edu.tr/sitemap/']\")");
    private By SayfaSorumlulariButton = By.cssSelector("By.cssSelector(\".abstract > .content > .minilinks [href='https://ybs.trakya.edu.tr/sayfa-sorumlulari']\")");
    private By TrakyaUniversitesiButton = By.cssSelector("By.cssSelector(\"[src='https://ybs.trakya.edu.tr/admin/tools/theme/units_themev2/images/logo.png']\")");
    private By TrakyaUniversitesiPage = By.cssSelector("By.cssSelector(\"#navcoll [href='http://www.trakya.edu.tr']\")");
    private By FakultemizPage = By.cssSelector("By.cssSelector(\"#navcoll [href='https://ubf.trakya.edu.tr/']\")");
    private By BolumumuzButton = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(3) > .dropdown-toggle\")");
    private By BolumumuzPage = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(3) > .dropdown-toggle\")");
    private By YonetimButtonOnPersonelimiz = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='https://ubf.trakya.edu.tr/staff/yonetim']\")");
    private By AkademikPersonelOnPersonelimiz = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/yonetim-bilisim-sistemleri']\")");
    private By AkademikPersonelPage = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/yonetim-bilisim-sistemleri']\")");
    private By IdariPersonelOnPersonelimiz = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/yonetim-bilisim-sistemleri']\")");
    private By IdariPersonelPage = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/yonetim-bilisim-sistemleri']\")");
    private By AnabilimDallariButton = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(5) > [href='javascript:void(0);']\")");
    private By AnabilimDallariPage = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(5) > [href='javascript:void(0);']\")");
    private By BolognaButton = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(5) > [href='javascript:void(0);']\")");
    private By BolognaPage = By.cssSelector("By.cssSelector(\"#navcoll > .nav > li:nth-of-type(5) > [href='javascript:void(0);']\")");
    private By DanismanListesiButton = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/bolum-danismanlari']\")");
    private By DanismanListesiPage = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='http://ybs.trakya.edu.tr/staff/bolum-danismanlari']\")");
    private By DersPlaniButton = By.cssSelector("By.cssSelector(\"#navcoll li:nth-of-type(4) > [target='_blank']\")");
    private By DersPlaniPage = By.cssSelector("By.cssSelector(\"#navcoll li:nth-of-type(4) > [target='_blank']\")");
    private By HaftalikDersProgramlariButton = By.cssSelector("By.cssSelector(\"#navcoll .dropdown-menu [href='javascript:void(0);']\")");
    private By HaftalikDersProgramlariPage = By.cssSelector("By.cssSelector(\"#navcoll .dropdown-menu [href='javascript:void(0);']\")");
    private By AkademikTakvimButton = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='https://akademiktakvim.trakya.edu.tr/']\")");
    private By AkademikTakvimPage = By.cssSelector("By.cssSelector(\".dropdown-toggle[href='https://akademiktakvim.trakya.edu.tr/']\")");
    private By IletisimButton = By.cssSelector("By.cssSelector(\"#navcoll .dropdown-menu [href='javascript:void(0);']\")");
    private By IletisimPage = By.cssSelector("By.cssSelector(\"#navcoll .dropdown-menu [href='javascript:void(0);']\")");
    private By OneriVeSikayetButton = By.cssSelector("By.cssSelector(\"#navcoll li:nth-of-type(8) > [target='_blank']\")");
    private By OneriVeSikayetPage = By.cssSelector("By.cssSelector(\"#navcoll li:nth-of-type(8) > [target='_blank']\")");




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
