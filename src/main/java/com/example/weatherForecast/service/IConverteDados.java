package com.example.weatherForecast.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
    

