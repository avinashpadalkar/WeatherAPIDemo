package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    public double temp;
    @SerializedName("temp_min")
    public double temp_min;
    @SerializedName("temp_max")
    public double temp_max;
    @SerializedName("pressure")
    public double pressure;
    @SerializedName("sea_level")
    public double sea_level;
    @SerializedName("grnd_level")
    public double grnd_level;
    @SerializedName("humidity")
    public int humidity;
    @SerializedName("temp_kf")
    public double temp_kf;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSea_level() {
        return sea_level;
    }

    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    public double getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_kf() {
        return temp_kf;
    }

    public void setTemp_kf(double temp_kf) {
        this.temp_kf = temp_kf;
    }
}
