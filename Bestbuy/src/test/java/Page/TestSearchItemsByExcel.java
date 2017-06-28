package Page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.SearchItems;
import java.io.IOException;

/**
 * Created by admin on 1/18/17.
 */
public class TestSearchItemsByExcel extends SearchItems {

    @Test
    public void searchByExcel() throws IOException, InterruptedException{
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        search.searchByExcel();
    }
}
