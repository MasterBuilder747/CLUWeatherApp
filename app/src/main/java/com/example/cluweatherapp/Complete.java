package com.example.cluweatherapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Complete {
    Coordinates coord;
    Weather[] weather;
    String base;
    Main main;
    Rain rain;
    int visibility;
    Wind wind;
    Clouds clouds;
    long dt;
    Sys sys;
    long id;
    String name;
    int cod;
    @JsonCreator
    public Complete(@JsonProperty("coord") Coordinates coord, @JsonProperty("weather") Weather[] weather,@JsonProperty("base") String base,
                    @JsonProperty("main") Main main, @JsonProperty("rain") Rain rain, @JsonProperty("visibility") int visibility,@JsonProperty("wind") Wind wind,
                    @JsonProperty("clouds") Clouds clouds,@JsonProperty("dt") long dt,@JsonProperty("sys") Sys sys,@JsonProperty("id") long id,
                    @JsonProperty("name") String name,@JsonProperty("cod") int cod){
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public long getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }
}
