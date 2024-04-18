package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BalkanKngreMrkziPage;
import pages.MisyonVizyonPage;
import utils.DriverFactory;

public class BalkanKngreMrkziDefinitions {
    BalkanKngreMrkziPage BalkanKngreMrkziPage = new BalkanKngreMrkziPage(DriverFactory.getDriver());
    @Given("user on the Balkan Kongre Merkezi page")
    public void userOnTheBalkanKongreMerkeziPage() {
        BalkanKngreMrkziPage.userOnTheBalkanKongreMerkeziPage();
    }

    @Then("user should see Balkan Kongre Merkezi title:{string} on Balkan Kongre Merkezi page")
    public void userShouldSeeBalkanKongreMerkeziTitleOnBalkanKongreMerkeziPage(String arg0) {
        String text= BalkanKngreMrkziPage.userShouldSeeBalkanKongreMerkeziTitleOnBalkanKongreMerkeziPage();
        Assert.assertEquals(text,arg0);
    }
}
