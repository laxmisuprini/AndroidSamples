package com.example.menutea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.toggleBtn);
    }

    public void saveChoice(View view) {
        CheckBox milk = findViewById(R.id.milk);
        CheckBox sugar = findViewById(R.id.sugar);
        CheckBox lemon = findViewById(R.id.lemon);
        String msg = "Tea with ";

        if(milk.isChecked())
            msg += "milk ";
        if(sugar.isChecked())
            msg += "sugar ";
        if(lemon.isChecked())
            msg += "lemon ";

        if(toggleButton.isChecked())
            Toast.makeText(this,msg+" Hot", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,msg+" Cold", Toast.LENGTH_LONG).show();

    }
}
