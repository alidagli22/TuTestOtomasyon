package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import java.security.SecureRandom;


public class HomePage {

    private By Teknokta = By.cssSelector("#menuzord > ul.pull-right.flip > li > a");
    private ElementHelper elementHelper;

    public HomePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void userOnTheHomePage() {
        elementHelper.openUrl("https:www.trakya.edu.tr");
    }

    private By TrakyaUniversityLogo = By.cssSelector("");
    private By NavigationAreaTitle = By.cssSelector("");
    private By NavigationAreaSecondTitle = By.cssSelector("");
    private By NavigationAreaThirdTitle = By.cssSelector("");
    private By NavigationAreaFourthTitle = By.cssSelector("");
    private By NavigationAreaFifthTitle = By.cssSelector("");
    private By NavigationAreaSixthTitle = By.cssSelector("");
    private By NavigationAreaSeventhTitle = By.cssSelector("");
    private By NewsTitleSection = By.cssSelector("");
    private By NewsSecondTitle = By.cssSelector("");
    private By PressTitle = By.cssSelector("");
    private By AnnouncementsTitle = By.cssSelector("");
    private By AnnouncementsSecondTitle = By.cssSelector("");
    private By EventsTitle = By.cssSelector("");
    private By EventsSecondTitle = By.cssSelector("");
    private By NewsFromOtherUniversitiesTitle = By.cssSelector("");
    private By NewsFromOtherUniversitiesSecondTitle = By.cssSelector("");
    private By NumbersOnHome = By.cssSelector("");
    private By SecondNumbers = By.cssSelector("");
    private By ThirdNumbers = By.cssSelector("");
    private By FourthNumbers = By.cssSelector("");
    private By FifthNumbers = By.cssSelector("");
    private By SixthNumbers = By.cssSelector("");
    private By PromotionalPresentationTitle = By.cssSelector("");
    private By PromotionalPresentationVideo = By.cssSelector("");
    private By OurMuseumsTitle = By.cssSelector("");
    private By OurMuseumsVideo = By.cssSelector("");
    private By BalkanReportTitle = By.cssSelector("");
    private By BalkanReportImage = By.cssSelector("");
    private By StudentScholarshipProjectsImage = By.cssSelector("");
    private By StudentScholarshipProjectsTitle = By.cssSelector("");
    private By LibraryImage = By.cssSelector("");
    private By LibraryTitle = By.cssSelector("");
    private By EdirneImage = By.cssSelector("");
    private By EdirneTitle = By.cssSelector("");
    private By MuseumsImage = By.cssSelector("");
    private By MuseumsTitle = By.cssSelector("");
    private By OurConcertsImage = By.cssSelector("");
    private By OurConcertsTitle = By.cssSelector("");
    private By AtaturkCornerImage = By.cssSelector("");
    private By AtaturkCornerTitle = By.cssSelector("");
    private By AcademicJournalsTitle = By.cssSelector("");
    private By AcademicJournalList = By.cssSelector("");
    private By AcademicJournalSecondList = By.cssSelector("");
    private By AcademicJournalThirdList = By.cssSelector("");
    private By AcademicJournalFourthList = By.cssSelector("");
    private By AcademicJournalFifthList = By.cssSelector("");
    private By AcademicJournalSixthList = By.cssSelector("");
    private By AcademicJournalsSeventhTitle = By.cssSelector("");
    private By AcademicJournalEighthList = By.cssSelector("");
    private By AcademicJournalNinthList = By.cssSelector("");
    private By AcademicJournalTenthList = By.cssSelector("");
    private By AcademicJournalEleventhList = By.cssSelector("");
    private By AcademicJournalTwelfthList = By.cssSelector("");
    private By AcademicJournalThirteenthList = By.cssSelector("");
    private By AcademicJournalFourteenthList = By.cssSelector("");
    private By AcademicJournalFifteenthList = By.cssSelector("");
    private By AcademicJournalSixteenthList = By.cssSelector("");
    private By AcademicJournalSeventeenthList = By.cssSelector("");
    private By AcademicJournalEighteenthList = By.cssSelector("");
    private By AcademicJournalNineteenthList = By.cssSelector("");
    private By CommissionsAndBoardsTitle = By.cssSelector("");
    private By UnitsAffiliatedToTheRectorateTitle = By.cssSelector("");
    private By TubaImage = By.cssSelector("");
    private By TubaTitle = By.cssSelector("");
    private By YokImage = By.cssSelector("");
    private By YokTitle = By.cssSelector("");
    private By TubImage = By.cssSelector("");
    private By TubTitle = By.cssSelector("");
    private By IlanImage = By.cssSelector("");
    private By IlanTitle = By.cssSelector("");
    private By BalkanUniversitiesAssociationImage = By.cssSelector("");
    private By BalkanUniversitiesAssociationTitle = By.cssSelector("");
    private By BalkanTubitakImage = By.cssSelector("");
    private By BalkanTubitakTitle = By.cssSelector("");
    private By TrakyaUniversityBridgeToTheFutureLogo = By.cssSelector("");
    private By FooterInformation  = By.cssSelector("");
    private By FooterSecondInformation = By.cssSelector("");
    private By FooterCallLogo = By.cssSelector("");
    private By FooterThirdInformation = By.cssSelector("");
    private By FooterCallSecondLogo = By.cssSelector("");
    private By FooterFourthInformation = By.cssSelector("");
    private By FooterFaxLogo = By.cssSelector("");
    private By FooterFifthInformation = By.cssSelector("");
    private By FooterMailLogo = By.cssSelector("");
    private By FooterSixthInformation = By.cssSelector("");
    private By FooterEighthInformation = By.cssSelector("");
    private By FooterWorldLogo = By.cssSelector("");
    private By FooterTitle = By.cssSelector("");
    private By FooterSecondTitle = By.cssSelector("");
    private By FooterThirdTitle = By.cssSelector("");
    private By FooterFifthTitle = By.cssSelector("");
    private By FooterSixthTitle = By.cssSelector("");
    private By FooterSeventhTitle = By.cssSelector("");
    private By FooterEighthTitle = By.cssSelector("");
    private By FooterNinthTitle = By.cssSelector("");
    private By FooterTenthTitle = By.cssSelector("");
    private By FooterEleventhTitle = By.cssSelector("");
    private By FooterTwelfthTitle = By.cssSelector("");
    private By FooterThirteenthTitle = By.cssSelector("");
    private By FooterFourteenthTitle = By.cssSelector("");
    private By FooterFifteenthTitle = By.cssSelector("");
    private By FooterSixteenthTitle = By.cssSelector("");
    private By FooterSeventeenthTitle = By.cssSelector("");
    private By FooterEighteenthTitle = By.cssSelector("");
    private By FooterNineteenthTitle = By.cssSelector("");
    private By FooterTwentiethTitle = By.cssSelector("");
    private By FooterTwentyFirstTitle = By.cssSelector("");
    private By FooterTwentySecondTitle = By.cssSelector("");
    private By FooterTwentyThirdTitle = By.cssSelector("");
    private By FooterTwentyFourthTitle = By.cssSelector("");
    private By FooterTwentyFifthTitle = By.cssSelector("");
    private By FooterTwentySixthTitle = By.cssSelector("");
    private By FooterTwentySeventhTitle = By.cssSelector("");
    private By FooterTwentyEighthTitle = By.cssSelector("");
    private By FooterTwentyNinthTitle = By.cssSelector("");
    private By FooterThirtiethTitle = By.cssSelector("");
    private By FooterThirtyFirstTitle = By.cssSelector("");
    private By FooterThirtySecondTitle = By.cssSelector("");
    private By FooterThirtyThirdTitle = By.cssSelector("");
    private By FooterFacebookLogo = By.cssSelector("");
    private By FooterXLogo = By.cssSelector("");
    private By FooterYoutubeLogo = By.cssSelector("");
    private By FooterInstagramLogo = By.cssSelector("");
    private By FooterThirtyFourthTitle = By.cssSelector("");
    private By FooterForkKnifeLogo = By.cssSelector("");
    private By FooterThirtyFifthTitle = By.cssSelector("");
    private By FooterThirtySixthTitle = By.cssSelector("");
    private By FooterThirtySeventhTitle = By.cssSelector("");
    private By FooterThirtyEighthTitle = By.cssSelector("");
    private By FooterThirtyNinthTitle = By.cssSelector("");
    private By FooterFortiethTitle = By.cssSelector("");

