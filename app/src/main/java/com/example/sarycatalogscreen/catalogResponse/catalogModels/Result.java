
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("data_type")
    @Expose
    private String dataType;
    @SerializedName("show_title")
    @Expose
    private Boolean showTitle;
    @SerializedName("ui_type")
    @Expose
    private String uiType;
    @SerializedName("row_count")
    @Expose
    private Integer rowCount;
    @SerializedName("show_more_enabled")
    @Expose
    private Boolean showMoreEnabled;
    @SerializedName("excluded_business_segments")
    @Expose
    private List<Object> excludedBusinessSegments = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getUiType() {
        return uiType;
    }

    public void setUiType(String uiType) {
        this.uiType = uiType;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Boolean getShowMoreEnabled() {
        return showMoreEnabled;
    }

    public void setShowMoreEnabled(Boolean showMoreEnabled) {
        this.showMoreEnabled = showMoreEnabled;
    }

    public List<Object> getExcludedBusinessSegments() {
        return excludedBusinessSegments;
    }

    public void setExcludedBusinessSegments(List<Object> excludedBusinessSegments) {
        this.excludedBusinessSegments = excludedBusinessSegments;
    }

}
