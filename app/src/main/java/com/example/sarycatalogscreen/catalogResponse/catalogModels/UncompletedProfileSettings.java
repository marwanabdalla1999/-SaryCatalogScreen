
package com.example.sarycatalogscreen.catalogResponse.catalogModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UncompletedProfileSettings {

    @SerializedName("show_tag")
    @Expose
    private Boolean showTag;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("is_completed_profile")
    @Expose
    private Boolean isCompletedProfile;

    public Boolean getShowTag() {
        return showTag;
    }

    public void setShowTag(Boolean showTag) {
        this.showTag = showTag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsCompletedProfile() {
        return isCompletedProfile;
    }

    public void setIsCompletedProfile(Boolean isCompletedProfile) {
        this.isCompletedProfile = isCompletedProfile;
    }

}
