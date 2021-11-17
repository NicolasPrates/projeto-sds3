package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.MonthlyFinances;

import java.io.Serializable;

public class IncomingSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String month;
    private Double sum;

    public IncomingSumDTO() {
    }

    public IncomingSumDTO(MonthlyFinances monthlyFinances, Double sum) {
        this.month = monthlyFinances.getData().toString();
        this.sum = sum;
    }

    public String getIncomingName() {
        return month;
    }

    public void setIncomingName(String incomingName) {
        this.month = incomingName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
