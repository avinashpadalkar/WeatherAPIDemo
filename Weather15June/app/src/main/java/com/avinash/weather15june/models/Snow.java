package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

public class Snow {
    @SerializedName("3h")
    public double m3h;

    public double getM3h() {
        return m3h;
    }

    public void setM3h(double m3h) {
        this.m3h = m3h;
    }
}
