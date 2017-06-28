package Page;

import org.testng.annotations.Test;
import ui.DropDownAllSearch;

import java.util.List;

/**
 * Created by admin on 3/7/17.
 */
public class TestDropDownAllSearch extends DropDownAllSearch{

    @Test
    public void dropDownMenu()throws InterruptedException {
        List<String> text = getMenus();
        typeOnInputSearch(text);
    }
}
