package com.example.manuel.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.manuel.commons.R;
import com.example.manuel.commons.ui.radiobutton.CustomRadioGroup;
import com.example.manuel.commons.ui.radiobutton.OnCustomRadioButtonListener;
import com.example.manuel.ui.mapper.MainActivityRadioButtonMapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initOnCustomRadioGroupListener();
    }

    private void initOnCustomRadioGroupListener() {
        CustomRadioGroup.setOnClickListener((OnCustomRadioButtonListener) view -> {
            switch (view.getId()) {
                case R.id.first_question_first_answer:
                    showButtonTag(R.id.first_question_first_answer);
                    break;
                case R.id.first_question_second_answer:
                    showButtonTag(R.id.first_question_second_answer);
                    break;
                case R.id.first_question_third_answer:
                    showButtonTag(R.id.first_question_third_answer);
                    break;
                case R.id.first_question_fourth_answer:
                    showButtonTag(R.id.first_question_fourth_answer);
                    break;
                case R.id.second_question_first_answer:
                    showButtonTag(R.id.second_question_first_answer);
                    break;
                case R.id.second_question_second_answer:
                    showButtonTag(R.id.second_question_second_answer);
                    break;
                default:
                    showButtonTag(-1);
                    break;
            }
        });
    }

    private void showButtonTag(int viewId) {
        MainActivityRadioButtonMapper mapper = new MainActivityRadioButtonMapper(this);
        String tag = mapper.mapToStrigFrom(viewId);
        Toast.makeText(this, tag, Toast.LENGTH_SHORT).show();
    }
}
