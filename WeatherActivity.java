package com.example.weatherretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

     private TextView temperature,placename;
    private MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        temperature = findViewById(R.id.TemperaturetextView);
        placename = findViewById(R.id.placeNametextView2);
        viewModel = new ViewModelProvider(WeatherActivity.this).get(MyViewModel.class);
        viewModel.getDetailsFromServer();

        viewModel.getPlaceName().observe( WeatherActivity.this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //settext / ui interaction
                placename.setText(s);

            }
        });

        viewModel.getTemperature().observe(WeatherActivity.this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

                //settext / ui interaction
                temperature.setText(s);
            }
        });

    }
}