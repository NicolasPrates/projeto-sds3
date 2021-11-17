package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_historico")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "history")
    private List<MonthlyFinances> monthlyFinances = new ArrayList<>();

    public History() {
    }

    public History(Long id, List<MonthlyFinances> monthlyFinances) {
        this.id = id;
        this.monthlyFinances = monthlyFinances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MonthlyFinances> getMonthlyFinances() {
        return monthlyFinances;
    }

    public void setMonthlyFinances(List<MonthlyFinances> monthlyFinances) {
        this.monthlyFinances = monthlyFinances;
    }
}
