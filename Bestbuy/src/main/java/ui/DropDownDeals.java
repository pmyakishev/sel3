package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 1/29/17.
 */
public class DropDownDeals extends BBCommonAPI {

    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[1]/a")
    public  WebElement weeklyAd;
    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[2]/a")
    public  WebElement dayOfTheDay;
    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[3]/a")
    public  WebElement GiftCards;
    @FindBy(how= How.XPATH,using=".//*[@id='header']/div[2]/div/nav[2]/ul/li[4]/a")
    public  WebElement GiftIdeasRegistry;

    public void dropDownDeals() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        sleepFor(2);
        bb.refuseMailingList();

        weeklyAd.click(); sleepFor(2);
        dayOfTheDay.click(); sleepFor(2);
        GiftCards.click(); sleepFor(2);
        GiftIdeasRegistry.click(); sleepFor(2);
    }
}
