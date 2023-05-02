package com.example.weatherretrofit;

import com.google.gson.annotations.SerializedName;

public class Parent {

    public Parent(String base, long visibility, long dt, long timezone, long id, String name, int cod) {
        this.base = base;
        this.visibility = visibility;
        this.dt = dt;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public String getBase() {
        return base;
    }

    public long getVisibility() {
        return visibility;
    }

    public long getDt() {
        return dt;
    }

    public long getTimezone() {
        return timezone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    @SerializedName("base")
    private String base;

    @SerializedName("visibility")
    private long visibility;

    @SerializedName("dt")
    private long dt;

    @SerializedName("timezone")
    private long timezone;

    @SerializedName("id")
    private long id;

    @SerializedName("name")
    private String name;

    @SerializedName("cod")
    private int cod;

    public Wind getspeed(){
        return getspeed();
    }
    @SerializedName("main")
    Main main;

    public Main getMain() {
        return main;
    }

//    public Weather getWeatherArr() {
//        return weatherArr;
//    }
//
//    @SerializedName("weather")
//    Weather weatherArr;



}
