package com.wellsfargo.counselor.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private Long securityId;

    @Column(nullable = true)
    private Long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Long quantity;

    public Security(Long portfolioId, String name, String category, Float purchasePrice, Date purchaseDate, Long quantity){
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId(){
        return this.securityId;
    }

    public Long getPortfolioId(){
        return this.portfolioId;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public Float getPurchasePrice(){
        return this.purchasePrice;
    }

    public Date getPurchasDate(){
        return this.purchaseDate;
    }

    public Long getQuantity(){
        return this.quantity;
    }

    public void setPortfolioId(Long portfolioId){
        this.portfolioId = portfolioId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setPurchasePrice(Float purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(Long quantity){
        this.quantity = quantity;
    }
}