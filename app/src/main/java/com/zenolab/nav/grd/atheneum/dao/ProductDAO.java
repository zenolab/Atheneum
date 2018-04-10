package com.zenolab.nav.grd.atheneum.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grd on 8/14/17.
 */

public class ProductDAO {


    public static List<String> mListRecyclerView  = new ArrayList<>();

    private String tab1;
    private String tab2;

    public ProductDAO(String tab1, String tab2) {
        this.tab1 = tab1;
        this.tab2 = tab2;
    }

    ///----------------------------
    public String getTab1() {
        return tab1;
    }

    public void setTab1(String tab1) {
        this.tab1 = tab1;
    }

    public String getTab2() {
        return tab2;
    }

    public void setTab2(String tab2) {
        this.tab2 = tab2;
    }


}
