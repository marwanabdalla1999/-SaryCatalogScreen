
package com.example.sarycatalogscreen.catalogResponse.catalogModels;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Other {

    @SerializedName("show_special_order_view")
    @Expose
    private Boolean showSpecialOrderView;
    @SerializedName("uncompleted_profile_settings")
    @Expose
    private UncompletedProfileSettings uncompletedProfileSettings;
    @SerializedName("show_vat")
    @Expose
    private Boolean showVat;
    @SerializedName("header")
    @Expose
    private Header header;
    @SerializedName("business_status")
    @Expose
    private BusinessStatus businessStatus;

    public Boolean getShowSpecialOrderView() {
        return showSpecialOrderView;
    }

    public void setShowSpecialOrderView(Boolean showSpecialOrderView) {
        this.showSpecialOrderView = showSpecialOrderView;
    }

    public UncompletedProfileSettings getUncompletedProfileSettings() {
        return uncompletedProfileSettings;
    }

    public void setUncompletedProfileSettings(UncompletedProfileSettings uncompletedProfileSettings) {
        this.uncompletedProfileSettings = uncompletedProfileSettings;
    }

    public Boolean getShowVat() {
        return showVat;
    }

    public void setShowVat(Boolean showVat) {
        this.showVat = showVat;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public BusinessStatus getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }

}
