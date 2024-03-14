package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.TarihcePage;
import pages.TemelDegerlerPage;
import utils.DriverFactory;

public class TarihceDefinitions {
    TarihcePage tarihcePage = new TarihcePage(DriverFactory.getDriver());
    @Given("user on the Tarihce page")
    public void userOnTheTarihcePage() {
        userOnTheTarihcePage();
    }

    @Then("user should see Tarihce title : {string} on Tarihce page")
    public void userShouldSeeTarihceTitleOnTarihcePage(String arg0) {
        String text= tarihcePage.userShouldSeeTarihceTitleOnTarihcePage();
        Assert.assertEquals(arg0,text);
    }

}
