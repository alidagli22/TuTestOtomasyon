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
    public void userShouldSeeRektorName(String title) {
        String areaTitle = rektor.ShouldSeeRektorName();
        Assert.assertEquals(areaTitle , title);
    }

    @Then("user should see Yayinlar title")
    public void userShouldSeeYayinlarTitle() {
        rektor.ShouldSeeYayinlarTitle();
    }

    @Then("user should see Bildiri title")
    public void userShouldSeeBildiriTitle() {
        rektor.ShouldSeeBildiriTitle();
    }

    @Given("User on the rektor page")
    public void userOnTheRectorPage() {
        rektor.userOnTheRektorPage();
    }

    @When("user click on Trakya Universitesi button")
    public void userClickOnTrakyaUniversitesiButton() {
        rektor.ClickOnTrakyaUniversitesiButton();
    }

    @Then("user should see trakya universitesi page")
    public void userShouldSeeTrakyaUniversitesiPage() {
        rektor.ShouldSeeTrakyaUniversitesiPage();
    }

    @When("user click on Personel Arama button")
    public void userClickOnPersonelAramaButton() {
        rektor.ClickOnPersonelAramaButton();
    }

    @Then("user should see Personel Arama Page")
    public void userShouldSeePersonelAramaPage() {
        rektor.ShouldSeePersonelAramaPage();
    }

    @When("user click on Duyuru Takibi")
    public void userClickOnDuyuruTakibi() {
        rektor.ClickOnDuyuruTakibi();
    }

    @Then("user should see Duyuru takibi page")
    public void userShouldSeeDuyuruTakibiPage() {
        rektor.ShouldSeeDuyuruTakibiPage();
    }
}
