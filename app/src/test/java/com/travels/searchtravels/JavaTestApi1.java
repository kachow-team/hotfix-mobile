package com.travels.searchtravels;


import android.net.Uri;

import com.travels.searchtravels.activity.DetailsActivity;
import com.travels.searchtravels.activity.MainActivity;

import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.travels.searchtravels.utils.Constants;

public class JavaTestApi1 {
    @Test
    public void testMountain() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.uploadImage(Uri.parse("https://avatars.mds.yandex.net/get-zen_doc/1917356/pub_5e54c8d76948c51ea07bce25_5e54c9f1cc6d233fd0f74604/scale_1200"));
        //assertEquals("Sochi", Constants.PICKED_CITY_EN);
    }
}
