package com.example.weatherretrofit;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyViewModel extends AndroidViewModel {
    Api api;

    private MutableLiveData<String> placeLiveData = new MutableLiveData<>();
    private MutableLiveData<String> temperatureLiveData = new MutableLiveData<>();

    public MutableLiveData<String> getPlaceName() {
        return placeLiveData;
    }

    public void setPlaceName(String input) {
        this.placeLiveData.postValue(input);
    }

    public MutableLiveData<String> getTemperature(){
        return temperatureLiveData ;
    }

    public void setTemperature(String temperature){
        this.temperatureLiveData .postValue(temperature);
    }

    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    public void getDetailsFromServer(){

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(Api.class);
        Call<Parent> call = api.getUsers();

        call.enqueue(new Callback<Parent>() {
            @Override
            public void onResponse(Call<Parent> call, Response<Parent> response) {
                if (!response.isSuccessful()){
//                    textview4.setText("Code: " + response.code());
                    return;
                }
                if(response.body().getName() != null){
                    String Temperature = "";
                    String place="";
                    place += response.body().getName() +"\n";
                    Temperature += response.body().getMain().getTemp() +"\n";
                    setTemperature(Temperature);
                    setPlaceName(place);

                }
            }
            @Override
            public void onFailure(Call<Parent> call, Throwable t) {
                Toast.makeText(getApplication(),"An error occur",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

