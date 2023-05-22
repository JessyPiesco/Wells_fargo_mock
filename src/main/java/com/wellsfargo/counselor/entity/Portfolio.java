package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Column(nullable = false)
    private Integer clientId;

    @Column(nullable = false)
    private LocalDate creationDate;


    protected Portfolio() {

    }

    public Portfolio(Integer clientId, LocalDate creationDate) {
        this.clientId= clientId;
        this.creationDate = creationDate;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Integer getClientId() {return clientId;}

    public LocalDate getCreationDate() {
        return creationDate;
    }


}
