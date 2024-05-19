package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.KurumsalKimlikPage;
import utils.DriverFactory;

public class KurumsalKimlikDefinations {
    KurumsalKimlikPage kurumsalKimlikPage = new KurumsalKimlikPage(DriverFactory.getDriver());
    @Given("user on the Kurumsal Kimlik Page")
    public void userOnTheKurumsalKimlikPage() {
        kurumsalKimlikPage.userOnTheKurumsalKimlikPage();

    }

    @Then("user should see Logo Indirme title : {string} on Kurumsal Kimlik Page")
    public void userShouldSeeLogoIndirmeTitleOnKurumsalKimlikPage(String arg0) {
        String text=kurumsalKimlikPage.userShouldSeeLogoIndirmeTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Normal Kullanim title : {string} on Kurumsal Kimlik Page")
    public void userShouldSeeNormalKullanimTitleOnKurumsalKimlikPage(String arg0) {
        String text= kurumsalKimlikPage.userShouldSeeNormalKullanimTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Normal Kullanim Ingilizce title : {string} on Kurumsal Kimlik Page")
    public void userShouldSeeNormalKullanimIngilizceTitleOnKurumsalKimlikPage(String arg0) {
        String text= kurumsalKimlikPage.userShouldSeeNormalKullanimIngilizceTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Yatay Kullanim title : {string} on Kurumsal Kimlik Page")
    public void userShouldSeeYatayKullanimTitleOnKurumsalKimlikPage(String arg0) {
        String text= kurumsalKimlikPage.userShouldSeeYatayKullanimTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Yatay Kullanim Ingilizce title : {string} on Kurumsal Kimlik Page")
    public void userShouldSeeYatayKullanimIngilizceTitleOnKurumsalKimlikPage(String arg0) {
        String text= kurumsalKimlikPage.userShouldSeeYatayKullanimIngilizceTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click on Kurumsal Kimlik Rehberi Button")
    public void userClickOnKurumsalKimlikRehberiButton() {
        kurumsalKimlikPage.userClickOnKurumsalKimlikRehberiButton();
    }

    @When("user click on Anasayfa Button")
    public void userClickOnAnasayfaButton() {
        kurumsalKimlikPage.userClickOnAnasayfaButton();
    }

    @When("user click on Birim Logolari Button")
    public void userClickOnBirimLogolariButton() {
        kurumsalKimlikPage.userClickOnBirimLogolariButton();
    }

    @When("user click on Bize Ulasin Button")
    public void userClickOnBizeUlasinButton() {
        kurumsalKimlikPage.userClickOnBizeUlasinButton();

    }

    @When("user click on Trakya Universitesi Button Button")
    public void userClickOnTrakyaUniversitesiButtonButton() {
        kurumsalKimlikPage.userClickOnTrakyaUniversitesiButtonButton();
    }

    @Then("user should see SSS title:{string} on Kurumsal Kimlik page")
    public void userShouldSeeSSSTitleOnKurumsalKimlikPage(String arg0) {
        String text=kurumsalKimlikPage.userShouldSeeSSSTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Twitter title : {string} on Kurumsal Kimlik page")
    public void userShouldSeeTwitterTitleOnKurumsalKimlikPage(String arg0) {
        String text =kurumsalKimlikPage.userShouldSeeTwitterTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Facebook title : {string} on Kurumsal Kimlik page")
    public void userShouldSeeFacebookTitleOnKurumsalKimlikPage(String arg0) {
        String text=kurumsalKimlikPage.userShouldSeeFacebookTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);

    }

    @Then("user should see Youtube title : {string} on Kurumsal Kimlik page")
    public void userShouldSeeYoutubeTitleOnKurumsalKimlikPage(String arg0) {
        String text=kurumsalKimlikPage.userShouldSeeYoutubeTitleOnKurumsalKimlikPage();
        Assert.assertEquals(text,arg0);
    }
}
