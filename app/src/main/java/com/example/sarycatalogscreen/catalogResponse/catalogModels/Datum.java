
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("metadata")
    @Expose
    private Metadata__1 metadata;
    @SerializedName("group_id")
    @Expose
    private Integer groupId;
    @SerializedName("group_type")
    @Expose
    private Object groupType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("header")
    @Expose
    private Object header;
    @SerializedName("visuals")
    @Expose
    private Boolean visuals;
    @SerializedName("thumb_img")
    @Expose
    private Object thumbImg;
    @SerializedName("filters")
    @Expose
    private List<Filter> filters = null;
    @SerializedName("deep_link")
    @Expose
    private String deepLink;

    public Metadata__1 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata__1 metadata) {
        this.metadata = metadata;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Object getGroupType() {
        return groupType;
    }

    public void setGroupType(Object groupType) {
        this.groupType = groupType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public Boolean getVisuals() {
        return visuals;
    }

    public void setVisuals(Boolean visuals) {
        this.visuals = visuals;
    }

    public Object getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(Object thumbImg) {
        this.thumbImg = thumbImg;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

}
