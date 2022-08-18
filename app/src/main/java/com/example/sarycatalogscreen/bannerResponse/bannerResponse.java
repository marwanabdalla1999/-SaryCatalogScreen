package com.example.sarycatalogscreen.bannerResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class bannerResponse {

    @SerializedName("result")
    @Expose
    private List<banners> result = null;


    public List<banners> getResult() {
        return result;
    }
}
