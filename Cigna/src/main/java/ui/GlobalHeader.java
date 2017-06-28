package ui;

import Methods.CignaCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by admin on 2/12/17.
 */
public class GlobalHeader extends CignaCommon {
    @FindBy(how = How.CSS, using = ".personal")
    public static WebElement btnPersonal;
    @FindBy(how = How.CSS, using = ".business")
    public static WebElement btnBusiness;
    @FindBy(how = How.CSS, using = ".health-care-professionals")
    public static WebElement btnHCProffesionals;
    @FindBy(how = How.CSS, using = ".international")
    public static WebElement btnInternational;
    @FindBy (how = How.CSS, using=".mainNav  two-lines")
    public static WebElement mainNav;
    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[1]/div/div[1]/div/div/div/div/header/div/div[2]/nav/ul/li[1]/a")
    public static WebElement productServices;
    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[1]/div/div[1]/div/div/div/div/header/div/div[2]/nav/ul/li[1]/a")
    public static WebElement networkBenefits;

    public void getPersonal()throws InterruptedException{
        btnPersonal.click(); sleepFor(1);
    }
    public void getBusiness()throws InterruptedException {
        btnBusiness.click(); sleepFor(1);
        Assert.assertTrue(productServices.isDisplayed());
    }
    public void getHCProffesionals() throws InterruptedException {
        btnHCProffesionals.click(); sleepFor(1);
//        Assert.assertTrue(networkBenefits.isDisplayed());
    }
    public void getInterbational() throws InterruptedException {
        btnInternational.click();
        sleepFor(1);
    }

    public void globalHeader ()throws InterruptedException{
        getPersonal();
        getBusiness();
        getHCProffesionals();
        getInterbational();
    }
}
