package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.RektorPage;
import pages.YonetimBilisimPage;
import utils.DriverFactory;

public class YonetimBilisimDefinitions {
    YonetimBilisimPage yonetim = new YonetimBilisimPage(DriverFactory.getDriver());

    @Given("user on the Yonetim Bilisim Home Page")
    public void userOnTheYonetimBilisimHomePage() {
        yonetim.userOnTheYonetimBilisimHomePage();
    }

    @Then("user should see Trakya Universitesi Button")
    public void userShouldSeeTrakyaUniversitesiButton() {
        yonetim.ShouldSeeTrakyaUniversi();
    }

    @Then("user should see Fakultemiz Button")
    public void userShouldSeeFakultemizButton() {
        yonetim.ShouldSeeFakultemizButton();
    }

    @Then("user should see Bolumumuz button")
    public void userShouldSeeBolumumuzButton() {
        yonetim.ShouldSeeBolumumuzButton();
    }

    @Then("user should see Personelimiz Button")
    public void userShouldSeePersonelimizButton() {
        yonetim.ShouldSeePersonelimizButton();
    }

    @Then("user should see Anabilim Dallari Button")
    public void userShouldSeeAnabilimDallariButton() {
        yonetim.ShouldSeeAnabilimDallariButton();
    }

    @Then("user should see Ogrenci Button")
    public void userShouldSeeOgrenciButton() {
        yonetim.ShouldSeeOgrenciButton();
    }

    @Then("user sould see Iletisim Button")
    public void userSouldSeeIletisimButton() {
        yonetim.SouldSeeIletisimButton();
    }

    @Then("user should see Oneri ve Sikayet Button")
    public void userShouldSeeOneriVeSikayetButton() {
        yonetim.ShouldSeeOneriVeSikayetButton();
    }

    @Then("user should see Trakya University Amblem")
    public void userShouldSeeTrakyaUniversityAmblem() {
        yonetim.ShouldSeeTrakyaUniversityAmblem();
    }

    @Then("user should see {string} Title")
    public void userShouldSeeTitle(String title) {
        String areaTitle = yonetim.ShouldSeeTitle();
        Assert.assertEquals(areaTitle,title);

    }

    @Then("user should see Instagram Button")
    public void userShouldSeeInstagramButton() {
        yonetim.ShouldSeeInstagramButton();
    }

    @Then("user should see Anasayfa Title")
    public void userShouldSeeAnasayfaTitle() {
        yonetim.ShouldSeeAnasayfaTitle();
    }

    @Then("user should see Duyurular Title")
    public void userShouldSeeDuyurularTitle() {
        yonetim.ShouldSeeDuyurularTitle();
    }

    @Then("user should see Haberler Title")
    public void userShouldSeeHaberlerTitle() {
        yonetim.ShouldSeeHaberlerTitle();
    }

    @Then("user should see Bolum Baskanindan Button")
    public void userShouldSeeBolumBaskanindanButton() {
        yonetim.ShouldSeeBolumBaskanindanButton();
    }

    @Then("user should see Aday Ogrenci Button")
    public void userShouldSeeAdayOgrenciButton() {
        yonetim.ShouldSeeAdayOgrenciButton();
    }

    @Then("user should see Akademik Takvim Button")
    public void userShouldSeeAkademikTakvimButton() {
        yonetim.ShouldSeeAkademikTakvimButton();

    }

    @Then("user should see Ders Programi Button")
    public void userShouldSeeDersProgramiButton() {
        yonetim.ShouldSeeDersProgramiButton();
    }

    @Then("user should see Dijital Donusum Button")
    public void userShouldSeeDijitalDonusumButton() {
        yonetim.ShouldSeeDijitalDonusumButton();
    }

    @Then("user should see Ogrenci E-Posta Button")
    public void userShouldSeeOgrenciEPostaButton() {
        yonetim.ShouldSeeOgrenciEPostaButton();
    }

    @Then("user should see Bologna Button")
    public void userShouldSeeBolognaButton() {
        yonetim.ShouldSeeBolognaButton();
    }

    @Then("user should see Kurumsal Kimlik Button")
    public void userShouldSeeKurumsalKimlikButton() {
        yonetim.ShouldSeeKurumsalKimlikButton();
    }

    @Then("user should see Personel Web Havuzu Button")
    public void userShouldSeePersonelWebHavuzuButton() {
        yonetim.ShouldSeePersonelWebHavuzuButton();
    }

    @Then("user should see e-Rehber Button")
    public void userShouldSeeERehberButton() {
        yonetim.ShouldSeeERehberButton();
    }

    @Then("user should see Ihale Ilanlari Button")
    public void userShouldSeeIhaleIlanlariButton() {
        yonetim.ShouldSeeIhaleIlanlariButton();
    }

    @Then("user should see Aylik Yemek Listesi Button")
    public void userShouldSeeAylikYemekListesiButton() {
        yonetim.ShouldSeeAylikYemekListesiButton();
    }

