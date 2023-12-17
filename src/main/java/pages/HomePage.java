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
        elementHelper.openUrl("https://www.trakya.edu.tr/");
    }

    private By TrakyaUniversityLogo = By.cssSelector("[alt='Trakya Üniversitesi']");
    private By NavigationAreaTitle = By.cssSelector("#navbar > li:nth-of-type(1) > [href='javascript:void(0);']");
    private By NavigationAreaSecondTitle = By.cssSelector("#navbar > li:nth-of-type(2) > [href='javascript:void(0);']");
    private By NavigationAreaThirdTitle = By.cssSelector("#navbar > li:nth-of-type(3) > [href='javascript:void(0);']");
    private By NavigationAreaFourthTitle = By.cssSelector("#navbar > li:nth-of-type(4) > [href='javascript:void(0);']");
    private By NavigationAreaFifthTitle = By.cssSelector("[href='https://e-egitim.trakya.edu.tr/']");
    private By NavigationAreaSixthTitle = By.cssSelector("#navbar > li:nth-of-type(6) > [href='javascript:void(0);']");
    private By NavigationAreaSeventhTitle = By.cssSelector(".bg-theme-color-2 > .hidden-sm");
    private By NewsTitleSection = By.cssSelector("#haberler.row > div:nth-of-type(1) span");
    private By NewsSecondTitle = By.cssSelector(".ml-10[href='/tum-haberler']");
    private By PressTitle = By.cssSelector("[href='/basinda-universitemiz']");
    private By AnnouncementsTitle = By.cssSelector("#duyurular > .widget-title > span");
    private By AnnouncementsSecondTitle = By.cssSelector(".ml-10[href='/tum-duyurular']");
    private By EventsTitle = By.cssSelector("#etkinlikler span");
    private By EventsSecondTitle = By.cssSelector(".ml-10[href='/tum-etkinlikler']");
    private By NewsFromOtherUniversitiesTitle = By.cssSelector("#diger span");
    private By NewsFromOtherUniversitiesSecondTitle = By.cssSelector("[href='/diger-haberler']");
    private By NumbersOnHome = By.cssSelector("#funfacts > .row > div:nth-of-type(1) .text-uppercase");
    private By SecondNumbers = By.cssSelector("#funfacts div:nth-of-type(2) .text-uppercase");
    private By ThirdNumbers = By.cssSelector("#funfacts div:nth-of-type(3) .text-uppercase");
    private By FourthNumbers = By.cssSelector("#funfacts div:nth-of-type(4) .text-uppercase");
    private By FifthNumbers = By.cssSelector("#funfacts div:nth-of-type(5) .text-uppercase");
    private By SixthNumbers = By.cssSelector("#funfacts div:nth-of-type(6) .text-uppercase");
    private By PromotionalPresentationTitle = By.cssSelector(".mb-10.col-md-12 > div:nth-of-type(2) span");
    private By PromotionalPresentationVideo = By.cssSelector("[alt='Tanıtım Sunumu']");
    private By OurMuseumsTitle = By.cssSelector(".mb-10.col-md-12 > div:nth-of-type(3) span");
    private By OurMuseumsVideo = By.cssSelector("[src='/images/muze.jpg']");
    private By BalkanReportTitle = By.cssSelector(".text-center.widget-title > span");
    private By BalkanReportImage = By.cssSelector("[alt='Balkan Raporu']");
    private By StudentScholarshipProjectsImage = By.cssSelector("#grid .thumb [href='/rektorumuzun-ogrenci-burs-projeleri-hakkindaki-aciklamalari']");
    private By StudentScholarshipProjectsTitle = By.cssSelector(".ml-m15px");
    private By LibraryImage = By.cssSelector("#grid .thumb [href='https://kutuphane.trakya.edu.tr/']");
    private By LibraryTitle = By.cssSelector("#grid [href='https://kutuphane.trakya.edu.tr/'] .title");
    private By EdirneImage = By.cssSelector("#grid .thumb [href='/edirne-tanitimi']");
    private By EdirneTitle = By.cssSelector("#grid [href='/edirne-tanitimi'] .title");
    private By MuseumsImage = By.cssSelector("#grid .thumb [href='https://muzelerimiz.trakya.edu.tr/']");
    private By MuseumsTitle = By.cssSelector("#grid [href='https://muzelerimiz.trakya.edu.tr/'] .title");
    private By OurConcertsImage = By.cssSelector("#grid .thumb [href='/home/tumkonserler']");
    private By OurConcertsTitle = By.cssSelector("#grid [href='/home/tumkonserler'] .title");
    private By AtaturkCornerImage = By.cssSelector("#grid .thumb [href='/ataturk-kosesi']");
    private By AtaturkCornerTitle = By.cssSelector("#grid [href='/ataturk-kosesi'] .title");
    private By AcademicJournalsTitle = By.cssSelector("[href='#tabHome1']");
    private By CommissionsAndBoardsTitle = By.cssSelector("[href='#tabHome2']");
    private By UnitsAffiliatedToTheRectorateTitle = By.cssSelector("[href='#tabHome3']");
    private By TubaImage = By.cssSelector(".owl-stage > div:nth-of-type(10) [src='/files/anasayfa_dis_baglantilar/tuba.png']");
    private By YokImage = By.cssSelector(".owl-stage > div:nth-of-type(9) [src='/files/anasayfa_dis_baglantilar/osym.png']");
    private By TubImage = By.cssSelector(".owl-stage > div:nth-of-type(7) [src='/files/anasayfa_dis_baglantilar/tubitak.png']");
    private By IlanImage = By.cssSelector(".owl-stage > div:nth-of-type(8) [src='/files/anasayfa_dis_baglantilar/teknopark.png']");
    private By BalkanUniversitiesAssociationImage = By.cssSelector("[src='/images/white.png']");
    private By BalkanUniversitiesAssociationTitle = By.cssSelector(".col-md-3.col-sm-12 p");
    private By BalkanTubitakImage = By.cssSelector(".col-md-3.col-sm-12 p");
    private By BalkanTubitakTitle = By.cssSelector(".owl-stage > div:nth-of-type(7) span");
    private By TrakyaUniversityBridgeToTheFutureLogo = By.cssSelector("[src='/images/white.png']");
    private By FooterInformation  = By.cssSelector(".col-md-3.col-sm-12 p");
    private By FooterSecondInformation = By.cssSelector(".col-md-3.col-sm-12 p");
    private By FooterCallLogo = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(1) > .fa");
    private By FooterThirdInformation = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(1)");
    private By FooterCallSecondLogo = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(2) > .fa");
    private By FooterFourthInformation = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(2)");
    private By FooterFaxLogo = By.cssSelector(".fa-print");
    private By FooterFifthInformation = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(3)");
    private By FooterMailLogo = By.cssSelector(".fa-envelope-o");
    private By FooterSixthInformation = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(4)");
    private By FooterEighthInformation = By.cssSelector(".col-md-3.col-sm-12 li:nth-of-type(5)");
    private By FooterWorldLogo = By.cssSelector(".fa-globe");
    private By FooterTitle = By.cssSelector(".border-bottom > div:nth-of-type(2) .widget-title");
    private By FooterSecondTitle = By.cssSelector("[href='https://abs.trakya.edu.tr/']");
    private By FooterThirdTitle = By.cssSelector("[href='https://akademiktesvik.trakya.edu.tr/']");
    private By FooterFifthTitle = By.cssSelector("[href='https://yoksis.yok.gov.tr/']");
    private By FooterSixthTitle = By.cssSelector("[href='https://oyp.trakya.edu.tr/']");
    private By FooterSeventhTitle = By.cssSelector("[href='https://bap.trakya.edu.tr']");
    private By FooterEighthTitle = By.cssSelector("[href='https://ekders.trakya.edu.tr/']");
    private By FooterNinthTitle = By.cssSelector("[href='https://bologna.trakya.edu.tr/']");
    private By FooterTenthTitle = By.cssSelector("[href='https://eduroam.trakya.edu.tr/']");
    private By FooterEleventhTitle = By.cssSelector("[href='https://disiliskiler.trakya.edu.tr/']");
    private By FooterTwelfthTitle = By.cssSelector(".border-bottom [href='https://kalite.trakya.edu.tr/']");
    private By FooterThirteenthTitle = By.cssSelector("[href='https://yokak.gov.tr/']");
    private By FooterFourteenthTitle = By.cssSelector(".border-bottom [href='https://donersermaye.trakya.edu.tr/']");
    private By FooterFifteenthTitle = By.cssSelector(".border-bottom [href='https://basin.trakya.edu.tr/']");
    private By FooterSixteenthTitle = By.cssSelector("[href='https://engelsiz.trakya.edu.tr']");
    private By FooterSeventeenthTitle = By.cssSelector("[href='https://bagimsizhayat.trakya.edu.tr']");
    private By FooterEighteenthTitle = By.cssSelector("[href='https://vakif.trakya.edu.tr/']");
    private By FooterNineteenthTitle = By.cssSelector("[href='https://balkanarboretumu.trakya.edu.tr/']");
    private By FooterTwentiethTitle = By.cssSelector("[href='https://herbaryum.trakya.edu.tr']");
    private By FooterTwentyFirstTitle = By.cssSelector("[href='https://yesil.trakya.edu.tr'] span");
    private By FooterTwentySecondTitle = By.cssSelector("[href='https://edirnekirmizisi.trakya.edu.tr'] span");
    private By FooterTwentyThirdTitle = By.cssSelector("[href='https://merkezlab.trakya.edu.tr'] span");
    private By FooterTwentyFourthTitle = By.cssSelector("[href='https://mezun.trakya.edu.tr/']");
    private By FooterTwentyFifthTitle = By.cssSelector("[href='https://kovkom.trakya.edu.tr']");
    private By FooterTwentySixthTitle = By.cssSelector("[href='https://covid.trakya.edu.tr']");
    private By FooterTwentySeventhTitle = By.cssSelector("[href='https://kvk.trakya.edu.tr/']");
    private By FooterTwentyEighthTitle = By.cssSelector("[href='https://kutuphane.trakya.edu.tr/pages/trakya-universitesi-yayinlari-satisi#.WvFOi4iFOUk']");
    private By FooterTwentyNinthTitle = By.cssSelector("[href='https://genelsekreterlik.trakya.edu.tr/pages/bilgi-edinme']");
    private By FooterThirtiethTitle = By.cssSelector("[href='https://www.cimer.gov.tr/']");
    private By FooterThirtyFirstTitle = By.cssSelector("[href='https://dilekoneri.trakya.edu.tr/']");
    private By FooterThirtySecondTitle = By.cssSelector(".mt-30.row > .col-md-2 .widget-title");
    private By FooterThirtyThirdTitle = By.cssSelector(".mt-30.row > .col-md-3 .widget-title");
    private By FooterFacebookLogo = By.cssSelector(".fa-facebook");
    private By FooterXLogo = By.cssSelector(".fa-x-twitter");
    private By FooterYoutubeLogo = By.cssSelector(".fa-youtube");
    private By FooterInstagramLogo = By.cssSelector(".fa-instagram");
    private By FooterThirtyFourthTitle = By.cssSelector(".col-md-7 .widget-title");
    private By FooterForkKnifeLogo = By.cssSelector(".fa-lg");
    private By FooterThirtyFifthTitle = By.cssSelector(".text-black-777");
    private By FooterThirtySixthTitle = By.cssSelector("[href='https://bidb.trakya.edu.tr']");
    private By FooterThirtySeventhTitle = By.cssSelector(".text-black-777");
    private By FooterThirtyEighthTitle = By.cssSelector(".sm-text-center.list-inline [href='https://basin.trakya.edu.tr/']");
    private By FooterThirtyNinthTitle = By.cssSelector("[href='https://www.trakya.edu.tr/erehber/']");
    private By FooterFortiethTitle = By.cssSelector("[href='https://goo.gl/maps/RWR7FkoTYXXwYNfA6']");

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



    public String ShouldSeeCommissionsAndBoardsTitle() { return elementHelper.getText(CommissionsAndBoardsTitle);}

    public String ShouldSeeUnitsAffiliatedToTheRectorateTitle() { return elementHelper.getText(UnitsAffiliatedToTheRectorateTitle);}

    public void ShouldSeeTubaImage() { elementHelper.checkElement(TubaImage);}

    public void ShouldSeeYokImage() { elementHelper.checkElement(YokImage);}

    public void ShouldSeeTubImage() { elementHelper.checkElement(TubImage);}

    public void ShouldSeeIlanImage() { elementHelper.checkElement(IlanImage);}

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
