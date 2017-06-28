package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class MyAccountPage extends BBCommonAPI{
    @FindBy(how = How.CSS, using = ".user")
    public  WebElement hiUser;
    @FindBy(how = How.XPATH,using = "html/body/header/div[1]/div[2]/ul/li[1]/div/ul/li[1]/a")
    public WebElement accountHome;
    @FindBy(how = How.XPATH, using = "html/body/div[3]/div[1]/nav/div/div[2]/a")
    public  WebElement purchases;

    public  MyAccountPage getMyAccountPage() throws InterruptedException {
        hiUser.click();
        accountHome.click(); sleepFor(2);
        return new MyAccountPage();
    }

    public void checkMyPurchasesPage() throws InterruptedException {
        purchases.click(); sleepFor(1);
    }
}