    public void ShouldSeeTrakyaUniversityLogo() {
        elementHelper.checkElement(TrakyaUniversityLogo);
    }

    public String ShouldSeeNavigationAreaTitle() {
        return elementHelper.getText(NavigationAreaTitle);
    }

    public String ShouldSeeNavigationAreaSecondTitle() {
        return elementHelper.getText(NavigationAreaSecondTitle);
    }

    public String ShouldSeeNavigationAreaThirdTitle() {
        return elementHelper.getText(NavigationAreaThirdTitle);
    }

    public String ShouldSeeNavigationAreaFourthTitle() {
        return elementHelper.getText(NavigationAreaFourthTitle);
    }

    public String ShouldSeeNavigationAreaFifthTitle() {
        return elementHelper.getText(NavigationAreaFifthTitle);
    }

    public String ShouldSeeNavigationAreaSixthTitle() {
        return elementHelper.getText(NavigationAreaSixthTitle);
    }

    public String ShouldSeeNavigationAreaSeventhTitle() {
        return elementHelper.getText(NavigationAreaSeventhTitle);
    }

    public String ShouldSeeNewsTitle() {
        return elementHelper.getText(NewsTitleSection);
    }

    public String ShouldSeeNewsSecondTitle() {
        return elementHelper.getText(NewsSecondTitle);
    }

