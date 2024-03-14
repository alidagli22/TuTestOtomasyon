package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class MisyonVizyonPage {
    private ElementHelper elementHelper;

    public MisyonVizyonPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By MisyonTitle = By.cssSelector("#wrapper > div > section:nth-child(2) > div > div > div > div > span:nth-child(1)");
    private By VizyonTitle = By.cssSelector("#wrapper > div > section:nth-child(2) > div > div > div > div > span:nth-child(6)");
    public void userOnTheMisyonVizyonPage(){
        elementHelper.openUrl("https://www.trakya.edu.tr/misyon-ve-vizyon");
    }
    public String userShouldSeeMisyonTitle(){
        return elementHelper.getText(MisyonTitle);
    }
    public String userShouldSeeVizyonTitle(){
        return elementHelper.getText(VizyonTitle);
    }





}
