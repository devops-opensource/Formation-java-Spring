package com.formation.lab.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "deal")
@Data
public class Deal extends BaseJpaEntity {

  @Column
  private Date date;

  @Column
  private Long quantity;

  @Column
  private String symbol;

  @Column
  private double unityPrice;

  @Column
  private String companyName;

  @ManyToOne
  private User user;

}
