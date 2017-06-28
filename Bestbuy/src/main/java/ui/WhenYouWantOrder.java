package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 2/3/17.
 */
public class WhenYouWantOrder extends BBCommonAPI {

    public static final String notMyPhone = System.getenv("NOT_MY_PHONE");

    @FindBy(how = How.ID, using = "user.phone")
    public static WebElement userPhone;
    @FindBy(how = How.CSS, using = ".btn.btn-lg.btn-block.btn-primary")
    public static WebElement continueToPaymentInfo;

    public  WhenYouWantOrder confirmPhone () throws InterruptedException{
        sleepFor(2);
        userPhone.sendKeys(notMyPhone);
        continueToPaymentInfo.click(); sleepFor(5);
        return new WhenYouWantOrder();
    }
}
