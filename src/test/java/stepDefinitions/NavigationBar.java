package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.NavigationBarPage;
import utils.DriverFactory;

public class NavigationBar {
    NavigationBarPage navigation = new NavigationBarPage(DriverFactory.getDriver());
    @When("user click Rektor Page Button")
    public void userClickRektorPageButton() {
        navigation.ClickRektorPageButton();

    }

    @Then("user should see Rektor Page")
    public void userShouldSeeRektorPage() {
        navigation.ShouldSeeRektorPage();
    }

    @When("user click Rektor Yardimciliari Osman Page Button")
    public void userClickRektorYardimciliariOsmanPageButton() {
        navigation.ClickRektorYardimciliariOsmanPageButton();
    }

    @Then("user should see Rektor Yardimcisi Osman Page")
    public void userShouldSeeRektorYardimcisiOsmanPage() {
        navigation.ShouldSeeRektorYardimcisiOsmanPage();
    }

    @When("user click Rektor Yardimcilari Ahmet Page Button")
    public void userClickRektorYardimcilariAhmetPageButton() {
        navigation.ClickRektorYardimcilariAhmetPageButton();
    }

    @Then("user should see Rektor Yardimcisi Ahmet Page")
    public void userShouldSeeRektorYardimcisiAhmetPage() {
        navigation.ShouldSeeRektorYardimcisiAhmetPage();
    }

    @When("user click Rektor Yardimcilari Metin Page Button")
    public void userClickRektorYardimcilariMetinPageButton() {
        navigation.ClickRektorYardimcilariMetinPageButton();
    }

    @Then("user should see Rektor Yardimcisi Metin Page")
    public void userShouldSeeRektorYardimcisiMetinPage() {
        navigation.ShouldSeeRektorYardimcisiMetinPage();
    }

    @When("user click on Uygulamali Bilimler Page Button")
    public void userClickOnUygulamaliBilimlerPageButton() {
        navigation.ClickOnUygulamaliBilimlerPageButton();
    }

    @Then("user should see Uygulamali Bilimler Page")
    public void userShouldSeeUygulamaliBilimlerPage() {
        navigation.ShouldSeeUygulamaliBilimlerPage();
    }

    @When("user click on Genel Sekreterlik Button")
    public void userClickOnGenelSekreterlikButton() {
        navigation.ClickOnGenelSekreterlikButton();
    }

    @Then("user should see Genel Sekreterlik Page")
    public void userShouldSeeGenelSekreterlikPage() {
        navigation.ShouldSeeGenelSekreterlikPage();
    }

    @When("user click on Bilgi Islem Page Button")
    public void userClickOnBilgiIslemPageButton() {
        navigation.ClickOnBilgiIslemPageButton();
    }

    @Then("user should see Bilgi Islem Page")
    public void userShouldSeeBilgiIslemPage() {
        navigation.ShouldSeeBilgiIslemPage();
    }

    @When("user click on Hukuk Musavirligi Page Button")
    public void userShouldSeeHukukMusavirligiPageButton(){navigation.ShouldSeeHukukMusavirligiPageButton();}

    @Then("user click on Hukuk Musavirligi Page")
    public void userShouldSeeHukukMusavirligiPage(){navigation.ShouldSeeHukukMusavirligiPage();}

    @When("user click on Ic Denetim Page Button")
    public void userClickOnIcDenetimPageButton() {
        navigation.ClickOnIcDenetimPageButton();
    }

    @Then("user should see Ic Denetim Page")
    public void userShouldSeeIcDenetimPage() {
        navigation.ShouldSeeIcDenetimPage();
    }

    @When("user click on Idari Mali Page Button")
    public void userClickOnIdariMaliPageButton() {
        navigation.ClickOnIdariMaliPageButton();
    }

    @Then("user should see Idarei Mali Page")
    public void userShouldSeeIdareiMaliPage() {
        navigation.ShouldSeeIdareiMaliPage();
    }

