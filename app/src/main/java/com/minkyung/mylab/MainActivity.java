package com.minkyung.mylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.minkyung.mylab.customView.PentagonShapeView;

public class MainActivity extends AppCompatActivity {
    RadioGroup mainRadioGroup;
    RadioButton mainButton1;
    RadioButton mainButton2;
    RadioButton mainButton3;
    RadioButton mainButton4;
    PentagonShapeView mainButtonPentagon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getView();
        setEvent();
        initializeRadioGroup();

        // default
        mainButton1.performClick();
//        mainButton1.setBackgroundResource(R.drawable.icon_face_angry_blue);
    }

    private void getView() {
        mainRadioGroup = (RadioGroup) findViewById(R.id.radio_group);
        mainButton1 = (RadioButton) findViewById(R.id.main_button_1);
        mainButton2 = (RadioButton) findViewById(R.id.main_button_2);
        mainButton3 = (RadioButton) findViewById(R.id.main_button_3);
        mainButton4 = (RadioButton) findViewById(R.id.main_button_4);
        mainButtonPentagon = (PentagonShapeView) findViewById(R.id.main_button_pentagon);
    }

    private void setEvent() {
        mainRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                initializeRadioGroup();
                switch (checkedId) {
                    case R.id.main_button_1:
                        mainButton1.setBackgroundResource(R.drawable.icon_face_angry_blue);
                        break;
                    case R.id.main_button_2:
                        mainButton2.setBackgroundResource(R.drawable.icon_face_laughing_blue);
                        break;
                    case R.id.main_button_3:
                        mainButton3.setBackgroundResource(R.drawable.icon_face_sad_blue);
                        break;
                    case R.id.main_button_4:
                        mainButton4.setBackgroundResource(R.drawable.icon_face_flashed_blue);
                        break;
                }

                Toast.makeText(MainActivity.this, checkedId + "", Toast.LENGTH_SHORT).show();
            }
        });

        mainButtonPentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "pentagon button is clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeRadioGroup() {
        mainButton1.setBackgroundResource(R.drawable.icon_face_angry_gray);
        mainButton2.setBackgroundResource(R.drawable.icon_face_laughing_gray);
        mainButton3.setBackgroundResource(R.drawable.icon_face_sad_gray);
        mainButton4.setBackgroundResource(R.drawable.icon_face_flashed_gray);
    }
}
