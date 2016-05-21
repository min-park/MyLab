package com.minkyung.mylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.minkyung.mylab.com.minkyung.mylab.customView.PentagonShapeView;

import static com.minkyung.mylab.R.drawable.icon_face_laughing_blue;

public class MainActivity extends AppCompatActivity {
    RadioGroup radio_group;
    RadioButton main_button_1;
    RadioButton main_button_2;
    RadioButton main_button_3;
    RadioButton main_button_4;
    PentagonShapeView main_button_pentagon;

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
        main_button_pentagon = (PentagonShapeView) findViewById(R.id.main_button_pentagon);
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

        main_button_pentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "pentagon button is clicked!!!", Toast.LENGTH_SHORT).show();
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
