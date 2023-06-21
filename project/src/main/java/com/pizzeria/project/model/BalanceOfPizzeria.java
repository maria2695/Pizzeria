package com.pizzeria.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="balanceOfPizzeria")
public class BalanceOfPizzeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
