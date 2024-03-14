package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.MisyonVizyonPage;
import utils.DriverFactory;

public class MisyonVizyonDefinitions {
    MisyonVizyonPage misyonVizyonPage = new MisyonVizyonPage(DriverFactory.getDriver());
    @Given("user on the Misyon Vizyon Page")
    public void userOnTheMisyonVizyonPage() {
        misyonVizyonPage.userOnTheMisyonVizyonPage();

    }

    @Then("user should see Misyon title : {string} on Misyon Vizyon Page")
    public void userShouldSeeMisyonTitleOnMisyonVizyonPage(String title) {
        String text = misyonVizyonPage.userShouldSeeMisyonTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Vizyon title : {string} on Misyon Vizyon Page")
    public void userShouldSeeVizyonTitleOnMisyonVizyonPage(String title) {
        String text = misyonVizyonPage.userShouldSeeVizyonTitle();
        Assert.assertEquals(text,title);


    }
}