    @When("user click on Kutuphane Page Button")
    public void userClickOnKutuphanePageButton() {
        navigation.ClickOnKutuphanePageButton();
    }

    @Then("user should see Kutuphane Page")
    public void userShouldSeeKutuphanePage() {
        navigation.ShouldSeeKutuphanePage();
    }

    @When("user click on Ogrenci Isleri Page Button")
    public void userClickOnOgrenciIsleriPageButton() {
        navigation.ClickOnOgrenciIsleriPageButton();
    }

    @Then("user should see Ogrenci Isleri Page")
    public void userShouldSeeOgrenciIsleriPage() {
        navigation.ShouldSeeOgrenciIsleriPage();
    }

    @When("user click on Personel Daire Isleri Page Button")
    public void userClickOnPersonelDaireIsleriPageButton() {
        navigation.ClickOnPersonelDaireIsleriPageButton();
    }

    @Then("user should see Personel Daire Isleri Page")
    public void userShouldSeePersonelDaireIsleriPage() {
        navigation.ShouldSeePersonelDaireIsleriPage();
    }

    @When("user click on Saglik kultur Page Button")
    public void userClickOnSaglikKulturPageButton() {
        navigation.ClickOnSaglikKulturPageButton();
    }

    @Then("user should see Saglik kultur Page")
    public void userShouldSeeSaglikKulturPage() {
        navigation.ShouldSeeSaglikKulturPage();
    }

    @When("user click on Strateji Page Button")
    public void userClickOnStratejiPageButton() {
        navigation.ClickOnStratejiPageButton();
    }

    @Then("user should see Strateji Page")
    public void userShouldSeeStratejiPage() {
        navigation.ShouldSeeStratejiPage();
    }

    @When("user click on Hastane Page Button")
    public void userClickOnHastanePageButton() {
        navigation.ClickOnHastanePageButton();
    }

    @Then("user should see Hastane Page")
    public void userShouldSeeHastanePage() {
        navigation.ShouldSeeHastanePage();
    }

    @When("user click on Yapi Isleri Page Button")
    public void userClickOnYapiIsleriPageButton() {
        navigation.ClickOnYapiIsleriPageButton();
    }

    @Then("user should see Yapi Isleri Page")
    public void userShouldSeeYapiIsleriPage() {
        navigation.ShouldSeeYapiIsleriPage();
    }

    @When("user click on Doner Sermaye Page Button")
    public void userClickOnDonerSermayePageButton() {
        navigation.ClickOnDonerSermayePageButton();;
    }

    @Then("user should see Doner Sermaye Page")
    public void userShouldSeeDonerSermayePage() {
        navigation.ShouldSeeDonerSermayePage();
    }

    @When("user click on Aday Ogrenci Page Button")
    public void userClickOnAdayOgrenciPageButton() {
        navigation.ClickOnAdayOgrenciPageButton();
    }

    @Then("user should see Aday Ogrenci Page")
    public void userShouldSeeAdayOgrenciPage() {
        navigation.ShouldSeeAdayOgrenciPage();
    }

    @When("user click on Ogrenci Topluluklari Page Button")
    public void userClickOnOgrenciTopluluklariPageButton() {
        navigation.ClickOnOgrenciTopluluklariPageButton();
    }

    @Then("user should see Ogrenci Topluluklari Page")
    public void userShouldSeeOgrenciTopluluklariPage() {
        navigation.ShouldSeeOgrenciTopluluklariPage();
    }

    @When("user click on Ogrenci Bilgi Sistemi Page Button")
    public void userClickOnOgrenciBilgiSistemiPageButton() {
        navigation.ClickOnOgrenciBilgiSistemiPageButton();
    }

    @Then("user should see Ogrenci Bilgi Sistemi Page")
    public void userShouldSeeOgrenciBilgiSistemiPage() {
        navigation.ShouldSeeOgrenciBilgiSistemiPage();
    }

