package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.MonthlyFinances;

import java.io.Serializable;
import java.util.Date;

public class MonthlyFinancesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Double over_balance;
    private Date date;

    public MonthlyFinancesDTO() {
    }

    public MonthlyFinancesDTO(Long id, Double over_balance, Date date) {
        this.id = id;
        this.over_balance = over_balance;
        this.date = date;
    }

    public MonthlyFinancesDTO(MonthlyFinances monthlyFinances) {
        id = monthlyFinances.getId();
        over_balance = monthlyFinances.getExcedente();
        date = monthlyFinances.getData();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getOver_balance() {
        return over_balance;
    }

    public void setOver_balance(Double over_balance) {
        this.over_balance = over_balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
