package com.formation.lab.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebMvc
public class WebConfig {


  @Bean
  public WebClient webClient(){

    String alphaVantagePath = "https://www.alphavantage.co/query?";
    return WebClient.builder()
            .baseUrl(alphaVantagePath)
            .build();
  }
}
