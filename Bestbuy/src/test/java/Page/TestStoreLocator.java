package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.StoreLocator;

/**
 * Created by admin on 1/29/17.
 */
public class TestStoreLocator extends StoreLocator {

    @Test
    public void testStoreLocator() throws InterruptedException{
        StoreLocator loc = PageFactory.initElements(driver, StoreLocator.class);
        loc.storeLocatorButton();
        sleepFor(1);
    }
}
