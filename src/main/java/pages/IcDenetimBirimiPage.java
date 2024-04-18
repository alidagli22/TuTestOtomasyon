package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class IcDenetimBirimiPage {
    private ElementHelper elementHelper;
    public IcDenetimBirimiPage(WebDriver driver){elementHelper=new ElementHelper(driver);}

    private By IcDenetimBirimiTitle =By.cssSelector("#head > div.row.hidden-xs > div.col-sm-10.col-sm-pull-1.col-md-pull-1.col-lg-pull-1.logo-span > p");
    private By IcDenetimYonergesiButton =By.cssSelector("#primary-nav > ul > li:nth-child(1) > a");
    private By GorevVeSorumluluklarButton =By.cssSelector("#primary-nav > ul > li:nth-child(2) > a");
    private By GorevVeSorumluluklarTitle =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div > h1");
    private By IcDenetcininGorevleriTitle =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div > div.content > h6 > span > strong");
    private By IcDenetimRehberiButton=By.cssSelector("#primary-nav > ul > li:nth-child(3) > a");
    private By IcDenetimRehberiTitle =By.cssSelector("#s-insert > div.block-regions.block-region-1.col-xs-12 > div > h1");
    private By KamuIcDenetimiStandartlarıButton =By.cssSelector("#primary-nav > ul > li:nth-child(4) > a");


    public void userOnTheIcDenetimBirimiPage(){
        elementHelper.openUrl("https://icdenetim.trakya.edu.tr/");
    }
    public String userShouldSeeIcDenetimBirimiTitleOnIcDeneteimBirimiPage(){
        return elementHelper.getText(IcDenetimBirimiTitle);
    }
    public void userShouldSeeIcDenetimYonergesiButton(){
        elementHelper.checkElement(IcDenetimYonergesiButton);
    }
    public void userClickGorevVeSorumluluklarButtonOnIcDenetimBirimiPage(){
        elementHelper.click(GorevVeSorumluluklarButton);
    }
    public String userShouldSeeGorevVeSorumluluklarTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage(){
        return elementHelper.getText(GorevVeSorumluluklarTitle);
    }
    public String userShouldSeeIcDenetcininGorevleriTitleInGorevVeSorumluluklarOnIcDenetimBirimiPage(){
        return elementHelper.getText(IcDenetcininGorevleriTitle);
    }
    public void userClickIcDenetimRehberiButtonOnIcDenetimBirimiPage(){
        elementHelper.click(IcDenetimRehberiButton);
    }
    public String userShouldSeeIcDenetimRehberiTitleOnIcDeneteimBirimiPage(){
        return elementHelper.getText(IcDenetimRehberiTitle);
    }
    public void userShouldSeeKamuIcDenetimiStandartlarıButton(){
        elementHelper.checkElement(KamuIcDenetimiStandartlarıButton);}


}
