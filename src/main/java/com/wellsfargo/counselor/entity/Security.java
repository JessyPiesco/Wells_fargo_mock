package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private Long securityId;

    @Column(nullable = false)
    private Integer portfolioId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private Integer quantity;


    protected Security() {

    }

    public Security(Integer portfolioId, String name, String category, Double purchasePrice, LocalDate purchaseDate, Integer quantity ) {
        this.portfolioId= portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;

    }

    public Long getSecurityId() {
        return securityId;
    }

    public Integer getPortfolioId() {return portfolioId;}

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
