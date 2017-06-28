package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.GlobalHeader;

/**
 * Created by admin on 1/27/17.
 */
public class TestGlobalHeader extends GlobalHeader {

    @Test
    public void DropDownMenu() throws InterruptedException{
        GlobalHeader dd = PageFactory.initElements(driver, GlobalHeader.class);
        dd.dropDownMenu();
//        dd.getProducts();
        sleepFor(1);
    }
}