    public String ShouldSeePressTitle() {
        return elementHelper.getText(PressTitle);
    }

    public String ShouldSeeAnnouncementsTitle() {
        return elementHelper.getText(AnnouncementsTitle);
    }

    public String ShouldSeeAnnouncementsSecondTitle() {
        return elementHelper.getText(AnnouncementsSecondTitle);
    }

    public String ShouldSeeEventsTitle() {
        return elementHelper.getText(EventsTitle);
    }

    public String ShouldSeeEventsSecondTitle() {
        return elementHelper.getText(EventsSecondTitle);
    }

    public String ShouldSeeNewsFromOtherUniversitiesTitle() {
        return elementHelper.getText(NewsFromOtherUniversitiesTitle);
    }

    public String ShouldSeeNewsFromOtherUniversitiesSecondTitle() {
        return elementHelper.getText(NewsFromOtherUniversitiesSecondTitle);
    }

    public String ShouldSeeNumbersOnHome() {
        return elementHelper.getText(NumbersOnHome);
    }

    public String ShouldSeeSecondNumbers() {
        return elementHelper.getText(SecondNumbers);
    }

    public String ShouldSeeThirdNumbers() {
        return elementHelper.getText(ThirdNumbers);
    }

    public String ShouldSeeFourthNumbers() {
        return elementHelper.getText(FourthNumbers);
    }

    public String ShouldSeeFifthNumbers() {
        return elementHelper.getText(FifthNumbers);
    }

    public String ShouldSeeSixthNumbers() {
        return elementHelper.getText(SixthNumbers);
    }

    public String ShouldSeePromotionalPresentationTitle() {
        return elementHelper.getText(PromotionalPresentationTitle);
    }

    public void ShouldSeePromotionalPresentationVideo() {
        elementHelper.checkElement(PromotionalPresentationVideo);
    }

    public String ShouldSeeOurMuseumsTitle() {
        return elementHelper.getText(OurMuseumsTitle);
    }

    public void ShouldSeeOurMuseumsVideo() {
        elementHelper.checkElement(OurMuseumsVideo);
    }

    public String ShouldSeeBalkanReportTitle() {
        return elementHelper.getText(BalkanReportTitle);
    }

    public void ShouldSeeBalkanReportImage() {
        elementHelper.checkElement(BalkanReportImage);
    }

