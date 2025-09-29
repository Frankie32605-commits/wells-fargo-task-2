package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Client client;

    public Portfolio() {

    }

    public Portfolio(Client client) {
        this.client = client;
    }


    public Long getId() { return id; }
    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}
