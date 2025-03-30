package com.wellsfargo.counselor.entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio(Date creationDate, Client client){
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getPortfolioId(){
        return this.portfolioId;
    }

    public Client getClientId(){
        return this.client;
    }

    public void setClientId(Client client){
        this.client = client;
    }

    public Date getCreationDate(){
        return this.creationDate;
    }

    public void setCreationDate(Date date){
        this.creationDate = date;
    }

}