    public void ShouldSeeStudentScholarshipProjectsImage() {
        elementHelper.checkElement(StudentScholarshipProjectsImage);
    }

    public String ShouldSeeStudentScholarshipProjectsTitle() {
        return elementHelper.getText(StudentScholarshipProjectsTitle);
    }

    public void ShouldSeeLibraryImage() {
        elementHelper.checkElement(LibraryImage);
    }

    public String ShouldSeeLibraryTitle() {
        return elementHelper.getText(LibraryTitle);
    }

    public void ShouldSeeEdirneImage() {
        elementHelper.checkElement(EdirneImage);
    }

    public String ShouldSeeEdirneTitle() {
        return elementHelper.getText(EdirneTitle);
    }

    public void ShouldSeeMuseumsImage() {
        elementHelper.checkElement(MuseumsImage);
    }

    public String ShouldSeeMuseumsTitle() {
        return elementHelper.getText(MuseumsTitle);
    }

    public void ShouldSeeOurConcertsImage() {
        elementHelper.checkElement(OurConcertsImage);
    }

    public String ShouldSeeOurConcertsTitle() {
        return elementHelper.getText(OurConcertsTitle);
    }

    public void ShouldSeeAtaturkCornerImage() {
        elementHelper.checkElement(AtaturkCornerImage);
    }

    public String ShouldSeeAtaturkCornerTitle() {
        return elementHelper.getText(AtaturkCornerTitle);
    }

    public String ShouldSeeAcademicJournalsTitle() {
        return elementHelper.getText(AcademicJournalsTitle);
    }

    public String ShouldSeeAcademicJournalList() {
        return elementHelper.getText(AcademicJournalList);
    }

    public String ShouldSeeAcademicJournalSecondList() {
        return elementHelper.getText(AcademicJournalSecondList);
    }

    public String ShouldSeeAcademicJournalThirdList() {
        return elementHelper.getText(AcademicJournalThirdList);
    }

    public String ShouldSeeAcademicJournalFourthList() {
        return elementHelper.getText(AcademicJournalFourthList);
    }

    public String ShouldSeeAcademicJournalFifthList() {
        return elementHelper.getText(AcademicJournalFifthList);
    }

    public String ShouldSeeAcademicJournalSixthList() {
        return elementHelper.getText(AcademicJournalSixthList);
    }

    public String ShouldSeeAcademicJournalsSeventhTitle() {return elementHelper.getText(AcademicJournalsSeventhTitle);
    }
    public String ShouldSeeAcademicJournalEighthList() {
        return elementHelper.getText(AcademicJournalEighthList);
    }

    public String ShouldSeeAcademicJournalNinthList() {
        return elementHelper.getText(AcademicJournalNinthList);
    }


    public String ShouldSeeAcademicJournalTenthList() { return elementHelper.getText(AcademicJournalTenthList); }

    public String ShouldSeeAcademicJournalEleventhList() { return elementHelper.getText(AcademicJournalEleventhList); }

    public String ShouldSeeAcademicJournalTwelfthList() { return elementHelper.getText(AcademicJournalTwelfthList);}

    public String ShouldSeeAcademicJournalThirteenthList() { return elementHelper.getText(AcademicJournalThirteenthList);}

    public String ShouldSeeAcademicJournalFourteenthList() { return elementHelper.getText(AcademicJournalFourteenthList);}

    public String ShouldSeeAcademicJournalFifteenthList() { return elementHelper.getText(AcademicJournalFifteenthList);}

    public String ShouldSeeAcademicJournalSixteenthList() { return elementHelper.getText(AcademicJournalSixteenthList);}

    public String ShouldSeeAcademicJournalSeventeenthList() { return elementHelper.getText(AcademicJournalSeventeenthList);}

    public String ShouldSeeAcademicJournalEighteenthList() { return elementHelper.getText(AcademicJournalEighteenthList);}

    public String ShouldSeeAcademicJournalNineteenthList() { return elementHelper.getText(AcademicJournalNineteenthList);}

    public String ShouldSeeCommissionsAndBoardsTitle() { return elementHelper.getText(CommissionsAndBoardsTitle);}

