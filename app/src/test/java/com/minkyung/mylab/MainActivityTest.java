package com.minkyung.mylab;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.hamcrest.Matcher;
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
    private RadioButton mainButton3;
    private RadioButton mainButton1;

    @Before
    public void setUp() throws Exception {
        // get activity
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void whenOpenActivity_mainButton1IsSelected() throws Exception {
        assertEquals(R.id.main_button_1, mainRadioGroup.getCheckedRadioButtonId());
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Test
    public void onClickOtherEmoticonButton_changeIsChecked() throws Exception {
        mainButton1 = (RadioButton) activity.findViewById(R.id.main_button_1);
        mainButton3 = (RadioButton) activity.findViewById(R.id.main_button_3);

        assertTrue(mainButton1.isChecked());
        assertFalse(mainButton3.isChecked());

        mainButton3.performClick();

        assertFalse(mainButton1.isChecked());
        assertTrue(mainButton3.isChecked());
    }
}