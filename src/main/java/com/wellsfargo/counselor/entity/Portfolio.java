package com.wellsfargo.counselor.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = true)
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio(Date creationDate, long clientId){
        this.creationDate = creationDate;
        this.clientId = clientId;
    }

    public Long getPortfolioId(){
        return this.portfolioId;
    }

    public Long getClientId(){
        return this.clientId;
    }

    public void setClientId(Long clientId){
        this.clientId = clientId;
    }

    public Date getCreationDate(){
        return this.creationDate;
    }

    public void setCreationDate(Date date){
        this.creationDate = date;
    }

}