    public String ShouldSeeUnitsAffiliatedToTheRectorateTitle() { return elementHelper.getText(UnitsAffiliatedToTheRectorateTitle);}

    public void ShouldSeeTubaImage() { elementHelper.checkElement(TubaImage);}

    public String ShouldSeeTubaTitle() { return elementHelper.getText(TubaTitle);}

    public void ShouldSeeYokImage() { elementHelper.checkElement(YokImage);}

    public String ShouldSeeYokTitle() { return elementHelper.getText(YokTitle);}

    public void ShouldSeeTubImage() { elementHelper.checkElement(TubImage);}

    public String ShouldSeeTubTitle() { return elementHelper.getText(TubTitle);}

    public void ShouldSeeIlanImage() { elementHelper.checkElement(IlanImage);}

    public String ShouldSeeIlanTitle() { return elementHelper.getText(IlanTitle);}

    public void ShouldSeeBalkanUniversitiesAssociationImage() { elementHelper.checkElement(BalkanUniversitiesAssociationImage);}

    public String ShouldSeeBalkanUniversitiesAssociationTitle() { return elementHelper.getText(BalkanUniversitiesAssociationTitle);}

    public void ShouldSeeBalkanTubitakImage() { elementHelper.checkElement(BalkanTubitakImage);}

    public String ShouldSeeBalkanTubitakTitle() { return elementHelper.getText(BalkanTubitakTitle);}

    public void ShouldSeeTrakyaUniversityBridgeToTheFutureLogo() { elementHelper.checkElement(TrakyaUniversityBridgeToTheFutureLogo);}

    public String ShouldSeeFooterInformation() { return  elementHelper.getText(FooterInformation);}

    public String ShouldSeeFooterSecondInformation() { return elementHelper.getText(FooterSecondInformation);}

    public void ShouldSeeFooterCallLogo() { elementHelper.checkElement(FooterCallLogo);}

    public String ShouldSeeFooterThirdInformation() { return elementHelper.getText(FooterThirdInformation);}

    public void ShouldSeeFooterCallSecondLogo() { elementHelper.checkElement(FooterCallSecondLogo);}

    public String ShouldSeeFooterFourthInformation() { return elementHelper.getText(FooterFourthInformation);}

    public void ShouldSeeFooterFaxLogo() { elementHelper.checkElement(FooterFaxLogo);}

    public String ShouldSeeFooterFifthInformation() { return elementHelper.getText(FooterFifthInformation);}

    public void ShouldSeeFooterMailLogo() { elementHelper.checkElement(FooterMailLogo);}

    public String ShouldSeeFooterSixthInformation() { return elementHelper.getText(FooterSixthInformation);}

    public String ShouldSeeFooterEighthInformation() { return elementHelper.getText(FooterEighthInformation);}

    public void ShouldSeeFooterWorldLogo() { elementHelper.checkElement(FooterWorldLogo);}

    public String ShouldSeeFooterTitle() { return elementHelper.getText(FooterTitle);}

    public String ShouldSeeFooterSecondTitle() { return elementHelper.getText(FooterSecondTitle);}

    public String ShouldSeeFooterThirdTitle() { return elementHelper.getText(FooterThirdTitle);}

    public String ShouldSeeFooterFifthTitle() { return elementHelper.getText(FooterFifthTitle);}

    public String ShouldSeeFooterSixthTitle() { return elementHelper.getText(FooterSixthTitle);}

    public String ShouldSeeFooterSeventhTitle() { return elementHelper.getText(FooterSeventhTitle);}

    public String ShouldSeeFooterEighthTitle() { return elementHelper.getText(FooterEighthTitle);}

    public String ShouldSeeFooterNinthTitle() { return elementHelper.getText(FooterNinthTitle);}

    public String ShouldSeeFooterTenthTitle() { return elementHelper.getText(FooterTenthTitle);
    }

    public String ShouldSeeFooterEleventhTitle() { return elementHelper.getText(FooterEleventhTitle);}

    public String ShouldSeeFooterTwelfthTitle() { return elementHelper.getText(FooterTwelfthTitle);}

