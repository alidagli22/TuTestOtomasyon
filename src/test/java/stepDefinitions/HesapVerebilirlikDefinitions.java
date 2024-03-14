package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HesapVerebilirlikPage;
import pages.TemelDegerlerPage;
import utils.DriverFactory;

public class HesapVerebilirlikDefinitions {
    HesapVerebilirlikPage hesapVerebilirlikPage = new HesapVerebilirlikPage(DriverFactory.getDriver());
    @Given("user on the Hesap Verebilirlik Politikasi page")
    public void userOnTheHesapVerebilirlikPage() { hesapVerebilirlikPage.userOnTheHesapverebilirlikPolitikasiPage();
    }

    @Then("user should see Hesap Verebilirlik Politikasi title : {string} on Hesap Verebilirlik Politikasi page")
    public void userShouldSeeHesapVerebilirlikPolitikasiTitleOnHesapVerebilirlikPolitikasiPage(String title) {
        String text= hesapVerebilirlikPage.userShouldSeeHesapVerebilirlikPolitikasıTitle();
        Assert.assertEquals(text,title);
    }
}
