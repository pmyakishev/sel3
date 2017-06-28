package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.GlobalHeader;
import java.io.IOException;

/**
 * Created by admin on 2/12/17.
 */
public class TestGlobalHeader extends GlobalHeader{

    @Test
    public void testGlobaHeader() throws  InterruptedException,IOException{
        GlobalHeader global = PageFactory.initElements(driver, GlobalHeader.class);
        global.globalHeader();
    }
}