    @When("user click on Erasmus Page Button")
    public void userClickOnErasmusPageButton() {
        navigation.ClickOnErasmusPageButton();
    }

    @Then("user should see Erasmus Page")
    public void userShouldSeeErasmusPage() {
        navigation.ShouldSeeErasmusPage();
    }

    @When("user click on Yabanci Uyguklu Ogrenci Ofisi Page Button")
    public void userClickOnYabanciUygukluOgrenciOfisiPageButton() {
        navigation.ClickOnYabanciUygukluOgrenciOfisiPageButton();
    }

    @Then("user should see Yabanci Uyguklu Ogrenci Ofisi Page")
    public void userShouldSeeYabanciUygukluOgrenciOfisiPage() {
        navigation.ShouldSeeYabanciUygukluOgrenciOfisiPage();
    }

    @When("user click on ECTS Ders Katologu Page Button")
    public void userClickOnECTSDersKatologuPageButton() {
        navigation.ClickOnECTSDersKatologuPageButton();
    }

    @Then("user should see ECTS Ders Katologu Page")
    public void userShouldSeeECTSDersKatologuPage() {
        navigation.ShouldSeeECTSDersKatologuPage();
    }

    @When("user click on Diploma Eki Page Button")
    public void userClickOnDiplomaEkiPageButton() {
        navigation.ClickOnDiplomaEkiPageButton();
    }

    @Then("user should see Diploma Eki Page")
    public void userShouldSeeDiplomaEkiPage() {
        navigation.ShouldSeeDiplomaEkiPage();
    }

    @When("user click on Zorunlu Ortak Servis Dersleri Page Button")
    public void userClickOnZorunluOrtakServisDersleriPageButton() {
        navigation.ClickOnZorunluOrtakServisDersleriPageButton();
    }

    @Then("user should see Zorunlu Ortak Servis Dersleri Page")
    public void userShouldSeeZorunluOrtakServisDersleriPage() {
        navigation.ShouldSeeZorunluOrtakServisDersleriPage();
    }

    @When("user click on Ogrenci Konseyi Page Button")
    public void userClickOnOgrenciKonseyiPageButton() {
        navigation.ClickOnOgrenciKonseyiPageButton();
    }

    @Then("user should see Ogrenci Konseyi Page")
    public void userShouldSeeOgrenciKonseyiPage() {
        navigation.ShouldSeeOgrenciKonseyiPage();
    }

    @When("user click on Kariyer Merkezi Page Button")
    public void userClickOnKariyerMerkeziPageButton() {
        navigation.ClickOnKariyerMerkeziPageButton();
    }

    @Then("user should see Kariyer Merkezi Page")
    public void userShouldSeeKariyerMerkeziPage() {
        navigation.ShouldSeeKariyerMerkeziPage();
    }

    @When("user click on Engelsiz Trakya Universitesi Page Button")
    public void userClickOnEngelsizTrakyaUniversitesiPageButton() {
        navigation.ClickOnEngelsizTrakyaUniversitesiPageButton();
    }

    @Then("user should see Engelsiz Trakya Universitesi Page")
    public void userShouldSeeEngelsizTrakyaUniversitesiPage() {
        navigation.ShouldSeeEngelsizTrakyaUniversitesiPage();
    }

    @When("user click on BKE Dersi Etkinlikleri Page Button")
    public void userClickOnBKEDersiEtkinlikleriPageButton() {
        navigation.ClickOnBKEDersiEtkinlikleriPageButton();
    }

    @Then("user should see BKE Etkinlikleri Page")
    public void userShouldSeeBKEEtkinlikleriPage() {
        navigation.ShouldSeeBKEEtkinlikleriPage();
    }

    @When("user click on E-Egitim Page Button")
    public void userClickOnEEgitimPageButton() {
        navigation.ClickOnEEgitimPageButton();
    }

    @Then("user should see E-Egitim Page")
    public void userShouldSeeEEgitimPage() {
        navigation.ShouldSeeEEgitimPage();
    }

