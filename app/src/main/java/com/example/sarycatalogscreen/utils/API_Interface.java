package com.example.sarycatalogscreen.utils;

import com.example.sarycatalogscreen.bannerResponse.bannerResponse;
import com.example.sarycatalogscreen.catalogResponse.CatalogResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface API_Interface {

    @GET("/api/v2.5.1/baskets/325514/catalog/")
    Call<CatalogResponse> Catalog(
            @Header("App-Version") String Version,
            @Header("Authorization") String Authorization);


    @GET("/api/v2.5.1/baskets/325514/banners/")
    Call<bannerResponse> banners(
            @Header("App-Version") String Version,
            @Header("Authorization") String Authorization);
}
