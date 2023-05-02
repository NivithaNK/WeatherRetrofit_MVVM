package com.example.weatherretrofit;

import com.google.gson.annotations.SerializedName;

public class MainObj {

    public MainObj(float temperature, float feelslike, float minTemperature, float maxTemperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.feelslike = feelslike;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @SerializedName("temp")
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public float getFeelslike() {
        return feelslike;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    @SerializedName("feels_like")
    private float feelslike;

    @SerializedName("temp_min")
    private float  minTemperature;

    @SerializedName("temp_max")
    private float maxTemperature;

    @SerializedName("pressure")
    private int pressure;

    @SerializedName("humidity")
    private int humidity;

}
