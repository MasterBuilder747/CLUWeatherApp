package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather{
    private int id;
    private String main;
    private String description;
    private String icon;
    @JsonCreator
    public Weather(@JsonProperty("id")int id, @JsonProperty("main") String main, @JsonProperty("description") String description, @JsonProperty("icon") String icon){
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
}

