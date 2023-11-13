package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverFactory;

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
    public void userShouldSeeNavigationAreaThirdTitleOnHomePage(String arg0) {
    }

    @Then("user should see Navigation Area Fourth Title : {string} on HomePage")
    public void userShouldSeeNavigationAreaFourthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Navigation Area Fifth Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaFifthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Navigation Area Sixth Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaSixthTitleOnHomePage(String arg0) {
    }

    @Then("user should see Navigation Area Seventh Title: {string} on HomePage")
    public void userShouldSeeNavigationAreaSeventhTitleOnHomePage(String arg0) {
    }

    @Then("user should see News Title: {string} section on HomePage")
    public void userShouldSeeNewsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see News Second Title: {string} section on HomePage")
    public void userShouldSeeNewsSecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Press Title: {string} section on HomePage")
    public void userShouldSeePressTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Announcements Title: {string} section on HomePage")
    public void userShouldSeeAnnouncementsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Announcements Second Title: {string} section on HomePage")
    public void userShouldSeeAnnouncementsSecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Events Title: {string} section on HomePage")
    public void userShouldSeeEventsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Events Second Title: {string} section on HomePage")
    public void userShouldSeeEventsSecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see News from Other Universities Title: {string} section on HomePage")
    public void userShouldSeeNewsFromOtherUniversitiesTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see News from Other Universities Second Title: {string} section on HomePage")
    public void userShouldSeeNewsFromOtherUniversitiesSecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see numbers: {string} section on HomePage")
    public void userShouldSeeNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Second Numbers: {string} section on HomePage")
    public void userShouldSeeSecondNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Third Numbers: {string} section on HomePage")
    public void userShouldSeeThirdNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Fourth Numbers: {string} section on HomePage")
    public void userShouldSeeFourthNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Fifth Numbers: {string} section on HomePage")
    public void userShouldSeeFifthNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Sixth Numbers: {string} section on HomePage")
    public void userShouldSeeSixthNumbersSectionOnHomePage(String arg0) {
    }

    @Then("user should see Promotional Presentation Title: {string} section on HomePage")
    public void userShouldSeePromotionalPresentationTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Promotional Presentation  video")
    public void userShouldSeePromotionalPresentationVideo() {
    }

    @Then("user should see Our Museums Title: {string} section on HomePage")
    public void userShouldSeeOurMuseumsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Our Museums video")
    public void userShouldSeeOurMuseumsVideo() {
    }

    @Then("user should see Balkan Report Title: {string} section on HomePage")
    public void userShouldSeeBalkanReportTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Balkan Report image")
    public void userShouldSeeBalkanReportImage() {
    }

    @Then("user should see Student Scholarship Projects image")
    public void userShouldSeeStudentScholarshipProjectsImage() {
    }

    @Then("user should see Student Scholarship Projects Title: {string} section on HomePage")
    public void userShouldSeeStudentScholarshipProjectsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Library image")
    public void userShouldSeeLibraryImage() {
    }

    @Then("user should see Library Title: {string} section on HomePage")
    public void userShouldSeeLibraryTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Edirne image")
    public void userShouldSeeEdirneImage() {
    }

    @Then("user should see Edirne Title: {string} section on HomePage")
    public void userShouldSeeEdirneTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Museums image")
    public void userShouldSeeMuseumsImage() {
    }

    @Then("user should see Museums Title: {string} section on HomePage")
    public void userShouldSeeMuseumsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Our Concerts image")
    public void userShouldSeeOurConcertsImage() {
    }

    @Then("user should see Our Concerts Title: {string} section on HomePage")
    public void userShouldSeeOurConcertsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Ataturk Corner image")
    public void userShouldSeeAtaturkCornerImage() {
    }

    @Then("user should see Ataturk Corner Title: {string} section on HomePage")
    public void userShouldSeeAtaturkCornerTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journals Title: {string} section on HomePage")
    public void userShouldSeeAcademicJournalsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Second list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalSecondListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Third list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalThirdListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fourth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalFourthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fifth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalFifthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Sixth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalSixthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journals Seventh Title: {string} section on HomePage")
    public void userShouldSeeAcademicJournalsSeventhTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Eighth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalEighthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Ninth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalNinthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Tenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalTenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Eleventh list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalEleventhListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Twelfth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalTwelfthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Thirteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalThirteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fourteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalFourteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Fifteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalFifteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Sixteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalSixteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Seventeenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalSeventeenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Eighteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalEighteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Academic Journal Nineteenth list: {string} section on HomePage")
    public void userShouldSeeAcademicJournalNineteenthListSectionOnHomePage(String arg0) {
    }

    @Then("user should see Commissions and Boards Title: {string} section on HomePage")
    public void userShouldSeeCommissionsAndBoardsTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Units Affiliated to the Rectorate Title: {string} section on HomePage")
    public void userShouldSeeUnitsAffiliatedToTheRectorateTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Tuba image")
    public void userShouldSeeTubaImage() {
    }

    @Then("user should see Tuba Title: {string} section on HomePage")
    public void userShouldSeeTubaTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Yok image")
    public void userShouldSeeYokImage() {
    }

    @Then("user should see Yok Title: {string} section on HomePage")
    public void userShouldSeeYokTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Tub image")
    public void userShouldSeeTubImage() {
    }

    @Then("user should see Tub Title: {string} section on HomePage")
    public void userShouldSeeTubTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Ilan image")
    public void userShouldSeeIlanImage() {
    }

    @Then("user should see Ilan Title: {string} section on HomePage")
    public void userShouldSeeIlanTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Balkan Universities Association image")
    public void userShouldSeeBalkanUniversitiesAssociationImage() {
    }

    @Then("user should see Balkan Universities Association Title: {string} section on HomePage")
    public void userShouldSeeBalkanUniversitiesAssociationTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Balkan Tubitak image")
    public void userShouldSeeBalkanTubitakImage() {
    }

    @Then("user should see Balkan Tubitak Title: {string} section on HomePage")
    public void userShouldSeeBalkanTubitakTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Trakya University Bridge to the Future logo")
    public void userShouldSeeTrakyaUniversityBridgeToTheFutureLogo() {
    }

    @Then("user should see Footer Information:{string} section on HomePage")
    public void userShouldSeeFooterInformationSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Second Information:{string} section on HomePage")
    public void userShouldSeeFooterSecondInformationSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Call logo")
    public void userShouldSeeFooterCallLogo() {
    }

    @Then("user should see Footer Third Information:{string} section on HomePage")
    public void userShouldSeeFooterThirdInformationSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Call Second logo")
    public void userShouldSeeFooterCallSecondLogo() {
    }

    @Then("user should see Footer Fax logo")
    public void userShouldSeeFooterFaxLogo() {
    }

    @Then("user should see Footer Fourth Information:{string} section on HomePage")
    public void userShouldSeeFooterFourthInformationSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Mail logo")
    public void userShouldSeeFooterMailLogo() {
    }

    @Then("user should see Footer World logo")
    public void userShouldSeeFooterWorldLogo() {
    }

    @Then("user should see Footer Fifth Information:{string} section on HomePage")
    public void userShouldSeeFooterFifthInformationSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Title:{string} section on HomePage")
    public void userShouldSeeFooterTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Second Title:{string} section on HomePage")
    public void userShouldSeeFooterSecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Third Title:{string} section on HomePage")
    public void userShouldSeeFooterThirdTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fifth Title:{string} section on HomePage")
    public void userShouldSeeFooterFifthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Sixth Title:{string} section on HomePage")
    public void userShouldSeeFooterSixthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Seventh Title:{string} section on HomePage")
    public void userShouldSeeFooterSeventhTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eighth Title:{string} section on HomePage")
    public void userShouldSeeFooterEighthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Ninth Title:{string} section on HomePage")
    public void userShouldSeeFooterNinthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Tenth Title:{string} section on HomePage")
    public void userShouldSeeFooterTenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eleventh Title:{string} section on HomePage")
    public void userShouldSeeFooterEleventhTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twelfth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwelfthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fourteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterFourteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fifteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterFifteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Sixteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterSixteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Seventeenth Title:{string} section on HomePage")
    public void userShouldSeeFooterSeventeenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Eighteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterEighteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Nineteenth Title:{string} section on HomePage")
    public void userShouldSeeFooterNineteenthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twentieth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentiethTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-First Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyFirstTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Second Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentySecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Third Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyThirdTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Fourth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyFourthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Fifth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyFifthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Sixth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentySixthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Seventh Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentySeventhTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Eighth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyEighthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Twenty-Ninth Title:{string} section on HomePage")
    public void userShouldSeeFooterTwentyNinthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirtieth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtiethTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-First Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyFirstTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Second Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtySecondTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Third Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyThirdTitleSectionOnHomePage(String arg0) {
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

    @Then("user should see Footer Thirty-Fourth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyFourthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fork Knife logo")
    public void userShouldSeeFooterForkKnifeLogo() {
    }

    @Then("user should see Footer Thirty-Fifth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyFifthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Sixth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtySixthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Seventh Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtySeventhTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Eighth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyEighthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Thirty-Ninth Title:{string} section on HomePage")
    public void userShouldSeeFooterThirtyNinthTitleSectionOnHomePage(String arg0) {
    }

    @Then("user should see Footer Fortieth Title:{string} section on HomePage")
    public void userShouldSeeFooterFortiethTitleSectionOnHomePage(String arg0) {
    }
}
