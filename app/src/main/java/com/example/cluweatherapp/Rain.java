package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    double oneh;
    @JsonCreator
    public Rain(@JsonProperty("1h")double oneh){
        this.oneh = oneh;
    }

}
