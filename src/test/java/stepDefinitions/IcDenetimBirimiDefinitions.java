package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.IcDenetimBirimiPage;
import utils.DriverFactory;
import utils.ElementHelper;

public class IcDenetimBirimiDefinitions {
    IcDenetimBirimiPage icDenetimBirimiPage= new IcDenetimBirimiPage(DriverFactory.getDriver());
    @Given("user on the Ic Denetim Birimi page")
    public void userOnTheIcDenetimBirimiPage() {
        icDenetimBirimiPage.userOnTheIcDenetimBirimiPage();
    }

    @Then("user should see Ic Denetim Birimi title : {string} on Ic Deneteim Birimi page")
    public void userShouldSeeIcDenetimBirimiTitleOnIcDeneteimBirimiPage(String arg0) {
        String text= icDenetimBirimiPage.userShouldSeeIcDenetimBirimiTitleOnIcDeneteimBirimiPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Ic Denetim Yonergesi Button")
    public void userShouldSeeIcDenetimYonergesiButton() {
        icDenetimBirimiPage.userShouldSeeIcDenetimYonergesiButton();
    }

    @When("user click Gorev ve Sorumluluklar button on Ic Denetim Birimi page")
    public void userClickGorevVeSorumluluklarButtonOnIcDenetimBirimiPage() {
        icDenetimBirimiPage.userClickGorevVeSorumluluklarButtonOnIcDenetimBirimiPage();
    }

    @Then("user should see Gorev ve Sorumluluklar title:{string} in Gorev ve Sorumluluklar on Ic Denetim Birimi page")
    public void userShouldSeeGorevVeSorumluluklarTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage(String arg0) {
        String text=icDenetimBirimiPage.userShouldSeeGorevVeSorumluluklarTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Ic Denetcinin Gorevleri title: {string} in Gorev ve Sorumluluklar on Ic Denetim Birimi page")
    public void userShouldSeeIcDenetcininGorevleriTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage(String arg0) {
        String text=icDenetimBirimiPage.userShouldSeeIcDenetcininGorevleriTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage();
        Assert.assertEquals(text,arg0);
    }

    @When("user click Ic Denetim Rehberi button on Ic Denetim Birimi page")
    public void userClickIcDenetimRehberiButtonOnIcDenetimBirimiPage() {
        icDenetimBirimiPage.userClickIcDenetimRehberiButtonOnIcDenetimBirimiPage();
    }

    @Then("user should see Ic Denetim Rehberi title : {string} on Ic Deneteim Birimi page")
    public void userShouldSeeIcDenetimRehberiTitleOnIcDeneteimBirimiPage(String arg0) {
        String text= icDenetimBirimiPage.userShouldSeeIcDenetimRehberiTitleOnIcDeneteimBirimiPage();
        Assert.assertEquals(text,arg0);
    }

    @Then("user should see Kamu Ic Denetimi Standartları button")
    public void userShouldSeeKamuIcDenetimiStandartlarıButton() {
        icDenetimBirimiPage.userShouldSeeKamuIcDenetimiStandartlarıButton();
    }
}
