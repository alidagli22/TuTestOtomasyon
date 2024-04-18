package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BalkanKngreMrkziPage {
    private ElementHelper elementHelper;

    public BalkanKngreMrkziPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private By BalkanKngreMrkzi= By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");
    private By BalkanKngreMerkezititle= By.cssSelector("#wrapper > div > section.inner-header.pt-30.bg-lighter > div > div > div:nth-child(1) > div > h2");
    public void userOnTheBalkanKongreMerkeziPage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/balkan-kongre-merkezi");

        }
        public String userShouldSeeBalkanKongreMerkeziTitleOnBalkanKongreMerkeziPage(){
        return elementHelper.getText(BalkanKngreMrkzi);
        }
    }

