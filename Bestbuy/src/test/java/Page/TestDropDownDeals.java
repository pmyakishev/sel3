package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.DropDownDeals;

import java.io.IOException;

/**
 * Created by admin on 1/29/17.
 */
public class TestDropDownDeals extends DropDownDeals{
    @Test
    public void DropDownDeals() throws InterruptedException, IOException {
        DropDownDeals ddd = PageFactory.initElements(driver, DropDownDeals.class);
        ddd.dropDownDeals();
        takeScreenShot("TestDropDownDeals");
    }
}
