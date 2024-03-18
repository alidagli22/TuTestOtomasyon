package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RektorPage;
import pages.RektorYardimcilariPage;
import utils.DriverFactory;

public class RektorYardimcilariDefinitions {
    RektorYardimcilariPage rektoryardimcilarigorev = new RektorYardimcilariPage(DriverFactory.getDriver());

    @Given("user on the Rektor Yardimcilari Gorev Dagilimi Page")
    public void userOnTheRektorYardimcilariGorevDagilimiPage() { rektoryardimcilarigorev.userOnTheRektorYardimcilariGorevDagilimiPage();
    }

    @When("user click on Universite Button")
    public void userClickOnUniversiteButton() {rektoryardimcilarigorev.ClickOnUniversiteButton();
    }

    @When("user click on Yonetim Page Button")
    public void userClickOnYonetimPageButton() {rektoryardimcilarigorev.ClickOnYonetimPageButton();
    }

    @When("user click on Rektor Page Button")
    public void userClickOnRektorPageButton() {
    }

    @When("user click on Erhan Tabakoglu Button")
    public void userClickOnErhanTabakogluButton() {
    }

    @Then("user should see Erhan Tabakoglu Page")
    public void userShouldSeeErhanTabakogluPage() {
    }

    @When("user click on Rektor Yardimcilari Page Button")
    public void userClickOnRektorYardimcilariPageButton() {
    }

    @Then("user should see Rektor Yardimcisi Osman N Hatipoglu Page")
    public void userShouldSeeRektorYardimcisiOsmanNHatipogluPage() {
    }

    @Then("user should see Rektor Yardimcisi Ahmet Hamdi Zafer Page")
    public void userShouldSeeRektorYardimcisiAhmetHamdiZaferPage() {
    }

    @Then("user should see Rektor Yardimcisi Metin Aydogdu Page")
    public void userShouldSeeRektorYardimcisiMetinAydogduPage() {
    }

    @When("user click on Rektor Yardimcilari Gorev Dagilimi Button")
    public void userClickOnRektorYardimcilariGorevDagilimiButton() {
    }

    @Then("user should see Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeRektorYardimcilariGorevDagilimiPage() {
    }

    @When("user click on Senato Button")
    public void userClickOnSenatoButton() {
    }

    @Then("user should see Senato Page")
    public void userShouldSeeSenatoPage() {
    }

    @When("user click on Yonetim Kurulu Button")
    public void userClickOnYonetimKuruluButton() {
    }

    @Then("user should see Yonetim Kurulu Page")
    public void userShouldSeeYonetimKuruluPage() {
    }

    @When("user click on Gecmis Donem Rektorlerimiz Button")
    public void userClickOnGecmisDonemRektorlerimizButton() {
    }

    @Then("user should see Gecmis Donem Rektorlerimiz Page")
    public void userShouldSeeGecmisDonemRektorlerimizPage() {
    }

    @When("user click on Tanitim Page Button")
    public void userClickOnTanitimPageButton() {
    }

    @Then("user should see Tanitim Katologu{int} Page")
    public void userShouldSeeTanitimKatologuPage(int arg0) {
    }

    @Then("user should see Tanitim Filmi Page")
    public void userShouldSeeTanitimFilmiPage() {
    }

    @When("user click on Universite Hakkinda Page Button")
    public void userClickOnUniversiteHakkindaPageButton() {
    }

    @When("user click on Misyon ve Vizyon Button")
    public void userClickOnMisyonVeVizyonButton() {
    }

    @Then("user should see Misyon ve Vizyon Page")
    public void userShouldSeeMisyonVeVizyonPage() {
    }

    @When("user click on Temel Degerler Button")
    public void userClickOnTemelDegerlerButton() {
    }

    @Then("user should see Temel Degerler Page")
    public void userShouldSeeTemelDegerlerPage() {
    }

    @When("user click on Etik Davranis İlkelerimiz Button")
    public void userClickOnEtikDavranisİlkelerimizButton() {
    }

