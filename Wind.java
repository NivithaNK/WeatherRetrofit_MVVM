package com.example.weatherretrofit;

import com.google.gson.annotations.SerializedName;

public class Wind {

    public Wind(float speed, int degree, float gust) {
        this.speed = speed;
        this.degree = degree;
        this.gust = gust;
    }

    public float getSpeed() {
        return speed;
    }

    public int getDegree() {
        return degree;
    }

    public float getGust() {
        return gust;
    }

    @SerializedName("speed")
    private float speed;
    @SerializedName("deg")
    private int degree;
    @SerializedName("gust")
    private float gust;
}
