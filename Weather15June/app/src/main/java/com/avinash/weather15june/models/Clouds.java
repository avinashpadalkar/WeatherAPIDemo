package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

public class Clouds {
    @SerializedName("all")
    public int all;

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
