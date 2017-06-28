package ui;

import BBMethods.BBCommonAPI;
import Utility.ConnectDB;
import dataToSearch.DataToSearch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 1/26/17.
 */
public class SearchItems extends BBCommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
    public WebElement searchInput;

    public void clearInput() {
        searchInput.clear();
    }

    public void searchFor(String item) throws InterruptedException {
        searchInput.sendKeys(item, Keys.ENTER);
        sleepFor(1);
    }

    public void searchByExcel() throws IOException, InterruptedException {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
//        bb.refuseMailingList();
        sleepFor(1);

        DataToSearch DataToSearch = new DataToSearch();
//       SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        String[] value = DataToSearch.getData();
        for (int i = 1; i < value.length; i++) {
            searchFor(value[i]);
            clearInput();
        }
    }
    public void searchByMySQL() throws InterruptedException, IOException, ClassNotFoundException, SQLException, Exception {
        BBCommonAPI bb = PageFactory.initElements(driver, BBCommonAPI.class);
        bb.refuseMailingList();
        ConnectDB connectDB = new ConnectDB();
        connectDB.connectToDBdemo1();
        List<String> list = new ArrayList<String>();
        list = connectDB.readDataBase("items2search", "sku");
        searchFor(list.get(1));
        sleepFor(2);
        clearInput();
    }
}
