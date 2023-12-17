package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.RektorPage;
import utils.DriverFactory;

public class RektorPageDefinitions {

    RektorPage rektor = new RektorPage(DriverFactory.getDriver());

    @Given("user on the rektor page")
    public void userOnTheRektorPage() {
        rektor.userOnTheRektorPage();
    }

    @Then("user should see Rektor picture")
    public void userShouldSeeRektorPicture() {
        rektor.ShouldSeeRektorPicture();
    }

    @Then("user should see {string} title")
    public void userShouldSeeTitle(String title) {
        String areaTitle = rektor.ShouldSeeTitle();
        Assert.assertEquals(areaTitle , title);
    }

    @Then("user should see rektor name {string}")
    public void userShouldSeeRektorName(String arg0) {
    }

    @Then("user should see Yayınlar title")
    public void userShouldSeeYayınlarTitle() {
    }

    @Then("user should see Bildiri title")
    public void userShouldSeeBildiriTitle() {
    }

    @Given("User on the rektor page")
    public void userOnTheRectorPage() {
    }

    @When("user click on Trakya Universitesi button")
    public void userClickOnTrakyaUniversitesiButton() {
    }

    @Then("user should see trakya universitesi page")
    public void userShouldSeeTrakyaUniversitesiPage() {
    }

    @When("user click on Personel Arama button")
    public void userClickOnPersonelAramaButton() {
    }

    @Then("user should see Personel Arama Page")
    public void userShouldSeePersonelAramaPage() {
    }

    @When("user click on Duyuru Takibi")
    public void userClickOnDuyuruTakibi() {
    }

    @Then("user should see Duyuru takibi page")
    public void userShouldSeeDuyuruTakibiPage() {
    }
}
