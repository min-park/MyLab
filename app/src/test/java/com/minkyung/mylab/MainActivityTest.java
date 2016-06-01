package com.minkyung.mylab;

import android.app.Activity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {
    Activity activity;
    RadioGroup mainRadioGroup;

    @Before
    public void setUp() throws Exception {
        // get activity
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void whenOpenActivity_defaultSelectedButtonIsMainButton1() throws Exception {
        mainRadioGroup = (RadioGroup) activity.findViewById(R.id.radio_group);
        assertEquals(R.id.main_button_1, mainRadioGroup.getCheckedRadioButtonId());
    }
}