package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ClientData {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String accountNum;

    @Column(nullable = false)
    private String routingNum;

    @Column(nullable = false)
    private String authentication;

    public ClientData() {

    }

    public ClientData (String accountNum, String routingNum, String authentication) {
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.authentication = authentication;
    }


    public Long getId() { return id; }
    public String getAccountNum() { return accountNum; }
    public String getRoutingNum() { return routingNum; }
    public String getAuthentication() { return authentication; }

    public void setAccountNum(String accountNum) { this.accountNum = accountNum; }
    public void setRoutingNum(String routingNum) { this.routingNum = routingNum; }
    public void setAuthentication(String authentication) { this.authentication = authentication; }

}