    @Then("user should see Etik Davranıs İlkelerimiz Page")
    public void userShouldSeeEtikDavranisIlkelerimizPage() {
    }

    @When("user click on Kalite Politikamiz Button")
    public void userClickOnKalitePolitikamizButton() {
    }

    @Then("user should see Kalite Politikamiz Page")
    public void userShouldSeeKalitePolitikamizPage() {
    }

    @When("user click on Hesap Verebilirlik Politikasi Button")
    public void userClickOnHesapVerebilirlikPolitikasiButton() {
    }

    @Then("user should see Hesap Verebilirlik Politikasi Page")
    public void userShouldSeeHesapVerebilirlikPolitikasiPage() {
    }

    @When("user click on Tarihce Button")
    public void userClickOnTarihceButton() {
    }

    @Then("user should see Tarihce Page")
    public void userShouldSeeTarihcePage() {
    }

    @When("user click on Kurumsal Kimlik Button")
    public void userClickOnKurumsalKimlikButton() {
    }

    @Then("user should see Kurumsal Kimlik Page")
    public void userShouldSeeKurumsalKimlikPage() {
    }

    @When("user click on Balkan Kongre Merkezi Button")
    public void userClickOnBalkanKongreMerkeziButton() {
    }

    @Then("user should see Balkan Kongre Merkezi Page")
    public void userShouldSeeBalkanKongreMerkeziPage() {
    }

    @When("user click on Kurum İci Degerlendirme Raporu Button")
    public void userClickOnKurumIciDegerlendirmeRaporuButton() {
    }

    @Then("user should see Kurum İci Degerlendirme Raporu Page")
    public void userShouldSeeKurumİciDegerlendirmeRaporuPage() {
    }

    @When("user click on Mevzuat Button")
    public void userClickOnMevzuatButton() {
    }

    @Then("user should see Mevzuat Page")
    public void userShouldSeeMevzuatPage() {
    }

    @When("user click on Stratejik Plan Button")
    public void userClickOnStratejikPlanButton() {
    }

    @When("user click on 2023-2027 Button")
    public void userClickOnYilButton() {
    }

    @Then("user should see 2023-2027 Page")
    public void userShouldSeeYilPage() {
    }
    @When("user click on 2018-2022 Button")
    public void userClickOnSecondYilButton() {
    }

    @Then("user should see 2018-2022 Page")
    public void userShouldSeeSecondYilPage() {
    }
    @When("user click on 2013-2017 Button")
    public void userClickOnThirdYilButton() {
    }

    @Then("user should see 2013-2017 Page")
    public void userShouldSeeThirdYilPage() {
    }


    @When("user click on Akademik Button")
    public void userClickOnAkademikButton() {
    }

