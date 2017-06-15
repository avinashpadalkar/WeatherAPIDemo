package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

public class Sys {
    @SerializedName("pod")
    public String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }
}
