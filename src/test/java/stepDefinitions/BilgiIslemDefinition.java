package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BilgiIslemPage;
import utils.DriverFactory;

import static java.awt.SystemColor.text;

public class BilgiIslemDefinition {
    BilgiIslemPage bilgiIslemPage= new BilgiIslemPage(DriverFactory.getDriver());
    @Given("user on the Bilgi Islem page")
    public void userOnTheBilgiIslemPage() {bilgiIslemPage.userOnTheGenelSekreterlikPage();
    }

    @Then("user should see Duyurular title : {string} on Bilgi Islem page")
    public void userShouldSeeDuyurularTitleOnBilgiIslemPage(String arg0) {
        String text = bilgiIslemPage.userShouldSeeDuyurularTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see USOM Duyurulari title : {string} on Bilgi Islem page")
    public void userShouldSeeUSOMDuyurulariTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeUSOMDuyurulariTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Haberler title : {string} on Bilgi Islem page")
    public void userShouldSeeHaberlerTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeHaberlerTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Haber Arşivi title:{string} on Bilgi Islem page")
    public void userShouldSeeHaberArşiviTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeHaberArşiviTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see BİDB Tanitim Katologu Button")
    public void userShouldSeeBİDBTanitimKatologuButton() {
        bilgiIslemPage.userShouldSeeBİDBTanitimKatologuButton();
    }

    @Then("user should see Teknik Destek Talep Formu Button")
    public void userShouldSeeTeknikDestekTalepFormuButton() {
        bilgiIslemPage.userShouldSeeTeknikDestekTalepFormuButton();
    }

    @Then("user should see Formlar Button")
    public void userShouldSeeFormlarButton() {
        bilgiIslemPage.userShouldSeeFormlarButton();
    }

    @Then("user should see Akademik Lisans Button")
    public void userShouldSeeAkademikLisansButton() {
        bilgiIslemPage.userShouldSeeAkademikLisansButton();
    }

    @Then("user should see Egitim Videolari Button")
    public void userShouldSeeEgitimVideolariButton() {
        bilgiIslemPage.userShouldSeeEgitimVideolariButton();
    }

    @Then("User should see Kullanim kilavuzlari Button")
    public void userShouldSeeKullanimKilavuzlariButton() {
        bilgiIslemPage.userShouldSeeKullanimKilavuzlariButton();
    }

    @Then("user should see Kurum Ici Dahili Telefon Gorusme Sistemi Button")
    public void userShouldSeeKurumIciDahiliTelefonGorusmeSistemiButton() {
        bilgiIslemPage.userShouldSeeKurumIciDahiliTelefonGorusmeSistemiButton();
    }

    @Then("user should see EDUROM Button")
    public void userShouldSeeEDUROMButton() {
        bilgiIslemPage.userShouldSeeEDUROMButton();
    }

    @Then("user should see Bilgi Guvenligi Farkindalik Egitimi Sunusu Button")
    public void userShouldSeeBilgiGuvenligiFarkindalikEgitimiSunusuButton() {
        bilgiIslemPage.userShouldSeeBilgiGuvenligiFarkindalikEgitimiSunusuButton();
    }

    @Then("user should see Bireysel Siber Guvenlik Onlemleri Button")
    public void userShouldSeeBireyselSiberGuvenlikOnlemleriButton() {
        bilgiIslemPage.userShouldSeeBireyselSiberGuvenlikOnlemleriButton();
    }

    @Then("user should see Uzaktan Yardim button")
    public void userShouldSeeUzaktanYardimButton() {
        bilgiIslemPage.userShouldSeeUzaktanYardimButton();
    }

    @Then("user should see EBYS Portal Button")
    public void userShouldSeeEBYSPortalButton() {
        bilgiIslemPage.userShouldSeeEBYSPortalButton();
    }

    @Then("user should see Resmi Yazısmalarda Kullanilacak Usul ve Esaslar Button")
    public void userShouldSeeResmiYazısmalardaKullanilacakUsulVeEsaslarButton() {
        bilgiIslemPage.userShouldSeeResmiYazısmalardaKullanilacakUsulVeEsaslarButton();
    }

    @Then("user shoul see EBYS Destek Talep Formu Button")
    public void userShoulSeeEBYSDestekTalepFormuButton() {
        bilgiIslemPage.userShoulSeeEBYSDestekTalepFormuButton();
    }

    @Then("user should see EBYS Destek Talep Formu Button")
    public void userShouldSeeEBYSDestekTalepFormuButton() {
        bilgiIslemPage.userShoulSeeEBYSDestekTalepFormuButton();
    }

    @Then("user should see Mobil Imza Button")
    public void userShouldSeeMobilImzaButton() {
        bilgiIslemPage.userShouldSeeMobilImzaButton();
    }

    @Then("user should see E-Posta kurulum Ayarlari Button")
    public void userShouldSeeEPostaKurulumAyarlariButton() {
        bilgiIslemPage.userShouldSeeEPostaKurulumAyarlariButton();
    }

    @Then("user should see Kurumsal E-Posta Sifre Islemleri Button")
    public void userShouldSeeKurumsalEPostaSifreIslemleriButton() {
        bilgiIslemPage.userShouldSeeEPostaKurulumAyarlariButton();
    }

    @Then("user should see E-Posta ve Sifre Sifirlama Button")
    public void userShouldSeeEPostaVeSifreSifirlamaButton() {
        bilgiIslemPage.userShouldSeeEPostaVeSifreSifirlamaButton();
    }

    @Then("user should see ULAKNET Baglanti Durumu Button")
    public void userShouldSeeULAKNETBaglantiDurumuButton() {
        bilgiIslemPage.userShouldSeeULAKNETBaglantiDurumuButton();
    }

    @Then("user should see Kutuphane Veritabani Icin Uzaktan Erisim Button")
    public void userShouldSeeKutuphaneVeritabaniIcinUzaktanErisimButton() {
        bilgiIslemPage.userShouldSeeKutuphaneVeritabaniIcinUzaktanErisimButton();
    }

    @Then("user should see Radyo Gunebakan Button")
    public void userShouldSeeRadyoGunebakanButton() {
        bilgiIslemPage.userShouldSeeRadyoGunebakanButton();
    }

    @Then("user should see Elektronik Panolar title:{string} on Bilgi Islem page")
    public void userShouldSeeElektronikPanolarTitleOnBilgiIslemPage(String arg0) {
       String text= bilgiIslemPage.userShouldSeeElektronikPanolarTitleOnBilgiIslemPage();
       Assert.assertEquals(text,arg0);
    }

    @Then("user should see Elektronik Pano Button")
    public void userShouldSeeElektronikPanoButton() {
        bilgiIslemPage.userShouldSeeElektronikPanoButton();
    }

    @Then("user should see Tum Ekranlar Button")
    public void userShouldSeeTumEkranlarButton() {
        bilgiIslemPage.userShouldSeeTumEkranlarButton();
    }

    @Then("user should see Kurallar title:{string} on Bilgi Islem page")
    public void userShouldSeeKurallarTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeKurallarTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Baglantilar title:{string} on Bilgi Islem")
    public void userShouldSeeBaglantilarTitleOnBilgiIslem(String arg0) {
        String text = bilgiIslemPage.userShouldSeeBaglantilarTitleOnBilgiIslem();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Anasayfa title:{string} on Bilgi Islem page")
    public void userShouldSeeAnasayfaTitleOnBilgiIslemPage(String arg0) {
        String text =bilgiIslemPage.userShouldSeeAnasayfaTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("User should see Tanitim Katalogu title:{string} on Bilgi Islem page")
    public void userShouldSeeTanitimKataloguTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeTanitimKataloguTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Faaliyet Raporlari title:{string} on Bilgi Islem page")
    public void userShouldSeeFaaliyetRaporlariTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeFaaliyetRaporlariTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Istatistikler title:{string} on Bilgi Islem page")
    public void userShouldSeeIstatistiklerTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeIstatistiklerTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see SSS title:{string} on Bilgi Islem page")
    public void userShouldSeeSSSTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeSSSTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Baskanligimiz title:{string} on Bilgi Islem page")
    public void userShouldSeeBaskanligimizTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeBaskanligimizTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click on Baskanligimiz Button")
    public void userClickOnBaskanligimizButton() {
        bilgiIslemPage.userClickOnBaskanligimizButton();
    }

    @Then("user should see Gorev ve Sorumluluklar title:{string}in Baskanligimiz on Bilgi Islem page")
    public void userShouldSeeGorevVeSorumluluklarTitleInBaskanligimizOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeGorevVeSorumluluklarTitleInBaskanligimizOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Organizasyon Semasi title: {string} in Baskanligimiz on Bilgi Islem page")
    public void userShouldSeeOrganizasyonSemasiTitleInBaskanligimizOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeOrganizasyonSemasiTitleInBaskanligimizOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilgi Guvenligi Yonetim Sistemi title: {string} on Bilgi Islem page")
    public void userShouldSeeBilgiGuvenligiYonetimSistemiTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeBilgiGuvenligiYonetimSistemiTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click on Bilgi Guvenligi Yonetim Sistemi on Bilgi Islem")
    public void userClickOnBilgiGuvenligiYonetimSistemiOnBilgiIslem() {
        bilgiIslemPage.userClickOnBilgiGuvenligiYonetimSistemiOnBilgiIslem();
    }

    @Then("user should see BGYS Kapsami ve Politikasi title: {string} in Bilgi Guvenligi Yonetim Sistemi on Bilgi Islem page")
    public void userShouldSeeBGYSKapsamiVePolitikasiTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeBGYSKapsamiVePolitikasiTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilgi Guvenligi Politikamiz title: {string} in Bilgi Guvenligi Yonetim Sistemi on Bilgi Islem page")
    public void userShouldSeeBilgiGuvenligiPolitikamizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeBilgiGuvenligiPolitikamizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see BGYS KUygulama Politikalarimiz title: {string} in Bilgi Guvenligi Yonetim Sistemi on Bilgi Islem page")
    public void userShouldSeeBGYSKUygulamaPolitikalarimizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeBGYSKUygulamaPolitikalarimizTitleInBilgiGuvenligiYonetimSistemiOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Trakya Universitesi title: {string} on Bilgi Islem page")
    public void userShouldSeeTrakyaUniversitesiTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeTrakyaUniversitesiTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Hakkimizda title:{string} on Bilgi Islem page")
    public void userShouldSeeHakkimizdaTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeHakkimizdaTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Misyon-Vizyon title:{string} on Bilgi Islem page")
    public void userShouldSeeMisyonVizyonTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeMisyonVizyonTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Degerler title:{string} on Bilgi Islem page")
    public void userShouldSeeDegerlerTitleOnBilgiIslemPage(String arg0) {
        String text= bilgiIslemPage.userShouldSeeDegerlerTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Personelimiz title: {string} on Bilgi Islem page")
    public void userShouldSeePersonelimizTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeePersonelimizTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click on Ic Kontrol Sistemi Button")
    public void userClickOnIcKontrolSistemiButton() {
        bilgiIslemPage.userClickOnIcKontrolSistemiButton();
    }

    @Then("user should see Ic Kontrol Mevzuat title:{string} on Bilgi Islem page")
    public void userShouldSeeIcKontrolMevzuatTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeIcKontrolMevzuatTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Ic Kontrol Sistemi title: {string} on Bilgi Islem page")
    public void userShouldSeeIcKontrolSistemiTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeIcKontrolSistemiTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Stratrjik Yonetim Bilgi Sistemi title: {string} on Bilgi Islem page")
    public void userShouldSeeStratrjikYonetimBilgiSistemiTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeStratrjikYonetimBilgiSistemiTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Kalite title:{string} on Bilgi Islem page")
    public void userShouldSeeKaliteTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeKaliteTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click on Kalite Button")
    public void userClickOnKaliteButton() {
        bilgiIslemPage.userClickOnKaliteButton();
    }

    @Then("user should see T.U Kalite Politikasi title:{string} in Kalite on Bilgi Islem page")
    public void userShouldSeeTUKalitePolitikasiTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeTUKalitePolitikasiTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Birim Kalite Komisyonu ve Kalite Temsilcileri title: {string} in Kalite on Bilgi Islem page")
    public void userShouldSeeBirimKaliteKomisyonuVeKaliteTemsilcileriTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeBirimKaliteKomisyonuVeKaliteTemsilcileriTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user Should see Birim Kalite Takvimi title : {string} in Kalite on Bilgi Islem page")
    public void userShouldSeeBirimKaliteTakvimiTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeBirimKaliteTakvimiTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Birim Raporlari title:{string} in Kalite on Bilgi Islem page")
    public void userShouldSeeBirimRaporlariTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeBirimRaporlariTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Diş Paydaslar title:{string} in kalite on Bilgi Islem page")
    public void userShouldSeeDişPaydaslarTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeDişPaydaslarTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Birim Kalite Calismalari title:{string} in Kalite on Bilgi Islem page")
    public void userShouldSeeBirimKaliteCalismalariTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeBirimKaliteCalismalariTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Hizmet Standartlati title:{string} in Kalite on Bilgi Islem page")
    public void userShouldSeeHizmetStandartlatiTitleInKaliteOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeHizmetStandartlatiTitleInKaliteOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see İletisim Bilgilerimiz title: {string} on Bilgi Islem page")
    public void userShouldSeeİletisimBilgilerimizTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeİletisimBilgilerimizTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Oneri ve Sikayet title : {string} on Bilgi Islem page")
    public void userShouldSeeOneriVeSikayetTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeOneriVeSikayetTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Twitter title : {string} on Bilgi Islem page")
    public void userShouldSeeTwitterTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeTwitterTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see English title : {string} on Bilgi Islem page")
    public void userShouldSeeEnglishTitleOnBilgiIslemPage(String arg0) {
        String text=bilgiIslemPage.userShouldSeeEnglishTitleOnBilgiIslemPage();
        Assert.assertEquals(text,arg0);
    }
}
