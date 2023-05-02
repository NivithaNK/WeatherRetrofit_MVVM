package com.example.weatherretrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = ("https://api.openweathermap.org/data/2.5/");

    @GET("weather?lat=14.004556&lon=76.961632&appid=e92bfe7458edb07a07a6d73ab301e19b")
    Call<Parent> getUsers();
}
