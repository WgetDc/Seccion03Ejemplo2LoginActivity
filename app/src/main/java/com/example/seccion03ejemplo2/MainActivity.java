package com.example.seccion03ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart ejecutandose", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume ejecutandose", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause ejecutandose", Toast.LENGTH_SHORT).show();
    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop ejecutandose", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy ejecutandose", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart ejecutandose", Toast.LENGTH_SHORT).show();
    }


 */

}