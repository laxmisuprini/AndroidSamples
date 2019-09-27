package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        List<Integer> ab=new ArrayList<>();
//       Toast.makeText(this, ab.get(0), Toast.LENGTH_SHORT).show();
//        Log.i("debug","error");
        setContentView(R.layout.activity_main);
//        Log.d("tag","In onCreate");
    }

    public void dispName(View view){
        Intent dispIntent = new Intent(this,WelcomeActivity.class);
        startActivity(dispIntent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","In onSTart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","In onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag","In onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","In onDestroy");
    }
}
