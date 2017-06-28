package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class StoreLocator extends BBCommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/header/div[1]/div[1]/nav/ul/li[3]/a")
    public  WebElement storeLocator;

    @FindBy(how=How.CSS,using="#zip-city-state")
    public  WebElement zipCodeField;

    @FindBy(how=How.XPATH, using="html/body/div[4]/div/div/div[1]/form/div[1]/button")
    public  WebElement useMyCurrentLocationBtn;

    public void storeLocatorButton()throws InterruptedException {
//        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
//        bb.refuseMailingList();
        storeLocator.click();
        zipCodeField.sendKeys("20002"); sleepFor(1);
        //useMyCurrentLocationBtn.click();
    }
}