    @When("user click on Kalite Komisyonu Page Button")
    public void userClickOnKaliteKomisyonuPageButton() {
        navigation.ClickOnKaliteKomisyonuPageButton();
    }

    @Then("user should see Kalite Komisyonu Page")
    public void userShouldSeeKaliteKomisyonuPage() {
        navigation.ShouldSeeKaliteKomisyonuPage();
    }

    @When("user click on Kalite Koordinatorlugu Page Button")
    public void userClickOnKaliteKoordinatorluguPageButton() {
        navigation.ClickOnKaliteKoordinatorluguPageButton();
    }

    @Then("user shoul see Kalite Koordinatorlugu Page")
    public void userShoulSeeKaliteKoordinatorluguPage() {
        navigation.ShoulSeeKaliteKoordinatorluguPage();
    }

    @When("user click on Liderlik-Yonetim-Kalite Page Button")
    public void userClickOnLiderlikYonetimKalitePageButton() {
        navigation.ClickOnLiderlikYonetimKalitePageButton();
    }

    @Then("user should see Liderlik-Yonetim-Kalite Page")
    public void userShouldSeeLiderlikYonetimKalitePage() {
        navigation.ShouldSeeLiderlikYonetimKalitePage();
    }

    @When("user click on Egitim ve Ogretim Page Button")
    public void userClickOnEgitimVeOgretimPageButton() {
        navigation.ClickOnEgitimVeOgretimPageButton();
    }

    @Then("user should see Egitim ve Ogretim Page")
    public void userShouldSeeEgitimVeOgretimPage() {
        navigation.ShouldSeeEgitimVeOgretimPage();
    }

    @When("user click on Arastirma ve Gelistirme Page Button")
    public void userClickOnArastirmaVeGelistirmePageButton() {
        navigation.ClickOnArastirmaVeGelistirmePageButton();
    }

    @Then("user should see Arastirma ve Gelistirme Page")
    public void userShouldSeeArastirmaVeGelistirmePage() {
        navigation.ShouldSeeArastirmaVeGelistirmePage();
    }

    @When("user click on Toplumsal Katki Page Button")
    public void userClickOnToplumsalKatkiPageButton() {
        navigation.ClickOnToplumsalKatkiPageButton();
    }

    @Then("user should see Toplumsal Katki Page")
    public void userShouldSeeToplumsalKatkiPage() {
        navigation.ShouldSeeToplumsalKatkiPage();
    }

    @When("user click on Kalite ve Strateji Gelistirme Page Button")
    public void userClickOnKaliteVeStratejiGelistirmePageButton() {
        navigation.ClickOnKaliteVeStratejiGelistirmePageButton();
    }

    @Then("user should see Kalite ve Strateji Gelistirme Page")
    public void userShouldSeeKaliteVeStratejiGelistirmePage() {
        navigation.ShouldSeeKaliteVeStratejiGelistirmePage();
    }

    @When("user click on Kalite Surecleri Page Button")
    public void userClickOnKaliteSurecleriPageButton() {
        navigation.ClickOnKaliteSurecleriPageButton();
    }

    @Then("user should see Kalite Surecleri Page")
    public void userShouldSeeKaliteSurecleriPage() {
        navigation.ShouldSeeKaliteSurecleriPage();
    }

    @When("user click on Akredite Programlar Page Button")
    public void userClickOnAkrediteProgramlarPageButton() {
        navigation.ClickOnAkrediteProgramlarPageButton();
    }

    @Then("user should see Akredite Programlar Page")
    public void userShouldSeeAkrediteProgramlarPage() {
        navigation.ShouldSeeAkrediteProgramlarPage();
    }

    @Then("user should see Kalite Koordinatorlugu Page")
    public void userShouldSeeKaliteKoordinatorluguPage() {
        navigation.ShouldSeeKaliteKoordinatorluguPage();
    }
}
