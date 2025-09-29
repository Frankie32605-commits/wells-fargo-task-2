package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    public FinancialAdvisor() {

    }

    public FinancialAdvisor(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

}
