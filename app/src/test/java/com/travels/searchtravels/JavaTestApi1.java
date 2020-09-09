package com.travels.searchtravels;


import android.net.Uri;
import com.travels.searchtravels.R;
import com.travels.searchtravels.activity.DetailsActivity;
import com.travels.searchtravels.activity.MainActivity;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

import com.travels.searchtravels.utils.Constants;


@RunWith(RobolectricTestRunner.class)
public class JavaTestApi1 {
    @Test
    public void testImage() throws Exception {
        Constants.IS_TESTING = true;
        MainActivity mainActivity = new MainActivity();
        mainActivity.uploadImage(Uri.parse("android.resource://" + "com.travels.searchtravels" + "/" + R.drawable.test));
        assertTrue(Constants.FOR_TEST_SUCCESS_LATLNG);
    }
    @Test
    public void testPrice() throws Exception {
        Constants.IS_TESTING = true;
        DetailsActivity detailsActivity = new DetailsActivity();
        detailsActivity.getInfoNomad("Moscow");
        assertTrue(Constants.FOR_TEST_SUCCESS_PRICE);
    }
}
