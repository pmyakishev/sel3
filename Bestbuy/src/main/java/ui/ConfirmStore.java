package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * Created by admin on 2/3/17.
 */

public class ConfirmStore extends BBCommonAPI{
    @FindBy(how = How.CSS, using = ".modal-select-store.modal-select-store--primary")
    public static WebElement continueStore;
    @FindBy(how = How.CSS, using = ".ispu-fulfillment__find-store-btn")
    public static WebElement findAStore;

    public ConfirmStore confirmStore() throws InterruptedException{
        findAStore.click(); sleepFor(2);
        continueStore.click(); sleepFor(2);
        return new ConfirmStore();
    }


}

