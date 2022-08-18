
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata__2 {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("sub_title")
    @Expose
    private Object subTitle;
    @SerializedName("consumable_display")
    @Expose
    private Object consumableDisplay;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(Object subTitle) {
        this.subTitle = subTitle;
    }

    public Object getConsumableDisplay() {
        return consumableDisplay;
    }

    public void setConsumableDisplay(Object consumableDisplay) {
        this.consumableDisplay = consumableDisplay;
    }

}
