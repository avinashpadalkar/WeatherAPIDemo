package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

public class Coord {
    @SerializedName("lat")
    public double lat;
    @SerializedName("lon")
    public double lon;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
