package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private int quantity;

    public Security() {

    }

    public Security(Portfolio portfolio, String name, String category, LocalDate purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }


    public Long getId() { return id; }
    public Portfolio getPortfolio() { return portfolio; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public BigDecimal getPurchasePrice() { return purchasePrice; }
    public int getQuantity() { return quantity; }

    public void setPortfolio (Portfolio portfolio) { this.portfolio = portfolio; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(BigDecimal purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

}
