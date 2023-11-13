package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverFactory;

import javax.net.ssl.SSLServerSocket;
import java.lang.ref.SoftReference;

public class HomePageDefinitions {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    @Given("user on the Home Page")
    public void userOnTheHomePage() {
        homePage.userOnTheHomePage();

    }

    @Then("user should see Trakya University Logo")
    public void userShouldSeeTrakyaUniversityLogo() {
        homePage.ShouldSeeTrakyaUniversityLogo();
    }

    @Then("user should see Navigation Area Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaTitle();
        Assert.assertEquals(areaTitle , title);
    }

    @Then("user should see Navigation Area Second Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaSecondTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaSecondTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Navigation Area Third Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaThirdTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaThirdTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Navigation Area Fourth Title : {string} on HomePage")
    public void userShouldSeeNavigationAreaFourthTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaFourthTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Navigation Area Fifth Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaFifthTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaFifthTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Navigation Area Sixth Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaSixthTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaSixthTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Navigation Area Seventh Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaSeventhTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNavigationAreaSeventhTitle();
        Assert.assertEquals(areaTitle,title);
        }

    @Then("user should see News Title: {string} on HomePage")
    public void userShouldSeeNewsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNewsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see News Second Title: {string} on HomePage")
    public void userShouldSeeNewsSecondTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNewsSecondTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Press Title: {string} on HomePage")
    public void userShouldSeePressTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeePressTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Announcements Title: {string} on HomePage")
    public void userShouldSeeAnnouncementsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAnnouncementsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Announcements Second Title: {string} on HomePage")
    public void userShouldSeeAnnouncementsSecondTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAnnouncementsSecondTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Events Title: {string} on HomePage")
    public void userShouldSeeEventsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeEventsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Events Second Title: {string} on HomePage")
    public void userShouldSeeEventsSecondTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeEventsSecondTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see News from Other Universities Title: {string} on HomePage")
    public void userShouldSeeNewsFromOtherUniversitiesTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNewsFromOtherUniversitiesTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see News from Other Universities Second Title: {string} on HomePage")
    public void userShouldSeeNewsFromOtherUniversitiesSecondTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNewsFromOtherUniversitiesSecondTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see numbers: {string} on HomePage")
    public void userShouldSeeNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeNumbersOnHome();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Second Numbers: {string} on HomePage")
    public void userShouldSeeSecondNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeSecondNumbers();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Third Numbers: {string} on HomePage")
    public void userShouldSeeThirdNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeThirdNumbers();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Fourth Numbers: {string} on HomePage")
    public void userShouldSeeFourthNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeFourthNumbers();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Fifth Numbers: {string} on HomePage")
    public void userShouldSeeFifthNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeFifthNumbers();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Sixth Numbers: {string} on HomePage")
    public void userShouldSeeSixthNumbersOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeSixthNumbers();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Promotional Presentation Title: {string} on HomePage")
    public void userShouldSeePromotionalPresentationTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeePromotionalPresentationTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Promotional Presentation  video")
    public void userShouldSeePromotionalPresentationVideo() {
        homePage.ShouldSeePromotionalPresentationVideo();
    }

    @Then("user should see Our Museums Title: {string} on HomePage")
    public void userShouldSeeOurMuseumsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeOurMuseumsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Our Museums video")
    public void userShouldSeeOurMuseumsVideo() {
        homePage.ShouldSeeOurMuseumsVideo();
    }

    @Then("user should see Balkan Report Title: {string} on HomePage")
    public void userShouldSeeBalkanReportTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeBalkanReportTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Balkan Report image")
    public void userShouldSeeBalkanReportImage() {
        homePage.ShouldSeeBalkanReportImage();
    }

    @Then("user should see Student Scholarship Projects image")
    public void userShouldSeeStudentScholarshipProjectsImage() {
        homePage.ShouldSeeStudentScholarshipProjectsImage();
    }

    @Then("user should see Student Scholarship Projects Title: {string} on HomePage")
    public void userShouldSeeStudentScholarshipProjectsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeStudentScholarshipProjectsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Library image")
    public void userShouldSeeLibraryImage() {
        homePage.ShouldSeeLibraryImage();
    }

    @Then("user should see Library Title: {string} on HomePage")
    public void userShouldSeeLibraryTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeLibraryTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Edirne image")
    public void userShouldSeeEdirneImage() {
        homePage.ShouldSeeEdirneImage();
    }

    @Then("user should see Edirne Title: {string} on HomePage")
    public void userShouldSeeEdirneTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeEdirneTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Museums image")
    public void userShouldSeeMuseumsImage() {
        homePage.ShouldSeeMuseumsImage();
    }

    @Then("user should see Museums Title: {string} on HomePage")
    public void userShouldSeeMuseumsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeMuseumsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Our Concerts image")
    public void userShouldSeeOurConcertsImage() {
        homePage.ShouldSeeOurConcertsImage();
    }

    @Then("user should see Our Concerts Title: {string} on HomePage")
    public void userShouldSeeOurConcertsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeOurConcertsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Ataturk Corner image")
    public void userShouldSeeAtaturkCornerImage() {
        homePage.ShouldSeeAtaturkCornerImage();
    }

    @Then("user should see Ataturk Corner Title: {string} on HomePage")
    public void userShouldSeeAtaturkCornerTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAtaturkCornerTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journals Title: {string} on HomePage")
    public void userShouldSeeAcademicJournalsTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalsTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal list: {string} on HomePage")
    public void userShouldSeeAcademicJournalListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Second list: {string} on HomePage")
    public void userShouldSeeAcademicJournalSecondListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalSecondList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Third list: {string} on HomePage")
    public void userShouldSeeAcademicJournalThirdListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalThirdList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Fourth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalFourthListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalFourthList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Fifth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalFifthListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalFifthList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Sixth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalSixthListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalSixthList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journals Seventh Title: {string} on HomePage")
    public void userShouldSeeAcademicJournalsSeventhTitleOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalsSeventhTitle();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Eighth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalEighthListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalEighthList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Ninth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalNinthListOnHomePage(String title) {
        String areaTitle = homePage.ShouldSeeAcademicJournalNinthList();
        Assert.assertEquals(areaTitle,title);
    }

    @Then("user should see Academic Journal Tenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalTenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Eleventh list: {string} on HomePage")
    public void userShouldSeeAcademicJournalEleventhListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Twelfth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalTwelfthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Thirteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalThirteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fourteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalFourteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fifteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalFifteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Sixteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalSixteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Seventeenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalSeventeenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Eighteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalEighteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Nineteenth list: {string} on HomePage")
    public void userShouldSeeAcademicJournalNineteenthListOnHomePage(String arg0) {
    }

    @Then("user should see Commissions and Boards Title: {string} on HomePage")
    public void userShouldSeeCommissionsAndBoardsTitleOnHomePage(String arg0) {
    }

    @Then("user should see Units Affiliated to the Rectorate Title: {string} on HomePage")
    public void userShouldSeeUnitsAffiliatedToTheRectorateTitleOnHomePage(String arg0) {
    }

    @Then("user should see Tuba image")
    public void userShouldSeeTubaImage() {
    }

    @Then("user should see Tuba Title: {string} on HomePage")
    public void userShouldSeeTubaTitleOnHomePage(String arg0) {
    }

    @Then("user should see Yok image")
    public void userShouldSeeYokImage() {
    }

    @Then("user should see Yok Title: {string} on HomePage")
    public void userShouldSeeYokTitleOnHomePage(String arg0) {
    }

    @Then("user should see Tub image")
    public void userShouldSeeTubImage() {
    }

    @Then("user should see Tub Title: {string} on HomePage")
    public void userShouldSeeTubTitleOnHomePage(String arg0) {
    }

    @Then("user should see Ilan image")
    public void userShouldSeeIlanImage() {
    }

    @Then("user should see Ilan Title: {string} on HomePage")
    public void userShouldSeeIlanTitleOnHomePage(String arg0) {
    }

    @Then("user should see Balkan Universities Association image")
    public void userShouldSeeBalkanUniversitiesAssociationImage() {
    }

    @Then("user should see Balkan Universities Association Title: {string} on HomePage")
    public void userShouldSeeBalkanUniversitiesAssociationTitleOnHomePage(String arg0) {
    }

    @Then("user should see Balkan Tubitak image")
    public void userShouldSeeBalkanTubitakImage() {
    }

    @Then("user should see Balkan Tubitak Title: {string} on HomePage")
    public void userShouldSeeBalkanTubitakTitleOnHomePage(String arg0) {
    }

    @Then("user should see Trakya University Bridge to the Future logo")
    public void userShouldSeeTrakyaUniversityBridgeToTheFutureLogo() {
    }

    @Then("user should see Footer Information:{string} on HomePage")
    public void userShouldSeeFooterInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Second Information:{string} on HomePage")
    public void userShouldSeeFooterSecondInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Call logo")
    public void userShouldSeeFooterCallLogo() {
    }

    @Then("user should see Footer Third Information:{string} on HomePage")
    public void userShouldSeeFooterThirdInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Call Second logo")
    public void userShouldSeeFooterCallSecondLogo() {
    }

    @Then("user should see Footer Fourth Information:{string} on HomePage")
    public void userShouldSeeFooterFourthInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fax logo")
    public void userShouldSeeFooterFaxLogo() {
    }

    @Then("user should see Footer Fifth Information:{string}  on HomePage")
    public void userShouldSeeFooterFifthInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Mail logo")
    public void userShouldSeeFooterMailLogo() {
    }

    @Then("user should see Footer Sixth Information:{string} on HomePage")
    public void userShouldSeeFooterSixthInformationOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eighth Information:{string} on HomePage")
    public void userShouldSeeFooterEighthInformationOnHomePage(String arg0) {
    }


    @Then("user should see Footer World logo")
    public void userShouldSeeFooterWorldLogo() {
    }



    @Then("user should see Footer Title:{string} on HomePage")
    public void userShouldSeeFooterTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Second Title:{string} on HomePage")
    public void userShouldSeeFooterSecondTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Third Title:{string} on HomePage")
    public void userShouldSeeFooterThirdTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fifth Title:{string} on HomePage")
    public void userShouldSeeFooterFifthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Sixth Title:{string} on HomePage")
    public void userShouldSeeFooterSixthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Seventh Title:{string} on HomePage")
    public void userShouldSeeFooterSeventhTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eighth Title:{string} on HomePage")
    public void userShouldSeeFooterEighthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Ninth Title:{string} on HomePage")
    public void userShouldSeeFooterNinthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Tenth Title:{string} on HomePage")
    public void userShouldSeeFooterTenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eleventh Title:{string} on HomePage")
    public void userShouldSeeFooterEleventhTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twelfth Title:{string} on HomePage")
    public void userShouldSeeFooterTwelfthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirteenth Title:{string} on HomePage")
    public void userShouldSeeFooterThirteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fourteenth Title:{string} on HomePage")
    public void userShouldSeeFooterFourteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fifteenth Title:{string} on HomePage")
    public void userShouldSeeFooterFifteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Sixteenth Title:{string} on HomePage")
    public void userShouldSeeFooterSixteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Seventeenth Title:{string} on HomePage")
    public void userShouldSeeFooterSeventeenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eighteenth Title:{string} on HomePage")
    public void userShouldSeeFooterEighteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Nineteenth Title:{string} on HomePage")
    public void userShouldSeeFooterNineteenthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twentieth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentiethTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-First Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyFirstTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Second Title:{string} on HomePage")
    public void userShouldSeeFooterTwentySecondTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Third Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyThirdTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Fourth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyFourthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Fifth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyFifthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Sixth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentySixthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Seventh Title:{string} on HomePage")
    public void userShouldSeeFooterTwentySeventhTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Eighth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyEighthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Ninth Title:{string} on HomePage")
    public void userShouldSeeFooterTwentyNinthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirtieth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtiethTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-First Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyFirstTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Second Title:{string} on HomePage")
    public void userShouldSeeFooterThirtySecondTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Third Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyThirdTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Facebook logo")
    public void userShouldSeeFooterFacebookLogo() {
    }

    @Then("user should see Footer X logo")
    public void userShouldSeeFooterXLogo() {
    }

    @Then("user should see Footer Youtube logo")
    public void userShouldSeeFooterYoutubeLogo() {
    }

    @Then("user should see Footer Instagram logo")
    public void userShouldSeeFooterInstagramLogo() {
    }

    @Then("user should see Footer Thirty-Fourth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyFourthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fork Knife logo")
    public void userShouldSeeFooterForkKnifeLogo() {
    }

    @Then("user should see Footer Thirty-Fifth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyFifthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Sixth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtySixthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Seventh Title:{string} on HomePage")
    public void userShouldSeeFooterThirtySeventhTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Eighth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyEighthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Ninth Title:{string} on HomePage")
    public void userShouldSeeFooterThirtyNinthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fortieth Title:{string} on HomePage")
    public void userShouldSeeFooterFortiethTitleOnHomePage(String arg0) {
    }



}
