package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MisyonVizyonPage;
import pages.OBSPage;
import utils.DriverFactory;

public class OBSDefinitions {
    OBSPage obsPage = new OBSPage(DriverFactory.getDriver());

    @Given("user on the Obs login page")
    public void userOnTheObsLoginPage() {
        obsPage.userOnTheObsLoginPage();
    }

    @When("user fill the empty boxes on Obs login page")
    public void userFillTheEmptyBoxesOnObsLoginPage() {
        obsPage.userFillTheEmptyBoxesOnObsLoginPage();
    }

    @When("user click log in button on Obs login page")
    public void userClickLogInButtonOnObsLoginPage() {
        obsPage.userClickLogInButtonOnObsLoginPage();
    }

    @When("user click OBS button on Obs login page")
    public void userClickOBSButtonOnObsLoginPage() {
        obsPage.userClickOBSButtonOnObsLoginPage();
    }

    @Then("user should click Kapat button on Obs page")
    public void userShouldClickKapatButtonOnObsPage() {
        obsPage.userShouldClickKapatButtonOnObsPage();
    }

    @Then("user should see Ogrenci no Title : {string} on Obs page")
    public void userShouldSeeOgrenciNoTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeOgrenciNoTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ana Adi Title : {string} on Obs page")
    public void userShouldSeeAnaAdiTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeAnaAdiTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Dogum Yeri Title : {string} on Obs page")
    public void userShouldSeeDogumYeriTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeDogumYeriTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Sinif Title : {string} on Obs page")
    public void userShouldSeeSinifTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeSinifTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ikincil E-Posta Title : {string} on Obs page")
    public void userShouldSeeIkincilEPostaTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeIkincilEPostaTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see  GSM No Title : {string} on Obs page")
    public void userShouldSeeGSMNoTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeGSMNoTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Danisman E-Posta Title : {string} on Obs page")
    public void userShouldSeeDanismanEPostaTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeDanismanEPostaTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Birim Title : {string} on Obs page")
    public void userShouldSeeBirimTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeBirimTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Program Title : {string} on Obs page")
    public void userShouldSeeProgramTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeProgramTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Mufredat Ad Title : {string} on Obs page")
    public void userShouldSeeMufredatAdTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeMufredatAdTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see TC Kimlik No Title : {string} on Obs page")
    public void userShouldSeeTCKimlikNoTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeTCKimlikNoTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Baba Adi Title : {string} on Obs page")
    public void userShouldSeeBabaAdiTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeBabaAdiTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Yari Yil Title : {string} on Obs page")
    public void userShouldSeeYariYilTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeIkincilEPostaTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Danisman{int} Title : {string} on Obs page")
    public void userShouldSeeDanismanTitleOnObsPage(int arg0, String arg1) {
        String text = obsPage.userShouldSeeDanismanTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Bolum Title : {string} on Obs page")
    public void userShouldSeeBolumTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeBolumTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Durum Title : {string} on Obs page")
    public void userShouldSeeDurumTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeDurumTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ad Soyad Title : {string} on Obs page")
    public void userShouldSeeAdSoyadTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeAdSoyadTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Dogum Tarihi Title : {string} on Obs page")
    public void userShouldSeeDogumTarihiTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeDogumTarihiTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Kurumsal E-Posta Title : {string} on Obs page")
    public void userShouldSeeKurumsalEPostaTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeKurumsalEPostaTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ana Bilim Dali Title : {string} on Obs page")
    public void userShouldSeeAnaBilimDaliTitleOnObsPage(String arg0) {
        String text = obsPage.userShouldSeeAnaBilimDaliTitleOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click ogrenci bilgileri button on the OBS page")
    public void userClickOgrenciBilgileriButtonOnTheOBSPage() {
        obsPage.userClickOgrenciBilgileriButtonOnTheOBSPage();
    }

    @When("user click Ders Programi button on the OBS page")
    public void userClickDersProgramiButtonOnTheOBSPage() {
        obsPage.userClickDersProgramiButtonOnTheOBSPage();
    }

    @Then("should see Ders Programi title: {string} in Ders Programi page on Obs page")
    public void shouldSeeDersProgramiTitleInDersProgramiPageOnObsPage(String arg0) {
        String text = obsPage.shouldSeeDersProgramiTitleInDersProgramiPageOnObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Pazartasi Title:{string} in Ders Programi page on the Obs")
    public void userSholudSeePazartasiTitleInDersProgramiPageOnTheObs(String arg0) {
        String text = obsPage.userSholudSeePazartasiTitleInDersProgramiPageOnTheObs();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Sali Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeSaliTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeSaliTitleInDersProgramiPageOnTheObs();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Carsamba Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeCarsambaTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeCarsambaTitleInDersProgramiPageOnTheObs();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Persembe Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeePersembeTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeePersembeTitleInDersProgramiPageOnTheObs();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Cuma Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeCumaTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeCumaTitleInDersProgramiPageOnTheObs();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Cumartesi Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeCumartesiTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeCumartesiTitleInDersProgramiPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user sholud see Pazar Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeePazarTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeePazarTitleInDersProgramiPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Google Classroom button on the OBS page")
    public void userClickGoogleClassroomButtonOnTheOBSPage() {
        obsPage.userClickGoogleClassroomButtonOnTheOBSPage();
    }

    @Then("user sholud see Google Classroom Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeGoogleClassroomTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeGoogleClassroomTitleInDersProgramiPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Tum Ders Mufreddati button on the OBS page")
    public void userClickTumDersMufreddatiButtonOnTheOBSPage() {
        obsPage.userClickTumDersMufreddatiButtonOnTheOBSPage();
    }

    @Then("user sholud see Tum Ders Mufredati Title:{string} in Ders Programi page on the Obs page")
    public void userSholudSeeTumDersMufredatiTitleInDersProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userSholudSeeTumDersMufredatiTitleInDersProgramiPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click ogrenci bilgileri button on the Obs page")
    public void userClickOgrenciBilgileriButtonOnTheObsPage() {
        obsPage.userClickOgrenciBilgileriButtonOnTheObsPage();
    }

    @When("user click Devam Durumu button on the Obs page")
    public void userClickDevamDurumuButtonOnTheObsPage() {
        obsPage.userClickDevamDurumuButtonOnTheObsPage();
    }

    @Then("user should see Devam Durumu title : {string} in Devam Durumu page on the Obs page")
    public void userShouldSeeDevamDurumuTitleInDevamDurumuPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeDevamDurumuTitleInDevamDurumuPageOnTheObsPage();
        Assert.assertEquals(text, arg0);

    }

    @When("user click Sinav Programi button on the Obs page")
    public void userClickSinavProgramiButtonOnTheObsPage() {
        obsPage.userClickSinavProgramiButtonOnTheObsPage();
    }

    @Then("user should see Sinav Programi title: {string} in Sinav Programi page on the Obs page")
    public void userShouldSeeSinavProgramiTitleInSinavProgramiPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeSinavProgramiTitleInSinavProgramiPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Ogrenci Bilgileri button on Obs page")
    public void userClickOgrenciBilgileriButtonOnObsPage() {
        obsPage.userClickOgrenciBilgileriButtonOnObsPage();
    }

    @When("user click Akademik Takvim button on the Obs page")
    public void userClickAkademikTakvimButtonOnTheObsPage() {
        obsPage.userClickAkademikTakvimButtonOnTheObsPage();
    }

    @Then("user should se Akademik Takvim title: {string} in Akademik Takvim on the Obs page")
    public void userShouldSeAkademikTakvimTitleInAkademikTakvimOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeAkademikTakvimTitleInAkademikTakvimOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Aktivite takvim gecmistir title: {string} in Akademik Takvim page on the Obs page")
    public void userShouldSeeAktiviteTakvimGecmistirTitleInAkademikTakvimPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAktiviteTakvimGecmistirTitleInAkademikTakvimPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Aktivite tarihi icerisindesiniz title : {string} in Akademik takvim page on the Obs page")
    public void userShouldSeeAktiviteTarihiIcerisindesinizTitleInAkademikTakvimPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAktiviteTarihiIcerisindesinizTitleInAkademikTakvimPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Aktivite tarihi gelmemistir title: {string} in Akademik Takvim page on the Obs page")
    public void userShouldSeeAktiviteTarihiGelmemistirTitleInAkademikTakvimPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAktiviteTarihiGelmemistirTitleInAkademikTakvimPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click on Ogrenci Bilgi button on the Obs page")
    public void userClickOnOgrenciBilgiButtonOnTheObsPage() {
        obsPage.userClickOnOgrenciBilgiButtonOnTheObsPage();
    }

    @When("user click Ogrenci Disiplin Cezalari button on the Obs page")
    public void userClickOgrenciDisiplinCezalariButtonOnTheObsPage() {
        obsPage.userClickOgrenciDisiplinCezalariButtonOnTheObsPage();
    }

    @Then("user should see Kalite Koordinatorlugu PageOgrenci Disiplin Cezalari title: {string} in Ogrenci Disiplin Cezalari on the Obs page")
    public void userShouldSeeKaliteKoordinatorluguPageOgrenciDisiplinCezalariTitleInOgrenciDisiplinCezalariOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeKaliteKoordinatorluguPageOgrenciDisiplinCezalariTitleInOgrenciDisiplinCezalariOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Ogrenci Bilgileri button on the Obs page")
    public void userclickOgrenciBilgileriButtonOnTheObsPage() {
        obsPage.userclickOgrenciBilgileriButtonOnTheObsPage();
    }

    @When("user click Taleplerim button on the Obs page")
    public void userClickTaleplerimButtonOnTheObsPage() {
        obsPage.userClickTaleplerimButtonOnTheObsPage();
    }

    @Then("user should see Taleplerim title: {string} in Taleplerim page on the Obs page")
    public void userShouldSeeTaleplerimTitleInTaleplerimPageOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeTaleplerimTitleInTaleplerimPageOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Kayit Yenileme İslemleri page on the Obs page")
    public void userClickKayitYenilemeİslemleriPageOnTheObsPage() {
        obsPage.userClickKayitYenilemeİslemleriPageOnTheObsPage();
    }

    @When("user click Ders Kayit Islemleri page on the Obs page")
    public void userClickDersKayitIslemleriPageOnTheObsPage() {
        obsPage.userClickDersKayitIslemleriPageOnTheObsPage();
    }

    @Then("user should see Ogrenci No title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeOgrenciNoTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeOgrenciNoTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Sinif title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeSinifTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeSinifTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Danisman title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeDanismanTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeDanismanTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Bolum title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeBolumTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBolumTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Program title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeProgramTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeProgramTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ad Soyad title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeAdSoyadTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAdSoyadTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Yari Yil title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeYariYilTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeYariYilTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Birim title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeBirimTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBirimTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Ana Bilim Dali title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeAnaBilimDaliTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAnaBilimDaliTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Harc Borcu title: {string} in Ders Kayit Islemleri on the Obs page")
    public void userShouldSeeHarcBorcuTitleInDersKayitIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeHarcBorcuTitleInDersKayitIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Not Islemleri button on the Obs page")
    public void userClickNotIslemleriButtonOnTheObsPage() {
        obsPage.userClickNotIslemleriButtonOnTheObsPage();
    }

    @When("user click Not Goruntuleme button on the Obs page")
    public void userClickNotGoruntulemeButtonOnTheObsPage() {
        obsPage.userClickNotGoruntulemeButtonOnTheObsPage();
    }

    @Then("user should see Not Goruntuleme title: {string} in Not Goruntuleme on the Obs page")
    public void userShouldSeeNotGoruntulemeTitleInNotGoruntulemeOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeNotGoruntulemeTitleInNotGoruntulemeOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Onur-Yuksek Onur Belgesi button on the Obs page")
    public void userClickOnurYuksekOnurBelgesiButtonOnTheObsPage() {
        obsPage.userClickOnurYuksekOnurBelgesiButtonOnTheObsPage();
    }

    @Then("user should see Onur-Yuksek Onur Belgesi title: {string} in Not Islemleri on the Obs page")
    public void userShouldSeeOnurYuksekOnurBelgesiTitleInNotIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeOnurYuksekOnurBelgesiTitleInNotIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Sinav Talep Islemleri button on the Obs page")
    public void userClickSinavTalepIslemleriButtonOnTheObsPage() {
        obsPage.userClickSinavTalepIslemleriButtonOnTheObsPage();
    }

    @When("user click Muafiyet Basvurusu button on the Obs page")
    public void userClickMuafiyetBasvurusuButtonOnTheObsPage() {
        obsPage.userClickMuafiyetBasvurusuButtonOnTheObsPage();
    }

    @Then("user should see Muafiyet Basvurusu title: {string} in Sinav Talep Islemleri on the Obs page")
    public void userClickMuafiyetBasvurusuButtonOnTheObsPage(String arg0) {
        obsPage.userClickMuafiyetBasvurusuButtonOnTheObsPage();
    }

    @When("user click Erasmus Basvuru Islemleri button on the Obs page")
    public void userClickErasmusBasvuruIslemleriButtonOnTheObsPage() {
        obsPage.userClickErasmusBasvuruIslemleriButtonOnTheObsPage();
    }

    @When("user click Erasmus Basvurulari button on the Obs page")
    public void userClickErasmusBasvurulariButtonOnTheObsPage() {
        obsPage.userClickErasmusBasvurulariButtonOnTheObsPage();
    }

    @Then("should see Erasmus Basvurulari title: {string} in Erasmus Basvuru Islemleri on the Obs page")
    public void shouldSeeErasmusBasvurulariTitleInErasmusBasvuruIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.shouldSeeErasmusBasvurulariTitleInErasmusBasvuruIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Harc Borc Islemleri button on the Obs page")
    public void userClickHarcBorcIslemleriButtonOnTheObsPage() {
        obsPage.userClickHarcBorcIslemleriButtonOnTheObsPage();
    }

    @When("user click Banka Bilgilerim button on the Obs page")
    public void userClickBankaBilgilerimButtonOnTheObsPage() {
        obsPage.userClickBankaBilgilerimButtonOnTheObsPage();
    }

    @Then("user should see Banka Bilgilerim title: {string} in Harc Borc Islemleri on the Obs page")
    public void userShouldSeeBankaBilgilerimTitleInHarcBorcIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBankaBilgilerimTitleInHarcBorcIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Harc Borc Bilgileri button on the Obs page")
    public void userClickHarcBorcBilgileriButtonOnTheObsPage() {
        obsPage.userClickHarcBorcBilgileriButtonOnTheObsPage();
    }

    @Then("user should see Harc Bilgileri title: {string} in Harc Borc Islemleri on the Obs page")
    public void userShouldSeeHarcBilgileriTitleInHarcBorcIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeHarcBilgileriTitleInHarcBorcIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Basvuru Islemleri button on the Obs page")
    public void userClickBasvuruIslemleriButtonOnTheObsPage() {
        obsPage.userClickBasvuruIslemleriButtonOnTheObsPage();
    }

    @When("user click CAP Ve YAP Basvurulari button on the Obs page")
    public void userClickCAPVeYAPBasvurulariButtonOnTheObsPage() {
        obsPage.userClickCAPVeYAPBasvurulariButtonOnTheObsPage();
    }

    @Then("user should see Aday Başvurulari title: {string} in CAP Ve YAP Basvurulari on the Obs page")
    public void userShouldSeeAdayBaşvurulariTitleInCAPVeYAPBasvurulariOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeAdayBaşvurulariTitleInCAPVeYAPBasvurulariOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Basvuru Turu title: {string} in CAP Ve YAP Basvurulari on the Obs page")
    public void userShouldSeeBasvuruTuruTitleInCAPVeYAPBasvurulariOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBasvuruTuruTitleInCAPVeYAPBasvurulariOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should  see Yil title: {string} in CAP Ve YAP Basvurulari on the Obs page")
    public void userShouldSeeYilTitleInCAPVeYAPBasvurulariOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeYilTitleInCAPVeYAPBasvurulariOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Donem title: {string} in CAP Ve YAP Basvurulari on the Obs page")
    public void userShouldSeeDonemTitleInCAPVeYAPBasvurulariOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeDonemTitleInCAPVeYAPBasvurulariOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Kurum Ici button on the Obs page")
    public void userClickKurumIciButtonOnTheObsPage() {
        obsPage.userClickKurumIciButtonOnTheObsPage();
    }

    @Then("user should see Basvurular title: {string} in Basvuru Islemleri on the Obs page")
    public void userShouldSeeBasvurularTitleInBasvuruIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBasvurularTitleInBasvuruIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @When("user click Staj Basvuru Islemleri button on the Obs page")
    public void userClickStajBasvuruIslemleriButtonOnTheObsPage() {
        obsPage.userClickStajBasvuruIslemleriButtonOnTheObsPage();
    }

    @Then("user should see Basvuru Yapilabilecek Acık Staj Ilanlari title:{string} in Staj Basvuru Islemleri on the Obs page")
    public void userShouldSeeBasvuruYapilabilecekAcıkStajIlanlariTitleInStajBasvuruIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeBasvuruYapilabilecekAcıkStajIlanlariTitleInStajBasvuruIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Staj Basvurulariniz title: {string} in Staj Basvuru Islemleri on the Obs page")
    public void userShouldSeeStajBasvurularinizTitleInStajBasvuruIslemleriOnTheObsPage(String arg0) {
        String text = obsPage.userShouldSeeStajBasvurularinizTitleInStajBasvuruIslemleriOnTheObsPage();
        Assert.assertEquals(text, arg0);
    }

    @Then("user should see Danismanbir Title : {string} on Obs page")
    public void userShouldSeeDanismanbirTitleOnObsPage(String arg0) {
        
    }

    @Then("user should see Danismaniki Title : {string} on Obs page")
    public void userShouldSeeDanismanikiTitleOnObsPage(String arg0) {
    }
}

