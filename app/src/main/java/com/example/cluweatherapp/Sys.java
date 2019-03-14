package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys {
    int type, id;
    double message;
    String country;
    long sunrise, sunset;
    @JsonCreator
    public Sys( @JsonProperty("type") int type, @JsonProperty("id") int id, @JsonProperty("message") double message,
                @JsonProperty("country") String country, @JsonProperty("sunrise") long sunrise, @JsonProperty("sunset") long sunset){
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}
