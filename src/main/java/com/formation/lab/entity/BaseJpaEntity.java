package com.formation.lab.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseJpaEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
}
