
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Header {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("type")
    @Expose
    private String type;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
