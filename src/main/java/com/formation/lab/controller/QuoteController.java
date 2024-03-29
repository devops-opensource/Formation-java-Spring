package com.formation.lab.controller;

import com.formation.lab.resource.QuoteResource;
import com.formation.lab.service.QuoteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {


  private final QuoteService quoteService;

  public QuoteController(QuoteService quoteService) {
    this.quoteService = quoteService;
  }

  @GetMapping("/{ticker}")
  public QuoteResource getQuote(@PathVariable String ticker){
    return quoteService.getQuote(ticker);
  }
}
