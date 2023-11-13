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
    public void userOnTheHomePage(){
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
    private By StudentScholarshipProjectsTitle = By .cssSelector("");
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

    public void ShouldSeeTrakyaUniversityLogo(){
        elementHelper.checkElement(TrakyaUniversityLogo);
    }
    public String ShouldSeeNavigationAreaTitle(){
       return elementHelper.getText(NavigationAreaTitle);
    }
    public String ShouldSeeNavigationAreaSecondTitle() {
        return elementHelper.getText(NavigationAreaSecondTitle);
    }
    public String ShouldSeeNavigationAreaThirdTitle(){
        return elementHelper.getText(NavigationAreaThirdTitle);
    }
    public String ShouldSeeNavigationAreaFourthTitle(){
        return elementHelper.getText(NavigationAreaFourthTitle);
    }
    public String ShouldSeeNavigationAreaFifthTitle(){
        return elementHelper.getText(NavigationAreaFifthTitle);
    }
    public String ShouldSeeNavigationAreaSixthTitle(){
        return elementHelper.getText(NavigationAreaSixthTitle);
    }
    public String ShouldSeeNavigationAreaSeventhTitle(){
        return elementHelper.getText(NavigationAreaSeventhTitle);
    }
    public String ShouldSeeNewsTitle(){
        return elementHelper.getText(NewsTitleSection);
    }
    public String ShouldSeeNewsSecondTitle(){
        return elementHelper.getText(NewsSecondTitle);
    }
    public String ShouldSeePressTitle(){
        return elementHelper.getText(PressTitle);
    }
    public String ShouldSeeAnnouncementsTitle(){
        return elementHelper.getText(AnnouncementsTitle);
    }
    public String ShouldSeeAnnouncementsSecondTitle(){
        return elementHelper.getText(AnnouncementsSecondTitle);
    }
    public String ShouldSeeEventsTitle(){
        return elementHelper.getText(EventsTitle);
    }
    public String ShouldSeeEventsSecondTitle(){
        return elementHelper.getText(EventsSecondTitle);
    }
    public String ShouldSeeNewsFromOtherUniversitiesTitle(){
        return elementHelper.getText(NewsFromOtherUniversitiesTitle);
    }
    public String ShouldSeeNewsFromOtherUniversitiesSecondTitle(){
        return elementHelper.getText(NewsFromOtherUniversitiesSecondTitle);
    }
    public String ShouldSeeNumbersOnHome(){
        return elementHelper.getText(NumbersOnHome);
    }
    public String ShouldSeeSecondNumbers(){
        return elementHelper.getText(SecondNumbers);
    }
    public String ShouldSeeThirdNumbers(){
        return elementHelper.getText(ThirdNumbers);
    }
    public String ShouldSeeFourthNumbers(){
        return elementHelper.getText(FourthNumbers);
    }
    public String ShouldSeeFifthNumbers(){
        return elementHelper.getText(FifthNumbers);
    }
    public String ShouldSeeSixthNumbers(){
        return elementHelper.getText(SixthNumbers);
    }
    public String ShouldSeePromotionalPresentationTitle(){
        return elementHelper.getText(PromotionalPresentationTitle);
    }
    public void ShouldSeePromotionalPresentationVideo(){
        elementHelper.checkElement(PromotionalPresentationVideo);
    }
    public String ShouldSeeOurMuseumsTitle(){
        return elementHelper.getText(OurMuseumsTitle);
    }
    public void ShouldSeeOurMuseumsVideo(){
        elementHelper.checkElement(OurMuseumsVideo);
    }
    public String ShouldSeeBalkanReportTitle(){
        return elementHelper.getText(BalkanReportTitle);
    }
    public void ShouldSeeBalkanReportImage(){
        elementHelper.checkElement(BalkanReportImage);
    }
    public void ShouldSeeStudentScholarshipProjectsImage(){
        elementHelper.checkElement(StudentScholarshipProjectsImage);
    }
    public String ShouldSeeStudentScholarshipProjectsTitle(){
        return elementHelper.getText(StudentScholarshipProjectsTitle);
    }
    public void ShouldSeeLibraryImage(){
        elementHelper.checkElement(LibraryImage);
    }
    public String ShouldSeeLibraryTitle(){
        return elementHelper.getText(LibraryTitle);
    }
    public void ShouldSeeEdirneImage(){
        elementHelper.checkElement(EdirneImage);
    }
    public String ShouldSeeEdirneTitle(){
        return elementHelper.getText(EdirneTitle);
    }
    public void ShouldSeeMuseumsImage(){
        elementHelper.checkElement(MuseumsImage);
    }
    public String ShouldSeeMuseumsTitle(){
        return elementHelper.getText(MuseumsTitle);
    }
    public void ShouldSeeOurConcertsImage(){
        elementHelper.checkElement(OurConcertsImage);
    }
    public String ShouldSeeOurConcertsTitle(){
        return elementHelper.getText(OurConcertsTitle);
    }
    public void ShouldSeeAtaturkCornerImage(){
        elementHelper.checkElement(AtaturkCornerImage);
    }
    public String ShouldSeeAtaturkCornerTitle(){
        return elementHelper.getText(AtaturkCornerTitle);
    }
    public String ShouldSeeAcademicJournalsTitle(){
        return elementHelper.getText(AcademicJournalsTitle);
    }
    public String ShouldSeeAcademicJournalList(){
        return elementHelper.getText(AcademicJournalList);
    }
    public String ShouldSeeAcademicJournalSecondList(){
        return elementHelper.getText(AcademicJournalSecondList);
    }
    public String ShouldSeeAcademicJournalThirdList(){
        return elementHelper.getText(AcademicJournalThirdList);
    }
    public String ShouldSeeAcademicJournalFourthList(){
        return elementHelper.getText(AcademicJournalFourthList);
    }
    public String ShouldSeeAcademicJournalFifthList(){
        return elementHelper.getText(AcademicJournalFifthList);
    }
    public String ShouldSeeAcademicJournalSixthList(){
        return elementHelper.getText(AcademicJournalSixthList);
    }
    public String ShouldSeeAcademicJournalsSeventhTitle(){
        return elementHelper.getText(AcademicJournalsSeventhTitle);
    }
    public String ShouldSeeAcademicJournalEighthList(){
        return elementHelper.getText(AcademicJournalEighthList);
    }
    public String ShouldSeeAcademicJournalNinthList(){
        return  elementHelper.getText(AcademicJournalNinthList);
    }





}
