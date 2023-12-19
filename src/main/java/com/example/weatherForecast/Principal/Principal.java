package com.example.weatherForecast.Principal;


import java.util.Scanner;

import com.example.weatherForecast.model.Dados;
import com.example.weatherForecast.model.Temperatura;
import com.example.weatherForecast.service.ConsumoApi;
import com.example.weatherForecast.service.ConverteDados;

public class Principal {  
    private final String URL_BASE = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String API_KEY = "&appid=6cbe1fe8d1aec6fb7f15908dc606e614&units=metric&lang=pt_br";

    private Scanner leitura = new Scanner(System.in);
    private ConverteDados conversor = new ConverteDados();
    private ConsumoApi consumo = new ConsumoApi();
    
    public void exibeMenu(){
        System.out.println("Digite o nome da cidade para ver as informações: ");
        var nomeCidade = leitura.nextLine();
        var json = consumo.obterDados(URL_BASE + nomeCidade.replace(" ", "+") + API_KEY);
        Dados dados = conversor.obterDados(json, Dados.class);
        System.out.println("Obtendo dados da previsão do tempo para " + nomeCidade + "...");           
        Temperatura temperatura = new Temperatura(dados.dadosMain(), dados.dadosWeather());
        System.out.println(temperatura);
        }
    } 