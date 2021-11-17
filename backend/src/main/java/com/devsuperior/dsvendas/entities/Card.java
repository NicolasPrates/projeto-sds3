package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tb_cartao")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double saldo;
    private Double fatura_atual;
    private Double fatura_total;
    private Double taxa_juros;
    private Double taxa_banco;
    private Date vencimento;
    private Date fechamento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "card_id")
    private MonthlyFinances monthlyFinances;

    public Card(String name, Double saldo,
                Double fatura_atual, Double fatura_total,
                Double taxa_juros, Double taxa_banco,
                Date vencimento, Date fechamento,
                MonthlyFinances monthlyFinances) {
        this.name = name;
        this.saldo = saldo;
        this.fatura_atual = fatura_atual;
        this.fatura_total = fatura_total;
        this.taxa_juros = taxa_juros;
        this.taxa_banco = taxa_banco;
        this.vencimento = vencimento;
        this.fechamento = fechamento;
        this.monthlyFinances = monthlyFinances;
    }

    public Card(Long id, String name,
                Double saldo, Double fatura_atual,
                Double fatura_total, Double taxa_juros,
                Double taxa_banco, Date vencimento,
                Date fechamento,
                MonthlyFinances monthlyFinances) {
        this.id = id;
        this.name = name;
        this.saldo = saldo;
        this.fatura_atual = fatura_atual;
        this.fatura_total = fatura_total;
        this.taxa_juros = taxa_juros;
        this.taxa_banco = taxa_banco;
        this.vencimento = vencimento;
        this.fechamento = fechamento;
        this.monthlyFinances = monthlyFinances;
    }

    public Card() {
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

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double balance) {
        this.saldo = balance;
    }

    public Double getFatura_atual() {
        return fatura_atual;
    }

    public void setFatura_atual(Double current_invoice) {
        this.fatura_atual = current_invoice;
    }

    public Double getFatura_total() {
        return fatura_total;
    }

    public void setFatura_total(Double total_invoice) {
        this.fatura_total = total_invoice;
    }

    public Double getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(Double interest_rate) {
        this.taxa_juros = interest_rate;
    }

    public Double getTaxa_banco() {
        return taxa_banco;
    }

    public void setTaxa_banco(Double taxa_banco) {
        this.taxa_banco = taxa_banco;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date due_date) {
        this.vencimento = due_date;
    }

    public Date getFechamento() {
        return fechamento;
    }

    public void setFechamento(Date closing_date) {
        this.fechamento = closing_date;
    }

    public MonthlyFinances getMonthlyFinances() {
        return monthlyFinances;
    }

    public void setMonthlyFinances(MonthlyFinances monthlyFinances) {
        this.monthlyFinances = monthlyFinances;
    }
}
