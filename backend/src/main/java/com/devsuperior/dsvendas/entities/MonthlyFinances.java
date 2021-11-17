package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_financas_mensais")
public class MonthlyFinances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double excedente;
    private Date data;

    @OneToMany(mappedBy = "monthlyFinances")
    private final List<Card> cards = new ArrayList<>();

    @OneToMany(mappedBy = "monthlyFinances")
    private final List<Expense> expenses = new ArrayList<>();

    @OneToMany(mappedBy = "monthlyFinances")
    private final List<Incoming> incomings = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "monthly_id", insertable = false, updatable = false)
    private History history;

    public MonthlyFinances(Double excedente, Date data, History history) {
        this.excedente = excedente;
        this.data = data;
        this.history = history;
    }

    public MonthlyFinances(Double excedente, Date data) {
        this.excedente = excedente;
        this.data = data;
    }

    public MonthlyFinances() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getExcedente() {
        return excedente;
    }

    public void setExcedente(Double over_balance) {
        this.excedente = over_balance;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date date) {
        this.data = date;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
