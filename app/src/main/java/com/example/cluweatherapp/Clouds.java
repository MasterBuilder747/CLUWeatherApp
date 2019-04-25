package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {
    private int all;
    @JsonCreator
    public Clouds(@JsonProperty("all") int all) {
        this.all = all;
    }
}