    public String ShouldSeeFooterThirteenthTitle() { return elementHelper.getText(FooterThirteenthTitle);}

    public String ShouldSeeFooterFourteenthTitle() { return elementHelper.getText(FooterFourteenthTitle);}

    public String ShouldSeeFooterFifteenthTitle() { return elementHelper.getText(FooterFifteenthTitle);}

    public String ShouldSeeFooterSixteenthTitle() { return elementHelper.getText(FooterSixteenthTitle);}

    public String ShouldSeeFooterSeventeenthTitle() { return elementHelper.getText(FooterSeventeenthTitle);}

    public String ShouldSeeFooterEighteenthTitle() { return elementHelper.getText(FooterEighteenthTitle);}

    public String ShouldSeeFooterNineteenthTitle() { return elementHelper.getText(FooterNineteenthTitle);}

    public String ShouldSeeFooterTwentiethTitle() { return elementHelper.getText(FooterTwentiethTitle);}

    public String ShouldSeeFooterTwentyFirstTitle() { return elementHelper.getText(FooterTwentyFirstTitle);}

    public String ShouldSeeFooterTwentySecondTitle() { return elementHelper.getText(FooterTwentySecondTitle);}

    public String ShouldSeeFooterTwentyThirdTitle() { return  elementHelper.getText(FooterTwentyThirdTitle);}

    public String ShouldSeeFooterTwentyFourthTitle() { return elementHelper.getText(FooterTwentyFourthTitle);}

    public String ShouldSeeFooterTwentyFifthTitle() { return elementHelper.getText(FooterTwentyFifthTitle);}

    public String ShouldSeeFooterTwentySixthTitle() { return elementHelper.getText(FooterTwentySixthTitle);}

    public String ShouldSeeFooterTwentySeventhTitle() { return elementHelper.getText(FooterTwentySeventhTitle);}

    public String ShouldSeeFooterTwentyEighthTitle() { return elementHelper.getText(FooterTwentyEighthTitle);}

    public String ShouldSeeFooterTwentyNinthTitle() { return elementHelper.getText(FooterTwentyNinthTitle);}

    public String ShouldSeeFooterThirtiethTitle() { return elementHelper.getText(FooterThirtiethTitle);}

    public String ShouldSeeFooterThirtyFirstTitle() { return elementHelper.getText(FooterThirtyFirstTitle);}

    public String ShouldSeeFooterThirtySecondTitle() { return elementHelper.getText(FooterThirtySecondTitle);}

    public String ShouldSeeFooterThirtyThirdTitle() { return elementHelper.getText(FooterThirtyThirdTitle);}

    public void ShouldSeeFooterFacebookLogo() { elementHelper.checkElement(FooterFacebookLogo);}

    public void ShouldSeeFooterXLogo() { elementHelper.checkElement(FooterXLogo);}

    public void ShouldSeeFooterYoutubeLogo() { elementHelper.checkElement(FooterYoutubeLogo);}

    public void ShouldSeeFooterInstagramLogo() { elementHelper.checkElement(FooterInstagramLogo);}

    public String ShouldSeeFooterThirtyFourthTitle() {return elementHelper.getText(FooterThirtyFourthTitle);}

    public void ShouldSeeFooterForkKnifeLogo() { elementHelper.checkElement(FooterForkKnifeLogo);}

    public String ShouldSeeFooterThirtyFifthTitle() { return elementHelper.getText(FooterThirtyFifthTitle);}

    public String ShouldSeeFooterThirtySixthTitle() { return elementHelper.getText(FooterThirtySixthTitle);}

    public String ShouldSeeFooterThirtySeventhTitle() { return elementHelper.getText(FooterThirtySeventhTitle);}

    public String ShouldSeeFooterThirtyEighthTitle() { return elementHelper.getText(FooterThirtyEighthTitle);}

    public String ShouldSeeFooterThirtyNinthTitle() { return elementHelper.getText(FooterThirtyNinthTitle);}

    public String ShouldSeeFooterFortiethTitle() { return elementHelper.getText(FooterFortiethTitle);}
}
