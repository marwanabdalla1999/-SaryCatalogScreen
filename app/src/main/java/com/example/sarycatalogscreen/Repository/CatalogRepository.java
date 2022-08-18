package com.example.sarycatalogscreen.Repository;

import android.net.Credentials;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.sarycatalogscreen.AppExecutors;
import com.example.sarycatalogscreen.Request.client;
import com.example.sarycatalogscreen.catalogResponse.CatalogResponse;
import com.example.sarycatalogscreen.utils.credentials;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CatalogRepository {


    private static CatalogRepository instance;
    private final MutableLiveData<CatalogResponse> data;


    public CatalogRepository() {
        data=new MutableLiveData<>();
    }


    public static CatalogRepository getInstance() {
        if (instance == null){
            instance =new CatalogRepository();
        }
        return instance;
    }

    public LiveData<CatalogResponse> getData() {
        return data;
    }

    //method to return all data using restAPI
    public void CatalogAPI(){

        //Retrieve data from Rest API
        AppExecutors.getInstance().NetworkIO().submit(() -> callCatalogAPI());



    }

    private void callCatalogAPI() {

        Call<CatalogResponse> Catalog= client.getCatalogResponse().Catalog(credentials.App_Version,credentials.Authorization);
            Catalog.enqueue(new Callback<CatalogResponse>() {
                @Override
                public void onResponse(Call<CatalogResponse> call, Response<CatalogResponse> response) {
                    if (response.isSuccessful()){
                        data.postValue(response.body());

                    }
                }

                @Override
                public void onFailure(Call<CatalogResponse> call, Throwable t) {
                    Log.d("TAG", "onFailure: "+t.getMessage());
                    data.postValue(null);
                }
            });

    }
}
