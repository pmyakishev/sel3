package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by admin on 1/28/17.
 */

public class GlobalHeader extends BBCommonAPI{

    @FindBy(how= How.XPATH,using=".//*[@id='menu0']")
    public  WebElement productsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu1']")
    public  WebElement brandsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu2']")
    public  WebElement dealsMenu;
    @FindBy(how=How.XPATH,using=".//*[@id='menu3']")
    public  WebElement servicesMenu;

    public void dropDownMenu() throws InterruptedException{
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.refuseMailingList();
        productsMenu.click(); sleepFor(1);
        brandsMenu.click(); sleepFor(1);
        dealsMenu.click(); sleepFor(1);
        servicesMenu.click(); sleepFor(1);
    }
    @FindBy(how= How.CSS, using=".primary-nav")
    List<WebElement> elementsGlobalNav = new ArrayList<>();

    public void getProducts() throws InterruptedException {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        bb.refuseMailingList(); sleepFor(1);
        elementsGlobalNav.get(0).click(); sleepFor(2);
        elementsGlobalNav.get(1).click(); sleepFor(2);
        elementsGlobalNav.get(2).click(); sleepFor(2);
    }
}
