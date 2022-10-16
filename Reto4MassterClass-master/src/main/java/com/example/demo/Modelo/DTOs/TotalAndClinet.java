package com.example.demo.Modelo.DTOs;

import com.example.demo.Modelo.Client;

public class TotalAndClinet {
    private Long total;
    private Client client;

    public TotalAndClinet(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
