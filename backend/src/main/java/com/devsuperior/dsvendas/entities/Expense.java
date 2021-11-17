package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_gasto")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double valor_esperado;
    private Double valor_real;
    private Date data_pagamento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "expense_id")
    private MonthlyFinances monthlyFinances;

    public Expense() {
    }

    public Expense(String name, Double valor_esperado,
                   Double valor_real, Date data_pagamento,
                   MonthlyFinances monthlyFinances) {
        this.name = name;
        this.valor_esperado = valor_esperado;
        this.valor_real = valor_real;
        this.data_pagamento = data_pagamento;
        this.monthlyFinances = monthlyFinances;
    }

    public Expense(Long id, String name,
                   Double valor_esperado, Double valor_real,
                   Date data_pagamento,
                   MonthlyFinances monthlyFinances) {
        this.id = id;
        this.name = name;
        this.valor_esperado = valor_esperado;
        this.valor_real = valor_real;
        this.data_pagamento = data_pagamento;
        this.monthlyFinances = monthlyFinances;
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

    public Double getValor_esperado() {
        return valor_esperado;
    }

    public void setValor_esperado(Double expected_amount) {
        this.valor_esperado = expected_amount;
    }

    public Double getValor_real() {
        return valor_real;
    }

    public void setValor_real(Double real_amount) {
        this.valor_real = real_amount;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date date) {
        this.data_pagamento = date;
    }

    public MonthlyFinances getMonthlyFinances() {
        return monthlyFinances;
    }

    public void setMonthlyFinances(MonthlyFinances monthlyFinances) {
        this.monthlyFinances = monthlyFinances;
    }
}