    @Then("user should see Enstitüler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeEnstitülerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @When("user click on Balkan Arastirma Enstitusu Page Button")
    public void userClickOnBalkanArastirmaEnstitusuPageButton() {
    }

    @Then("user should see Balkan Arastirma Enstitusu Page")
    public void userShouldSeeBalkanArastirmaEnstitusuPage() {
    }

    @When("user click on Fen Bilimleri Enstitusu Page Button")
    public void userClickOnFenBilimleriEnstitusuPageButton() {
    }

    @Then("user should see Fen Bilimleri Enstitusu Page")
    public void userShouldSeeFenBilimleriEnstitusuPage() {
    }

    @When("user click on Roman Dili ve Kulturu Arastirmalari Enstitusu Page Button")
    public void userClickOnRomanDiliVeKulturuArastirmalariEnstitusuPageButton() {
    }

    @Then("user should see Roman Dili ve Kulturu Arastirmalari Enstitusu Page")
    public void userShouldSeeRomanDiliVeKulturuArastirmalariEnstitusuPage() {
    }

    @When("user click on Saglik Bilimleri Enstitusu Page Button")
    public void userClickOnSaglikBilimleriEnstitusuPageButton() {
    }

    @Then("user should see Saglik Bilimleri Enstitusu Page")
    public void userShouldSeeSaglikBilimleriEnstitusuPage() {
    }

    @When("user click on Sosyal Bilimler Enstitusu Page Button")
    public void userClickOnSosyalBilimlerEnstitusuPageButton() {
    }

    @Then("user should see Sosyal Bilimler Enstitusu Page")
    public void userShouldSeeSosyalBilimlerEnstitusuPage() {
    }

    @When("user click on Arastirma ve Uygulama Merkezleri Page Button")
    public void userClickOnArastirmaVeUygulamaMerkezleriPageButton() {
    }

    @Then("user should see Arastirma ve Uygulama Merkezleri Page")
    public void userShouldSeeArastirmaVeUygulamaMerkezleriPage() {
    }

    @When("user click on UNESCO Chair Of Quality Education & Digital Tranformation Page Button")
    public void userClickOnUNESCOChairOfQualityEducationDigitalTranformationPageButton() {
    }

    @Then("user should see UNESCO Chair Of Quality Education & Digital Tranformation Page")
    public void userShouldSeeUNESCOChairOfQualityEducationDigitalTranformationPage() {
    }

    @When("user click on Dis Hekimligi Fakultesi Page Button")
    public void userClickOnDisHekimligiFakultesiPageButton() {
    }

    @Then("user should see Dis Hekimligi Fakultesi Page")
    public void userShouldSeeDisHekimligiFakultesiPage() {
    }

    @When("user click on Eczacilik Fakultesi Page Button")
    public void userClickOnEczacilikFakultesiPageButton() {
    }

    @Then("user should see Eczacilik Fakultesi Page")
    public void userShouldSeeEczacilikFakultesiPage() {
    }

    @When("user click on Edebiyat Fakultesi Page Button")
    public void userClickOnEdebiyatFakultesiPageButton() {
    }

    @Then("user should see Edebiyat Fakultesi Page")
    public void userShouldSeeEdebiyatFakultesiPage() {
    }

    @When("user click on Egitim Fakultesi Page Button")
    public void userClickOnEgitimFakultesiPageButton() {
    }

    @Then("user should see Egitim Fakultesi Page")
    public void userShouldSeeEgitimFakultesiPage() {
    }

    @When("user click on Fen Fakultesi Page Button")
    public void userClickOnFenFakultesiPageButton() {
    }

    @Then("user should see Fen Fakultesi Page")
    public void userShouldSeeFenFakultesiPage() {
    }

    @When("user click on Guzel Sanatlar Fakultesi Page Button")
    public void userClickOnGuzelSanatlarFakultesiPageButton() {
    }

    @Then("user should see Guzel Sanatlar Fakultesi Page")
    public void userShouldSeeGuzelSanatlarFakultesiPage() {
    }

    @When("user click on Iktisadi ve Idari Bilimler Fakultesi Page Button")
    public void userClickOnIktisadiVeIdariBilimlerFakultesiPageButton() {
    }

    @Then("user should see Iktisadi ve Idari Bilimler Fakultesi Page")
    public void userShouldSeeIktisadiVeIdariBilimlerFakultesiPage() {
    }

    @When("user click on Ilahiyat Fakultesi Page Button")
    public void userClickOnIlahiyatFakultesiPageButton() {
    }

    @Then("user should see Ilahiyat Fakultesi Page")
    public void userShouldSeeIlahiyatFakultesiPage() {
    }

    @When("user click on Kirpinar Spor Bilimleri Fakultesi Page Button")
    public void userClickOnKirpinarSporBilimleriFakultesiPageButton() {
    }

    @Then("user should see Kirpinar Spor Bilimleri Fakultesi Page")
    public void userShouldSeeKirpinarSporBilimleriFakultesiPage() {
    }

    @When("user click on Mimarlik Fakultesi Page Button")
    public void userClickOnMimarlikFakultesiPageButton() {
    }

    @Then("user should see Mimarlik Fakultesi Page")
    public void userShouldSeeMimarlikFakultesiPage() {
    }

    @When("user click on Muhendislik Fakultesi Page Button")
    public void userClickOnMuhendislikFakultesiPageButton() {
    }

    @Then("user should see Muhendislik Fakultesi Page")
    public void userShouldSeeMuhendislikFakultesiPage() {
    }

    @When("user click on Saglik Bilimleri Fakultesi Page Button")
    public void userClickOnSaglikBilimleriFakultesiPageButton() {
    }

    @Then("user should see Saglik Bilimleri Fakultesi Page")
    public void userShouldSeeSaglikBilimleriFakultesiPage() {
    }

    @When("user click on Tip Fakultesi Page Button")
    public void userClickOnTipFakultesiPageButton() {
    }

    @Then("user should see Tip Fakultesi Page")
    public void userShouldSeeTipFakultesiPage() {
    }

    @When("user click on Uygulamali Bilimler Fakultesi Page Button")
    public void userClickOnUygulamaliBilimlerFakultesiPageButton() {
    }

    @Then("user should see Uygulamali Bilimler Fakultesi Page")
    public void userShouldSeeUygulamaliBilimlerFakultesiPage() {
    }

    @When("user click on Devlet Konservatuvari Page Button")
    public void userClickOnDevletKonservatuvariPageButton() {
    }

    @Then("user should see Devlet Konservatuvari Page")
    public void userShouldSeeDevletKonservatuvariPage() {
    }

    @When("user click on Kesan Hakki Yoruk Saglik Yuksekokulu Page Button")
    public void userClickOnKesanHakkiYorukSaglikYuksekokuluPageButton() {
    }

    @Then("user should see Kesan Hakki Yoruk Saglik Yuksekokulu Page")
    public void userShouldSeeKesanHakkiYorukSaglikYuksekokuluPage() {
    }

    @When("user click on Kesan Yusuf Capraz Uygulamali Bilimler Yuksekokulu Page Button")
    public void userClickOnKesanYusufCaprazUygulamaliBilimlerYuksekokuluPageButton() {
    }

    @Then("user should see Kesan Yusuf Capraz Uygulamali Bilimler Yuksekokulu Page")
    public void userShouldSeeKesanYusufCaprazUygulamaliBilimlerYuksekokuluPage() {
    }

    @When("user click on Uzunkopru Uygulamali Bilimler Yuksekokulu Page Button")
    public void userClickOnUzunkopruUygulamaliBilimlerYuksekokuluPageButton() {
    }

    @Then("user should see Uzunkopru Uygulamali Bilimler Yuksekokulu Page")
    public void userShouldSeeUzunkopruUygulamaliBilimlerYuksekokuluPage() {
    }

    @When("user click on Yabanci Diller Yuksekokulu Page Button")
    public void userClickOnYabanciDillerYuksekokuluPageButton() {
    }

    @Then("user should see Yabanci Diller Yuksekokulu Page")
    public void userShouldSeeYabanciDillerYuksekokuluPage() {
    }

    @When("user click on Arda Meslek Yuksekokulu Page Button")
    public void userClickOnArdaMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Arda Meslek Yuksekokulu Page")
    public void userShouldSeeArdaMeslekYuksekokuluPage() {
    }

    @When("user click on Edirne Sosyal Bilimler Meslek Yuksekokulu Page Button")
    public void userClickOnEdirneSosyalBilimlerMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Edirne Sosyal Bilimler Meslek Yuksekokulu Page")
    public void userShouldSeeEdirneSosyalBilimlerMeslekYuksekokuluPage() {
    }

    @When("user click on Edirne Teknik Bilimler Meslek Yuksekokulu Page Button")
    public void userClickOnEdirneTeknikBilimlerMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Edirne Teknik Bilimler Meslek Yuksekokulu Page")
    public void userShouldSeeEdirneTeknikBilimlerMeslekYuksekokuluPage() {
    }

    @When("user click on Havsa Meslek Yuksekokulu Page Button")
    public void userClickOnHavsaMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Havsa Meslek Yuksekokulu Page")
    public void userShouldSeeHavsaMeslekYuksekokuluPage() {
    }

    @When("user click on Ipsala Meslek Yuksekokulu Page Button")
    public void userClickOnIpsalaMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Ipsala Meslek Yuksekokulu Page")
    public void userShouldSeeIpsalaMeslekYuksekokuluPage() {
    }

    @When("user click on Kesan Meslek Yuksekokulu Page Button")
    public void userClickOnKesanMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Kesan Meslek Yuksekokulu Page")
    public void userShouldSeeKesanMeslekYuksekokuluPage() {
    }

    @When("user click on Saglik Hizmetleri Meslek Yuksekokulu Page Button")
    public void userClickOnSaglikHizmetleriMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Saglik Hizmetleri Meslek Yuksekokulu Page")
    public void userShouldSeeSaglikHizmetleriMeslekYuksekokuluPage() {
    }

    @When("user click on Sehit Ressam Hasan Riza Guzel Sanatlar Meslek Yuksekokulu Page Button")
    public void userClickOnSehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Sehit Ressam Hasan Riza Guzel Sanatlar Meslek Yuksekokulu Page")
    public void userShouldSeeSehitRessamHasanRizaGuzelSanatlarMeslekYuksekokuluPage() {
    }

    @When("user click on Tunca Meslek Yuksekokulu Page Button")
    public void userClickOnTuncaMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Tunca Meslek Yuksekokulu Page")
    public void userShouldSeeTuncaMeslekYuksekokuluPage() {
    }

    @When("user click on Uzunkopru Meslek Yuksekokulu Page Button")
    public void userClickOnUzunkopruMeslekYuksekokuluPageButton() {
    }

    @Then("user should see Uzunkopru Meslek Yuksekokulu Page")
    public void userShouldSeeUzunkopruMeslekYuksekokuluPage() {
    }

    @When("user click on Idari Button")
    public void userClickOnIdariButton() {
    }

    @When("user click on Genel Sekreterlik Page Button")
    public void userClickOnGenelSekreterlikPageButton() {
    }

    @When("user click on Bilgi Islem Daire Baskanligi Page Button")
    public void userClickOnBilgiIslemDaireBaskanligiPageButton() {
    }

    @Then("user should see Bilgi Islem Daire Baskanligi Page")
    public void userShouldSeeBilgiIslemDaireBaskanligiPage() {
    }

    @When("user click on Hukuk Musavirligi Page Button")
    public void userClickOnHukukMusavirligiPageButton() {
    }

    @Then("user should see Hukuk Musavirligi Page")
    public void userShouldSeeHukukMusavirligiPage() {
    }

    @When("user click on Ic Denetim Birimi Page Button")
    public void userClickOnIcDenetimBirimiPageButton() {
    }

    @Then("user should see Ic Denetim Birimi Page")
    public void userShouldSeeIcDenetimBirimiPage() {
    }

    @When("user click on Idari ve Mali Isler Daire Baskanligi Page Button")
    public void userClickOnIdariVeMaliIslerDaireBaskanligiPageButton() {
    }

    @Then("user should see Idari ve Mali Isler Daire Baskanligi Page")
    public void userShouldSeeIdariVeMaliIslerDaireBaskanligiPage() {
    }

    @When("user click on Kutuphane ve Dokumantasyon Daire Baskanligi Page Button")
    public void userClickOnKutuphaneVeDokumantasyonDaireBaskanligiPageButton() {
    }

    @Then("user should see Kutuphane ve Dokumantasyon Daire Baskanligi Page")
    public void userShouldSeeKutuphaneVeDokumantasyonDaireBaskanligiPage() {
    }

    @When("user click on Ogrenci İsleri Daire Baskanligi Page Button")
    public void userClickOnOgrenciIsleriDaireBaskanligiPageButton() {
    }

    @Then("user should see Ogrenci İsleri Daire Baskanligi Page")
    public void userShouldSeeOgrenciIsleriDaireBaskanligiPage() {
    }

    @When("user click on Personel Daire Baskanligi Page Button")
    public void userClickOnPersonelDaireBaskanligiPageButton() {
    }

    @Then("user should see Personel Daire Baskanligi Page")
    public void userShouldSeePersonelDaireBaskanligiPage() {
    }

    @When("user click on Saglik Kultur ve Spor Daire Baskanligi Page Button")
    public void userClickOnSaglikKulturVeSporDaireBaskanligiPageButton() {
    }

    @Then("user should see Saglik Kultur ve Spor Daire Baskanligi Page")
    public void userShouldSeeSaglikKulturVeSporDaireBaskanligiPage() {
    }

    @When("user click on Strateji Gelistirme Daire Baskanligi Page Button")
    public void userClickOnStratejiGelistirmeDaireBaskanligiPageButton() {
    }

    @Then("user should see Strateji Gelistirme Daire Baskanligi Page")
    public void userShouldSeeStratejiGelistirmeDaireBaskanligiPage() {
    }

    @When("user click on TU Hastanesi Basmudurlugu  Page Button")
    public void userClickOnTUHastanesiBasmudurluguPageButton() {
    }

    @Then("user should see TU Hastanesi Basmudurlugu Page")
    public void userShouldSeeTUHastanesiBasmudurluguPage() {
    }

    @When("user click on Yapi Isleri ve Teknik Daire Baskanligi Page Button")
    public void userClickOnYapiIsleriVeTeknikDaireBaskanligiPageButton() {
    }

    @Then("user should see Yapi Isleri ve Teknik Daire Baskanligi Page")
    public void userShouldSeeYapiIsleriVeTeknikDaireBaskanligiPage() {
    }

    @When("user click on Doner Sermaye Isletme Mudurlugu Page Button")
    public void userClickOnDonerSermayeIsletmeMudurluguPageButton() {
    }

    @Then("user should see Doner Sermaye Isletme Mudurlugu Page")
    public void userShouldSeeDonerSermayeIsletmeMudurluguPage() {
    }

    @When("user click on Ogrenci Button")
    public void userClickOnOgrenciButton() {
    }

    @When("user click on Yabanci Uyruklu Ogrenci Ofisi Page Button")
    public void userClickOnYabanciUyrukluOgrenciOfisiPageButton() {
    }

    @Then("user should see Yabancı Uyruklu Ogrenci Ofisi Page")
    public void userShouldSeeYabancıUyrukluOgrenciOfisiPage() {
    }

    @When("user click on E-Egitim Button")
    public void userClickOnEEgitimButton() {
    }

    @When("user click on Kalite Guvencesi Button")
    public void userClickOnKaliteGuvencesiButton() {
    }

    @Then("user should see Kalite Guvencesi Page")
    public void userShouldSeeKaliteGuvencesiPage() {
    }

    @When("user click on English Button")
    public void userClickOnEnglishButton() {
    }

    @Then("user should see English Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeEnglishTitleOnRektorYardimcilariGorevDagilimiPage(String title) {
    }

    @Then("user should see English Home Page")
    public void userShouldSeeEnglishHomePage() {
    }

    @When("user click on Kullanici Girisi Button")
    public void userClickOnKullaniciGirisiButton() {
    }

    @Then("user should see Teknokta Page")
    public void userShouldSeeTeknoktaPage() {
    }

    @Then("user should see Rektor Yardimcilari Gorev Dagilimi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeRektorYardimcilariGorevDagilimiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @When("user click on Metin Aydogdu Button")
    public void userClickOnMetinAydogduButton() {
    }

    @Then("user should see Ögrenci İsleri Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeOgrenciIsleriDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Bilgi Islem Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBilgiIslemDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Fakulteler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeFakultelerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Teknopark Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeTeknoparkTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see BEK Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBEKTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Yenilikcilik ve Girisimcilik Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeYenilikcilikVeGirisimcilikTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see OYP Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeOYPTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Zorunlu Ortak Dersler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeZorunluOrtakDerslerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Bilimsel Dergiler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBilimselDergilerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Enstituler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeEnstitulerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Dis Kaynakli Projeler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeDisKaynakliProjelerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see On Degerlendirme Komisyonu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeOnDegerlendirmeKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Yaz Okulu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeYazOkuluTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Sinai Mulkiyet Degerlendirme Kurulu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSinaiMulkiyetDegerlendirmeKuruluTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Teknoloji Transfer Uygulama ve Arastirma Merkezi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeTeknolojiTransferUygulamaVeArastirmaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @When("user click on Osman Nuri Hatipoglu Button")
    public void userClickOnOsmanNuriHatipogluButton() {
    }

    @Then("user should see Strateji Gelistirme Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeStratejiGelistirmeDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Yapi Işleri ve Teknik Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeYapiIsleriVeTeknikDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Idari ve Mali Isler Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeIdariVeMaliIslerDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Bilimsel Arastirma Projeleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBilimselArastirmaProjeleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Saglik Arasirma ve Uygulama Merkezi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSaglikArasirmaVeUygulamaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Agiz ve Dis Sagligi Uygulama ve Arastirma Merkezi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeAgizVeDisSagligiUygulamaVeArastirmaMerkeziTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Saglikla Ilgili Diger Arastirma ve Uygulama Merkezleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSagliklaIlgiliDigerArastirmaVeUygulamaMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see TU Doner Sermaye Yurutme Kurulu Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeTUDonerSermayeYurutmeKuruluBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Kiralama İslemleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeKiralamaIslemleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see UAK Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeUAKTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Saglik Bilimleri Bilimsel Arastirma ve Yayın Etigi Kurul Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSaglikBilimleriBilimselArastirmaVeYayınEtigiKurulBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Dis Iliskiler Merkez Mudurlugu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeDisIliskilerMerkezMudurluguTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @When("user click on Ahmet Hamdi Zafer Button")
    public void userClickOnAhmetHamdiZaferButton() {
    }

    @Then("user should see Kutuphane ve Dokumantasyon Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeKutuphaneVeDokumantasyonDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Saglik Kultur ve Spor Daire Baskanligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSaglikKulturVeSporDaireBaskanligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Kongre Merkezleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeKongreMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Guzel Sanatlar Fakultesi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeGuzelSanatlarFakultesiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Devlet Konservatuvarı Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeDevletKonservatuvariTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Balkan Arastirma Enstitusu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBalkanArastirmaEnstitusuTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see II. Bayezit Kulliyesi Icerisindeki Kuruluslar Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeIIBayezitKulliyesiIcerisindekiKuruluslarTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Lojmanlar Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeLojmanlarTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Arastirma ve Uygulama Merkezleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeArastirmaVeUygulamaMerkezleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Sivil Toplum Orgutleri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSivilToplumOrgutleriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Sosyal Faaliyetler Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeSosyalFaaliyetlerTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Yuksekokullar ve Meslek Yuksekokullari Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeYuksekokullarVeMeslekYuksekokullariTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Engelsiz Universite Birimi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeEngelsizUniversiteBirimiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Universite Turizm Iliskileri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeUniversiteTurizmIliskileriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Trakya Universiteler Birligi Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeTrakyaUniversitelerBirligiTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Balkan Arboretumu ve EDTU Herbaryumu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeBalkanArboretumuVeEDTUHerbaryumuTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Mevzuat Komisyonu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeMevzuatKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Universite Yerel Yonetim Ilıskileri Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeUniversiteYerelYonetimIlıskileriTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }

    @Then("user should see Yayin Komisyonu Title: {string} on Rektor Yardimcilari Gorev Dagilimi Page")
    public void userShouldSeeYayinKomisyonuTitleOnRektorYardimcilariGorevDagilimiPage(String arg0) {
    }
}

