
package com.example.sarycatalogscreen.catalogResponse;

import java.util.List;


import com.example.sarycatalogscreen.catalogResponse.catalogModels.Other;
import com.example.sarycatalogscreen.catalogResponse.catalogModels.Result;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatalogResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("other")
    @Expose
    private Other other;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
