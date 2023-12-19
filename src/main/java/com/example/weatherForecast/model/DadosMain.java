package com.example.weatherForecast.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosMain(
    @JsonAlias("temp") Double temperaturaAtual,
    @JsonAlias("temp_min") Double minima,
    @JsonAlias("temp_max") Double maxima,
    @JsonAlias("feels_like") Double sensacaoTermica)
 {
    
}
