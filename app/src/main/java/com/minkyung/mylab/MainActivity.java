package com.minkyung.mylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.minkyung.mylab.customView.PentagonShapeView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mainRadioGroup;
    private RadioButton mainButton3;
    private RadioButton mainButton4;
    private RadioButton mainButton1;
    private RadioButton mainButton2;
    private Button mainButtonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getView();
        setEvent();
        initializeRadioGroup();

        // default
        mainButton1.performClick();
    }

    private void getView() {
        mainRadioGroup = (RadioGroup) findViewById(R.id.radio_group);
        mainButton1 = (RadioButton) findViewById(R.id.main_button_1);
        mainButton2 = (RadioButton) findViewById(R.id.main_button_2);
        mainButton3 = (RadioButton) findViewById(R.id.main_button_3);
        mainButton4 = (RadioButton) findViewById(R.id.main_button_4);
        mainButtonStart = (Button) findViewById(R.id.main_button_start);
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

        mainButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EnterInformationActivity.class));
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
