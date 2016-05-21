package com.minkyung.mylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.minkyung.mylab.R.drawable.icon_face_laughing_blue;

public class MainActivity extends AppCompatActivity {
    RadioGroup radio_group;
    RadioButton main_button_1;
    RadioButton main_button_2;
    RadioButton main_button_3;
    RadioButton main_button_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getView();
        setEvent();
        initializeRadioGroup();

        // default
        main_button_1.setBackgroundResource(R.drawable.icon_face_angry_blue);
    }

    private void getView() {
        radio_group = (RadioGroup) findViewById(R.id.radio_group);
        main_button_1 = (RadioButton) findViewById(R.id.main_button_1);
        main_button_2 = (RadioButton) findViewById(R.id.main_button_2);
        main_button_3 = (RadioButton) findViewById(R.id.main_button_3);
        main_button_4 = (RadioButton) findViewById(R.id.main_button_4);
    }

    private void setEvent() {
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                initializeRadioGroup();
                switch (checkedId) {
                    case R.id.main_button_1:
                        main_button_1.setBackgroundResource(R.drawable.icon_face_angry_blue);
                        break;
                    case R.id.main_button_2:
                        main_button_2.setBackgroundResource(R.drawable.icon_face_laughing_blue);
                        break;
                    case R.id.main_button_3:
                        main_button_3.setBackgroundResource(R.drawable.icon_face_sad_blue);
                        break;
                    case R.id.main_button_4:
                        main_button_4.setBackgroundResource(R.drawable.icon_face_flashed_blue);
                        break;
                }

                Toast.makeText(MainActivity.this, checkedId + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeRadioGroup() {
        main_button_1.setBackgroundResource(R.drawable.icon_face_angry_gray);
        main_button_2.setBackgroundResource(R.drawable.icon_face_laughing_gray);
        main_button_3.setBackgroundResource(R.drawable.icon_face_sad_gray);
        main_button_4.setBackgroundResource(R.drawable.icon_face_flashed_gray);
    }
}
