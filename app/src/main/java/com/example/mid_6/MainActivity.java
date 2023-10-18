package com.example.mid_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CheckBox rotation, Clickable, Enable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        rotation = (CheckBox) findViewById(R.id.rotation);
        Clickable = (CheckBox) findViewById(R.id.Clickable);
        Enable = (CheckBox) findViewById(R.id.Enable);

        Enable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Enable.isChecked() == true){
                    btn.setEnabled(true);
                }
                else
                    btn.setEnabled(false);
            }
        });

        Clickable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (Clickable.isChecked() == true){
                    btn.setClickable(true);
                }
                else
                    btn.setClickable(false);
            }
        });

        rotation.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rotation.isChecked() == true){
                    btn.setRotation(45);
                }
                else
                    btn.setRotation(0);
            }
        });





    }
}