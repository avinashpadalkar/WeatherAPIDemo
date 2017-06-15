package com.avinash.weather15june.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Avinash.Padalkar on 15/06/2017.
 */

public class SamplePOJO {


    @SerializedName("name")
    public String name;
    @SerializedName("products")
    public Products products;

    public static class Current_weather {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Forecast_5days {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Forecast_16days {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class History {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Uv_index {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Stations {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Air_pollution {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Weather_alerts {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class History_bulk {
        @SerializedName("docs")
        public String docs;
        @SerializedName("samples")
        public List<String> samples;
    }

    public static class Products {
        @SerializedName("current_weather")
        public Current_weather current_weather;
        @SerializedName("forecast_5days")
        public Forecast_5days forecast_5days;
        @SerializedName("forecast_16days")
        public Forecast_16days forecast_16days;
        @SerializedName("history")
        public History history;
        @SerializedName("uv_index")
        public Uv_index uv_index;
        @SerializedName("stations")
        public Stations stations;
        @SerializedName("air_pollution")
        public Air_pollution air_pollution;
        @SerializedName("weather_alerts")
        public Weather_alerts weather_alerts;
        @SerializedName("history_bulk")
        public History_bulk history_bulk;
    }
}
