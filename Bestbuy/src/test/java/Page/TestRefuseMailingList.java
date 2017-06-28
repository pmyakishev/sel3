package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by admin on 1/31/17.
 */
public class TestRefuseMailingList extends BBCommonAPI {

    @FindBy(how = How.CSS, using = ".primary-wrap")
    public  static WebElement homepage;
    public void assertHomepage(){
        Assert.assertTrue(homepage.isDisplayed());
    }
    @Test
    public void TestRefuseMailingList() throws InterruptedException {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        bb.refuseMailingList();
        sleepFor(4);
        assertHomepage() ;
    }
}