    @Then("user should see Site Haritasi Button")
    public void userShouldSeeSiteHaritasiButton() {
        yonetim.ShouldSeeSiteHaritasiButton();
    }

    @Then("user should see Sayfa Sorumlulari Button")
    public void userShouldSeeSayfaSorumlulariButton() {
        yonetim.ShouldSeeSayfaSorumlulariButton();
    }

    @When("user click on Trakya Universitesi Button")
    public void userClickOnTrakyaUniversitesiButton() {
        yonetim.ClickOnTrakyaUniversitesiButton();
    }

    @Then("user should see Trakya Universitesi Page")
    public void userShouldSeeTrakyaUniversitesiPage() {
        yonetim.ShouldSeeTrakyaUniversitesiPage();
    }

    @When("user click on Fakultemiz Button")
    public void userClickOnFakultemizButton() {
        yonetim.ClickOnFakultemizButton();
    }

    @Then("user should see Fakultemiz Page")
    public void userShouldSeeFakultemizPage() {
        yonetim.ShouldSeeFakultemizPage();
    }

    @When("user click on Bolumumuz Button")
    public void userClickOnBolumumuzButton() {
        yonetim.ClickOnBolumumuzButton();
    }

    @Then("user should see Bolumumuz Page")
    public void userShouldSeeBolumumuzPage() {
        yonetim.ShouldSeeBolumumuzPage();
    }

    @When("user click on Yonetim Button On Personelimiz")
    public void userClickOnYonetimButtonOnPersonelimiz() {
        yonetim.ClickOnYonetimButtonOnPersonelimiz();
    }

    @When("user click on Akademik Personel on Personelimiz")
    public void userClickOnAkademikPersonelOnPersonelimiz() {
        yonetim.ClickOnAkademikPersonelOnPersonelimiz();
    }

    @Then("user should see Akademik Personel Page")
    public void userShouldSeeAkademikPersonelPage() {
        yonetim.ShouldSeeAkademikPersonelPage();
    }

    @When("user click on Idari Personel on Personelimiz")
    public void userClickOnIdariPersonelOnPersonelimiz() {
        yonetim.ClickOnIdariPersonelOnPersonelimiz();
    }

    @Then("user should see Idari Personel Page")
    public void userShouldSeeIdariPersonelPage() {
        yonetim.ShouldSeeIdariPersonelPage();
    }

    @When("user click on Anabilim Dallari Button")
    public void userClickOnAnabilimDallariButton() {
        yonetim.ClickOnAnabilimDallariButton();
    }

    @Then("user should see Anabilim Dallari Page")
    public void userShouldSeeAnabilimDallariPage() {
        yonetim.ShouldSeeAnabilimDallariPage();
    }

    @When("user click on Bologna Button")
    public void userClickOnBolognaButton() {
        yonetim.ClickOnBolognaButton();
    }

    @Then("user sohuld see Bologna Page")
    public void userSohuldSeeBolognaPage() {
        yonetim.SohuldSeeBolognaPage();
    }

    @When("user click on Danisman Listesi Button")
    public void userClickOnDanismanListesiButton() {
        yonetim.ClickOnDanismanListesiButton();
    }

    @Then("user should see Danisman Listesi Page")
    public void userShouldSeeDanismanListesiPage() {
        yonetim.ShouldSeeDanismanListesiPage();
    }

    @When("user click on Ders Plani Button")
    public void userClickOnDersPlaniButton() {
        yonetim.ClickOnDersPlaniButton();
    }

    @Then("user should see Ders Plani Page")
    public void userShouldSeeDersPlaniPage() {
        yonetim.ShouldSeeDersPlaniPage();
    }

    @When("user click on Haftalik Ders Programlari Button")
    public void userClickOnHaftalikDersProgramlariButton() {
        yonetim.ClickOnHaftalikDersProgramlariButton();
    }

    @Then("user should see Haftalik Ders Programlari Page")
    public void userShouldSeeHaftalikDersProgramlariPage() {
        yonetim.ShouldSeeHaftalikDersProgramlariPage();
    }

    @When("user click on Akademik Takvim Button")
    public void userClickOnAkademikTakvimButton() {
        yonetim.ClickOnAkademikTakvimButton();
    }

    @Then("user should see Akademik Takvim Page")
    public void userShouldSeeAkademikTakvimPage() {
        yonetim.ShouldSeeAkademikTakvimPage();
    }

    @When("user click on Iletisim Button")
    public void userClickOnIletisimButton() {
        yonetim.ClickOnIletisimButton();
    }

    @Then("user should see Iletisim Page")
    public void userShouldSeeIletisimPage() {
        yonetim.ShouldSeeIletisimPage();
    }

    @When("user click on Oneri ve Sikayet Button")
    public void userClickOnOneriVeSikayetButton() {
        yonetim.ClickOnOneriVeSikayetButton();
    }

    @Then("user should see Oneri ve Sikayet Page")
    public void userShouldSeeOneriVeSikayetPage() {
        yonetim.ShouldSeeOneriVeSikayetPage();
    }
}
