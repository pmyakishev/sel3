package Page;

import BBMethods.BBCommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.SearchItems;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by admin on 2/11/17.
 */
public class TestSearchBySQL extends BBCommonAPI {

    @Test
    public void testBySQL() throws IOException, InterruptedException, SQLException, ClassNotFoundException, Exception{

            SearchItems search = PageFactory.initElements(driver, SearchItems.class);
            search.searchByMySQL();
            sleepFor(2);
            takeScreenShot("searchBySql");
    }
}
