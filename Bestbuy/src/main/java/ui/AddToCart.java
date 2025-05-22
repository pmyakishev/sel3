package ui;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 1/29/17.
 */
public class AddToCart extends BBCommonAPI {
    public static final String zipCode = System.getenv("ZIP_CODE");

    @FindBy(how = How.CSS, using = "#gh-search-input") 
    public static WebElement searchBar;
    @FindBy(how = How.CLASS_NAME, using = "product-title")
    public static WebElement testedItem;
    @FindBy(how = How.CSS, using = ".add-to-cart")
    public static WebElement btnAddToCart;
    @FindBy(how = How.CSS, using = ".cart")
    public static WebElement btnGoToCart;
    @FindBy(how = How.ID_OR_NAME, using = "checkout")
    public static WebElement btnCheckout;
    @FindBy(how = How.CSS, using = "#location")
    public static WebElement location;
    @FindBy(how = How.CSS, using = ".apply-location")
    public static WebElement checkAvailabilityGo;
    @FindBy(how = How.CLASS_NAME, using = "header-search-button")
    public static WebElement headerSearchButton;


    public AddToCart getAddToCart() throws InterruptedException {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        sleepFor(2);
        // bb.refuseMailingList();
        searchBar.sendKeys("6612253");
        headerSearchButton.click();
        waitUntilVisible(By.className("product-title"));
        testedItem.click(); sleepFor(1);
        bb.closePopByClose(); sleepFor(2);
        btnAddToCart.click(); sleepFor(3);
        bb.closePopByCloseIcon();sleepFor(3);
        btnGoToCart.click(); sleepFor(6);
        btnCheckout.click(); sleepFor(3);
        return new AddToCart();
    }
    public void provideLocation() throws InterruptedException {
        sleepFor(1);
        if (location.isDisplayed()) {
            location.sendKeys(zipCode);
            checkAvailabilityGo.click();
            sleepFor(1);
        }
    }
}
