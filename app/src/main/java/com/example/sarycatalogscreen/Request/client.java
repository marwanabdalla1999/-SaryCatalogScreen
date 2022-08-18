package com.example.sarycatalogscreen.Request;

import com.example.sarycatalogscreen.utils.API_Interface;
import com.example.sarycatalogscreen.utils.credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class client {



    private static final Retrofit.Builder retrofitBuilder=new Retrofit.Builder().baseUrl(credentials.Base_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static final Retrofit retrofit=retrofitBuilder.build();

    private static final API_Interface CatalogResponse=retrofit.create(API_Interface.class);



    public static API_Interface getCatalogResponse() {
        return CatalogResponse;
    }
}
