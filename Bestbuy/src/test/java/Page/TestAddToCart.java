package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.AddToCart;
import ui.ConfirmStore;
import ui.PaymentVerification;
import ui.WhenYouWantOrder;
import utility.ItestListener;
import java.io.IOException;

@Listeners(ItestListener.class)
public class TestAddToCart extends AddToCart {
    
    @Test (priority = 1)
    public void testAddToCart() throws InterruptedException, IOException {
        AddToCart add = PageFactory.initElements(driver, AddToCart.class);
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        ConfirmStore store = PageFactory.initElements(driver, ConfirmStore.class);
        WhenYouWantOrder phone = PageFactory.initElements(driver, WhenYouWantOrder.class);
        PaymentVerification pay = PageFactory.initElements(driver, PaymentVerification.class);
        add.getAddToCart();
        takeScreenShot("getAddToCart");
        bb.secureLogin();sleepFor(4);
        //confirm store
        //store.confirmStore(); sleepFor(2);
        //provide a phone #
        phone.confirmPhone();
        //Payment  Verification
        pay.paymentInfoVerification();
        takeScreenShot("paymentInfoVer");
    }
}
