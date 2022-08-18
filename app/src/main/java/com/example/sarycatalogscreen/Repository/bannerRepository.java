package com.example.sarycatalogscreen.Repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.sarycatalogscreen.AppExecutors;
import com.example.sarycatalogscreen.Request.client;
import com.example.sarycatalogscreen.bannerResponse.bannerResponse;
import com.example.sarycatalogscreen.catalogResponse.CatalogResponse;
import com.example.sarycatalogscreen.utils.credentials;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class bannerRepository {


    private static bannerRepository instance;
    private final MutableLiveData<bannerResponse> data;


    public bannerRepository() {
        data=new MutableLiveData<>();
    }


    public static bannerRepository getInstance() {
        if (instance == null){
            instance =new bannerRepository();
        }
        return instance;
    }

    public LiveData<bannerResponse> getData() {
        return data;
    }

    //method to return all data using restAPI
    public void bannerAPI(){

        //Retrieve data from Rest API
        AppExecutors.getInstance().NetworkIO().submit(() -> callBannerAPI());



    }

    private void callBannerAPI() {

        Call<bannerResponse> banners= client.getCatalogResponse().banners(credentials.App_Version,credentials.Authorization);
            banners.enqueue(new Callback<bannerResponse>() {
                @Override
                public void onResponse(Call<bannerResponse> call, Response<bannerResponse> response) {
                    if (response.isSuccessful()){
                        data.postValue(response.body());

                    }
                }

                @Override
                public void onFailure(Call<bannerResponse> call, Throwable t) {
                    Log.d("TAG", "onFailure: "+t.getMessage());
                    data.postValue(null);
                }
            });

    }
}
