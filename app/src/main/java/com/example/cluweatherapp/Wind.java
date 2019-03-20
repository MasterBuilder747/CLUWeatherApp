package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
    double speed, deg;
    @JsonCreator
    public Wind(@JsonProperty("speed") double speed, @JsonProperty("deg") double deg){
        this.speed = speed;
        this.deg = deg;
    }
}

