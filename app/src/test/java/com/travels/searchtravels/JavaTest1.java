package com.travels.searchtravels;

import com.travels.searchtravels.activity.DetailsActivity;
import com.travels.searchtravels.activity.MainActivity;

import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.travels.searchtravels.utils.Constants;

public class JavaTest1 {
    @Test
    public void testMountain() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("mountain");
        assertEquals("Sochi", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testSnow() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("snow");
        assertEquals("Helsinki", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testBeach() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("beach");
        assertEquals("Rimini", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testOcean() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("ocean");
        assertEquals("Rimini", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testSea() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("sea");
        assertEquals("Rimini", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testOther() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("other");
        assertEquals("Rimini", Constants.PICKED_CITY_EN);
    }

    @Test
    public void testEmpty() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.loadByCategory("");
        assertEquals("Rimini", Constants.PICKED_CITY_EN);
    }
}
