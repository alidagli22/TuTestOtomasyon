package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.KalitePolitikasiPage;
import utils.DriverFactory;

public class KalitePolitikasiDefinitions {
    KalitePolitikasiPage kalitePolitikasiPage=new KalitePolitikasiPage(DriverFactory.getDriver());
    @Given("user on the Kalite Politikasi page")
    public void userOnTheKalitePolitikasiPage() {
        kalitePolitikasiPage.userOnTheKalitePolitikasiPage();


    }

    @Then("user should see Kalite Politikasi title : {string} on Kalite Politikasi page")
    public void userShouldSeeKalitePolitikasiTitleOnKalitePolitikasiPage(String arg0) {
        kalitePolitikasiPage.userShouldSeeKalitePolitikasiTitleOnKalitePolitikasiPage();

    }
}
