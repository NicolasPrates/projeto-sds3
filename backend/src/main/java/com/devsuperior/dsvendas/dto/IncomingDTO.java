package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Incoming;

import java.io.Serializable;
import java.util.Date;

public class IncomingDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double expected_amount;
    private Double real_amount;
    private Date date;

    public IncomingDTO() {
    }

    public IncomingDTO(Long id, String name,
                      Double expected_amount,
                      Double real_amount,
                      Date date) {
        this.id = id;
        this.name = name;
        this.expected_amount = expected_amount;
        this.real_amount = real_amount;
        this.date = date;
    }

    public IncomingDTO(Incoming incoming) {
        id = incoming.getId();
        name = incoming.getName();
        expected_amount = incoming.getValor_esperado();
        real_amount = incoming.getValor_real();
        date = incoming.getData();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getExpected_amount() {
        return expected_amount;
    }

    public void setExpected_amount(Double expected_amount) {
        this.expected_amount = expected_amount;
    }

    public Double getReal_amount() {
        return real_amount;
    }

    public void setReal_amount(Double real_amount) {
        this.real_amount = real_amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
