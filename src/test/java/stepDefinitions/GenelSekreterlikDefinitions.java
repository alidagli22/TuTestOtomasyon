package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.GenelSekreterlikPage;
import utils.DriverFactory;

public class GenelSekreterlikDefinitions {
    GenelSekreterlikPage genelSekreterlikPage=new GenelSekreterlikPage(DriverFactory.getDriver());

    @Given("user on the Genel Sekreterlik Page")
    public void userOnTheGenelSekreterlikPage() {
        genelSekreterlikPage.userOnTheGenelSekreterlikPage();
    }

    @Then("user should see Duyurular title : {string} on Genel Sekreterlik page")
    public void userShouldSeeDuyurularTitleOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeDuyurularTitleOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);

    }

    @Then("user should see Radyo Gunebakan on Genel Sekreterlik Page")
    public void userShouldSeeRadyoGunebakanOnGenelSekreterlikPage() {
       genelSekreterlikPage.userShouldSeeRadyoGunebakanOnGenelSekreterlikPage();

    }

    @When("user click Yazi Isleri Button on Genel Sekreterlik Page")
    public void userClickYaziIsleriButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickYaziIsleriButtonOnGenelSekreterlikPage();

    }

    @Then("user should see Bilgi Islem Ahmet Göktas title: {string} in yazi isleri on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemAhmetGöktasTitleInYaziIsleriOnGenelSekreterlikPage(String arg0) {
    }

    @Then("user should see Bilgi Islem Musatafa Sahin title: {string} in yazi isleri on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemMusatafaSahinTitleInYaziIsleriOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeBilgiIslemAhmetGöktasTitleInYaziIsleriOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilgi Islem Serpil Gici title: {string} in yazi isleri on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemSerpilGiciTitleInYaziIsleriOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeBilgiIslemSerpilGiciTitleInYaziIsleriOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilgi Islem Memur Aysecan Yavuz title: {string} in yazi isleri on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemMemurAysecanYavuzTitleInYaziIsleriOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeBilgiIslemMemurAysecanYavuzTitleInYaziIsleriOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Yonetim ve Senato Button on Genel  Sekreterlik Page")
    public void userClickYonetimVeSenatoButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickYonetimVeSenatoButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Bilgi Islem Ahmet Onder OZTURMEN title: {string} in yönetim ve senato on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemAhmetOnderOZTURMENTitleInYönetimVeSenatoOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeBilgiIslemAhmetOnderOZTURMENTitleInYönetimVeSenatoOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilgi Islem Cuneyt Kaptan title: {string} in yönetim ve senato on Genel Sekreterlik Page")
    public void userShouldSeeBilgiIslemCuneytKaptanTitleInYönetimVeSenatoOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeBilgiIslemCuneytKaptanTitleInYönetimVeSenatoOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click EBYSE-IMZA Button on Genel Sekreterlik Page")
    public void userClickEBYSEIMZAButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickEBYSEIMZAButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Ogr.Gor. Gungor Ilkiz YUKSEL title:{string} in EBYSE-IMZA on on Genel Sekreterlik Page")
    public void userShouldSeeOgrGorGungorIlkizYUKSELTitleInEBYSEIMZAOnOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeOgrGorGungorIlkizYUKSELTitleInEBYSEIMZAOnOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Sekreterya Button on Genel Sekreterlik Page")
    public void userClickSekreteryaButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickSekreteryaButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Kdr.Isc. Oguz BATUR title:{string} in Sekreterya on Genel Sekreterlik Page")
    public void userShouldSeeKdrIscOguzBATURTitleInSekreteryaOnGenelSekreterlikPage()  {
        genelSekreterlikPage.userShouldSeeKdrIscOguzBATURTitleInSekreteryaOnGenelSekreterlikPage();
    }



    @When("user click Evrak Kayit Button on Genel Sekreterlik Page")
    public void userClickEvrakKayitButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickEvrakKayitButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Bilg.İsl. Ayten GILAN title:{string} in Evrak Kayit on Genel Sekreterlik Page")
    public void userShouldSeeBilgİslAytenGILANTitleInEvrakKayitOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeBilgİslAytenGILANTitleInEvrakKayitOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Bilg.İsl. Cıhat CINAR title:{string} in Evrak Kayit on Genel Sekreterlik Page")
    public void userShouldSeeBilgİslCıhatCINARTitleInEvrakKayitOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeBilgİslCıhatCINARTitleInEvrakKayitOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Ogr.Gor Gungor Ilkiz YUKSEL title:{string} in Evrak Kayit on Genel Sekreterlik Page")
    public void userShouldSeeOgrGorGungorIlkizYUKSELTitleInEvrakKayitOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeOgrGorGungorIlkizYUKSELTitleInEvrakKayitOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Afet ve ACil Durum button on Genel Sekreterlik Page")
    public void userClickAfetVeACilDurumButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickAfetVeACilDurumButtonOnGenelSekreterlikPage();
    }

    @When("user click Sivil Savunma button on Genel Sekreterlik page")
    public void userClickSivilSavunmaButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickSivilSavunmaButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Bilg.İsl. Huseyin Turkel title: {string} in Sivil Savunma on Genel Sekreterlik page")
    public void userShouldSeeBilgİslHuseyinTurkelTitleInSivilSavunmaOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeBilgİslHuseyinTurkelTitleInSivilSavunmaOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Bir Ogrenci de Sen Okut button on Genel Sekreterlik Page")
    public void userClickBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Ogr.Gor Gungor Ilkiz Yuksel title: {string} in Bir Ogrenci de Sen Okut button on Genel Sekreterlik Page")
    public void userShouldSeeOgrGorGungorIlkizYukselTitleInBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage(String arg0) {
        String text= genelSekreterlikPage.userShouldSeeOgrGorGungorIlkizYukselTitleInBirOgrenciDeSenOkutButtonOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Servis Odasi button on Genel Sekreterlik Page")
    public void userClickServisOdasiButtonOnGenelSekreterlikPage() {
        genelSekreterlikPage.userClickServisOdasiButtonOnGenelSekreterlikPage();
    }

    @Then("user should see Hizmetli Fedai AKGUN title: {string} in Servis Odasi on Genel Sekreterlik Page")
    public void userShouldSeeHizmetliFedaiAKGUNTitleInServisOdasiOnGenelSekreterlikPage(String arg0) {
        String text=genelSekreterlikPage.userShouldSeeHizmetliFedaiAKGUNTitleInServisOdasiOnGenelSekreterlikPage();
        Assert.assertEquals(text,arg0);
    }
}