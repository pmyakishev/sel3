package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.MyAccountPage;

/**
 * Created by admin on 1/29/17.
 */
public class TestMyAccountPage extends MyAccountPage{

//    @Test(priority = 1)
//    public void testMyAccountPage() throws InterruptedException {
//        BBCommonAPI bbc = PageFactory.initElements(driver, BBCommonAPI.class);
//        MyAccountPage map = PageFactory.initElements(driver, MyAccountPage.class);
//
//        bbc.successfulLogIn();
//        map.getMyAccountPage();
//        sleepFor(1);
//    }

    @Test(priority = 1)
    public void testMyAccountPageMenu() throws InterruptedException{
        BBCommonAPI bbc = PageFactory.initElements(driver, BBCommonAPI.class);
        MyAccountPage map = PageFactory.initElements(driver, MyAccountPage.class);

        bbc.successfulLogIn();
        map.getMyAccountPage();
        map.checkMyPurchasesPage();
    }
}
