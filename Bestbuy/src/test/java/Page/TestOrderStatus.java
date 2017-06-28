package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.OrderStatus;

/**
 * Created by admin on 1/29/17.
 */
public class TestOrderStatus extends OrderStatus{

        @Test
        public void testOrderStatus() throws InterruptedException{
            OrderStatus os = PageFactory.initElements(driver, OrderStatus.class);
            os.orderStatusButton();
        }
}
