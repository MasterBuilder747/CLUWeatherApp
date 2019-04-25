package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;
    @JsonCreator
    public Main(@JsonProperty("temp") double temp,@JsonProperty("pressure") int pressure,@JsonProperty("humidity") int humidity,
                @JsonProperty("temp_min") double temp_min,@JsonProperty("temp_max") double temp_max){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }
}

