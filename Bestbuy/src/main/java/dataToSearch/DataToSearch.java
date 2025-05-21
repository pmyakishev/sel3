package dataToSearch;

import java.io.IOException;

import utility.DataReader;

/**
 * Created by admin on 1/26/17.
 */
public class DataToSearch {

    DataReader dr = new DataReader();

    public String [] getData () throws IOException {
        String path = System.getProperty("user.dir")+"/data/searchData.xls";
        String[] st = dr.fileReader(path);
        return st;
    }

}
