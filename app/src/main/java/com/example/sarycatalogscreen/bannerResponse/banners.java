package com.example.sarycatalogscreen.bannerResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class banners {

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("image")
    @Expose
    private String image;

    public String getLink() {
        return link;
    }

    public String getImage() {
        return image;
    }
}
