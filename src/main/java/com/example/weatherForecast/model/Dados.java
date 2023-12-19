package com.example.weatherForecast.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Dados(
                    @JsonAlias("main") DadosMain dadosMain,
                   @JsonAlias("weather")List<DadosWeather> dadosWeather){
                                 
}
    

