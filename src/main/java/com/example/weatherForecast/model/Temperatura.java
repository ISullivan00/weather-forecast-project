package com.example.weatherForecast.model;

import java.util.List;

public class Temperatura {
    private Double temperaturaAtual;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;
    private Double sensacaoTermica;
    private String condicao;

   
    public Temperatura( DadosMain dadosMain, List<DadosWeather> list) {
        this.temperaturaAtual = dadosMain.temperaturaAtual();
        this.temperaturaMinima = dadosMain.minima();
        this.temperaturaMaxima = dadosMain.maxima();
        this.sensacaoTermica = dadosMain.sensacaoTermica();
        this.condicao = list.get(0).condicao();
    }
    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }
    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }
    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }
    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    public Double getSensacaoTermica() {
        return sensacaoTermica;
    }
    public void setSensacaoTermica(Double sensacaoTermica) {
        this.sensacaoTermica = sensacaoTermica;
    }
    public String getCondicao() {
        return condicao;
    }
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    @Override
    public String toString() {
        return "Temperatura atual = " + temperaturaAtual  + "\nTemperatura minima = " + temperaturaMinima
                + "\nTemperatura maxima = " + temperaturaMaxima + "\nSensacao termica = " + sensacaoTermica + 
                 "\nCondição do tempo = " + condicao;
    }
    
    
}
