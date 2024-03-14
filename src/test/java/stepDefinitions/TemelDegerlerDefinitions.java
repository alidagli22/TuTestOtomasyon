package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MisyonVizyonPage;
import pages.TemelDegerlerPage;
import utils.DriverFactory;

public class TemelDegerlerDefinitions {
    TemelDegerlerPage temelDegerlerPage = new TemelDegerlerPage(DriverFactory.getDriver());
    @Given("user on the Temel Degerler page")
    public void userOnTheTemelDegerlerPage() {
        temelDegerlerPage.userOnTheTemelDegerlerPage();
    }

    @Then("user should see Temel Degerler title : {string} on Temel Degerler page")
    public void userShouldSeeTemelDegerlerTitleOnTemelDegerlerPage(String title) {
        String text = temelDegerlerPage.userShouldSeeTemelDegerlerTitle();
        Assert.assertEquals(text,title);

    }
}
