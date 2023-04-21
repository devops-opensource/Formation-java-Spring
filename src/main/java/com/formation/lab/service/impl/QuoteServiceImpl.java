package com.formation.lab.service.impl;

import com.formation.lab.resource.QuoteResource;
import com.formation.lab.service.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class QuoteServiceImpl implements QuoteService {

  @Autowired
  WebClient webClient;

  @Value("${alphaVantagePath}")
  private String alphaVantagePath;

  @Value("${token}")
  private String token;

  @Override
  public QuoteResource getQuote(String ticker) {
    QuoteResource quote = webClient.get()
            .uri(
                    uriBuilder -> uriBuilder.queryParam("function", "GLOBAL_QUOTE")
                            .queryParam("symbol", ticker)
                            .queryParam("apikey", token).build())
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<Map<String, QuoteResource>>() {
            })
            .block()
            .get("Global Quote");
    return quote;

  }
}
