package com.formation.lab.resource;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
public class QuoteResource {

  @JsonProperty("01. symbol")
  private String symbol;

  @JsonProperty("02. open")
  private BigDecimal open;

  @JsonProperty("03. high")
  private BigDecimal high;

  @JsonProperty("04. low")
  private BigDecimal low;

  @JsonProperty("05. price")
  private BigDecimal price;

  @JsonProperty("06. volume")
  private BigInteger volume;

  @JsonProperty("07. latest trading day")
  private LocalDate latestTradingDay;

  @JsonProperty("08. previous close")
  private BigDecimal previousClose;

  @JsonProperty("09. change")
  private BigDecimal change;

  @JsonProperty("10. change percent")
  private String changePercent;
}
