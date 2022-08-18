
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("sub_title")
    @Expose
    private String subTitle;
    @SerializedName("consumable_display")
    @Expose
    private Object consumableDisplay;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Object getConsumableDisplay() {
        return consumableDisplay;
    }

    public void setConsumableDisplay(Object consumableDisplay) {
        this.consumableDisplay = consumableDisplay;
    }

}
