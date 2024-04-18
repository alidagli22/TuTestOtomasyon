package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.KurumIciDegerlendirmePage;
import pages.MisyonVizyonPage;
import utils.DriverFactory;

public class KurumIcıDegerlendirmeDefinitions {
    KurumIciDegerlendirmePage KurumIciDegerlendirmePage = new KurumIciDegerlendirmePage(DriverFactory.getDriver());


    @Given("user on the Kurum Ici Degerlendirme page")
    public void userOnTheKurumIciDegerlendirmePage() {
        KurumIciDegerlendirmePage.userOnTheKurumIciDegerlendirmePage();
    }

    @Then("user should see Kurum Ici Degerlendirme title : {string} on Kurum Ici Degerlendirme page")
    public void userShouldSeeKurumIciDegerlendirmeTitleOnKurumIciDegerlendirmePage(String arg0) {
        String text= KurumIciDegerlendirmePage.userShouldSeeKurumIciDegerlendirmeTitleOnKurumIciDegerlendirmePage();
        Assert.assertEquals(text,arg0);
    }
}
