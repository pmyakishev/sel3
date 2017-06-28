package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by admin on 1/30/17.
 */
public class TestSuccessfulLogin extends BBCommonAPI{

    @Test
    public void testSuccessfulLogIn() throws InterruptedException, IOException {
        BBCommonAPI bb = PageFactory.initElements(driver,BBCommonAPI.class);
        bb.successfulLogIn();
        takeScreenShot("SuccessLogin");
    }
}
