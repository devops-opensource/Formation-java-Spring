package com.formation.lab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
