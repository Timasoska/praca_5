package com.example.prac_2_5_new;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setAutoLinkMask(Linkify.ALL);
        textView.setText("Visit our website: www.example.com\nCall us: 123-456-7890");

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText1.getText().toString();
                editText2.setText(text);
            }
        });

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Обработка изменений состояния флажка 1
                if (isChecked) {
                    // Код, выполняемый при выборе флажка 1
                } else {
                    // Код, выполняемый при снятии выбора флажка 1
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Обработка изменений состояния флажка 2
                if (isChecked) {
                    // Код, выполняемый при выборе флажка 2
                } else {
                    // Код, выполняемый при снятии выбора флажка 2
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Обработка изменений состояния флажка 3
                if (isChecked) {
                    // Код, выполняемый при выборе флажка 3
                } else {
                    // Код, выполняемый при снятии выбора флажка 3
                }
            }
        });

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setTextOn("ON");
        toggleButton.setTextOff("OFF");
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Обработка изменений состояния переключателя
                if (isChecked) {
                    // Код, выполняемый при включении переключателя
                } else {
                    // Код, выполняемый при выключении переключателя
                }
            }
        });

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Обработка изменений состояния радиокнопок
                if (checkedId == R.id.radioButton1) {
                    // Код, выполняемый при выборе радиокнопки 1
                } else if (checkedId == R.id.radioButton2) {
                    // Код, выполняемый при выборе радиокнопки 2
                }
            }
        });


        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Обработка изменений значения ползунка
                // progress - текущее значение ползунка
                // fromUser - флаг, указывающий, было ли изменение значения ползунка пользователем
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Вызывается, когда пользователь начинает перемещать ползунок
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Вызывается, когда пользователь заканчивает перемещать ползунок
            }
        });
    }
}
