package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 1/29/17.
 */
public class UserLoginButton extends BBCommonAPI{
    public static final String username = System.getenv("BESTBUY_USERNAME");
    public static final String password = System.getenv("BESTBUY_PASSWORD");

    @FindBy(how= How.XPATH,using=".//*[@id='profileMenuWrap1']")
    public WebElement signInHome;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileMenu1']/a")
    public WebElement signInMy;

    //user  login
    public void userLoginButton() throws InterruptedException {
//        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
//        bb.refuseMailingList();
        signInHome.click();
        signInMy.click();
    }

}
