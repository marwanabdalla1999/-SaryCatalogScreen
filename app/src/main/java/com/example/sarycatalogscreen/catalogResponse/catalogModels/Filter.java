
package com.example.sarycatalogscreen.catalogResponse.catalogModels;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filter {

    @SerializedName("metadata")
    @Expose
    private Metadata__2 metadata;
    @SerializedName("filter_id")
    @Expose
    private Integer filterId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private Object image;

    public Metadata__2 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata__2 metadata) {
        this.metadata = metadata;
    }

    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

}
