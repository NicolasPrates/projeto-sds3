package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.MonthlyFinances;

public class CardInvoiceSumDTO {
    private static final long serialVersionUID = 1L;
    private String month;
    private Double invoiceSum;

    public CardInvoiceSumDTO() {
    }

    public CardInvoiceSumDTO(MonthlyFinances monthlyFinances, Double sum) {
        this.month = monthlyFinances.getData().toString();
        this.invoiceSum = sum;
    }

    public String getExpenseName() {
        return month;
    }

    public void setExpenseName(String month) {
        this.month = month;
    }

    public Double getSum() {
        return invoiceSum;
    }

    public void setSum(Double sum) {
        this.invoiceSum = sum;
    }
}
