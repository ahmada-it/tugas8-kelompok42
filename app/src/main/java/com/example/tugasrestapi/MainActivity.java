package com.example.tugasrestapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tugasrestapi.R;
import com.example.tugasrestapi.WeatherFragment;

/**
 * Created by Azhar Rivaldi on 26-12-2019.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity, new WeatherFragment()).commit();
    }
}
