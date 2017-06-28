package ui;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 3/7/17.
 */
public class DropDownAllSearch extends CommonAPI{
    public List<String> getMenus(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#searchDropdownBox option");

        return items;
    }

    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        for(int i=0; i<5; i++) {
            typeByCss("#twotabsearchtextbox", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }

    public void input() {
        keysInput("#twotabsearchtextbox");
    }
    public void clearBox() {
        clearInput("#twotabsearchtextbox");
    }
}
