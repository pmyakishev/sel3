package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by admin on 2/3/17.
 */
public class PaymentVerification extends BBCommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@class='btn btn-lg btn-block btn-secondary']")
    public static WebElement placeYourOrder;
    public void paymentInfoVerification() throws InterruptedException{

//        Assert.assertTrue(placeYourOrder.isDisplayed());
        sleepFor(2);
    }
}
