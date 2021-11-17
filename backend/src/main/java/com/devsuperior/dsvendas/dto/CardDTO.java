package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Card;

import java.io.Serializable;
import java.util.Date;

public class CardDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double balance;
    private Double current_invoice;
    private Double total_invoice;
    private Double interest_rate;
    private Double taxa_banco;
    private Date due_date;
    private Date closing_date;

    public CardDTO() {
    }

    public CardDTO(Long id, String name,
                   Double balance, Double current_invoice,
                   Double total_invoice, Double interest_rate,
                   Double taxa_banco, Date due_date,
                   Date closing_date) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.current_invoice = current_invoice;
        this.total_invoice = total_invoice;
        this.interest_rate = interest_rate;
        this.taxa_banco = taxa_banco;
        this.due_date = due_date;
        this.closing_date = closing_date;
    }

    public CardDTO(Card card) {
        id = card.getId();
        name = card.getName();
        balance = card.getSaldo();
        current_invoice = card.getFatura_atual();
        total_invoice = card.getFatura_total();
        interest_rate = card.getTaxa_juros();
        taxa_banco = card.getTaxa_banco();
        due_date = card.getVencimento();
        closing_date = card.getFechamento();
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getCurrent_invoice() {
        return current_invoice;
    }

    public void setCurrent_invoice(Double current_invoice) {
        this.current_invoice = current_invoice;
    }

    public Double getTotal_invoice() {
        return total_invoice;
    }

    public void setTotal_invoice(Double total_invoice) {
        this.total_invoice = total_invoice;
    }

    public Double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(Double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Double getTaxa_banco() {
        return taxa_banco;
    }

    public void setTaxa_banco(Double taxa_banco) {
        this.taxa_banco = taxa_banco;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Date getClosing_date() {
        return closing_date;
    }

    public void setClosing_date(Date closing_date) {
        this.closing_date = closing_date;
    }
}
