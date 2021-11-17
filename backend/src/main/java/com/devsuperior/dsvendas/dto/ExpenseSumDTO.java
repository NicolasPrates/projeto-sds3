package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Expense;
import com.devsuperior.dsvendas.entities.MonthlyFinances;

import java.util.Calendar;

public class ExpenseSumDTO {
    private static final long serialVersionUID = 1L;
    private String month;
    private Double sum;

    public ExpenseSumDTO() {
    }

    public ExpenseSumDTO(MonthlyFinances monthlyFinances, Double sum) {
        this.month = monthlyFinances.getData().toString();
        this.sum = sum;
    }

    public String getExpenseName() {
        return month;
    }

    public void setExpenseName(String expenseName) {
        this.month = expenseName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
