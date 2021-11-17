package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dto.ExpenseDTO;
import com.devsuperior.dsvendas.dto.ExpenseSumDTO;
import com.devsuperior.dsvendas.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpenseRepository extends JpaRepository <Expense, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dto.ExpenseSumDTO(obj.monthlyFinances, SUM(obj.valor_real)) FROM Expense AS obj GROUP BY obj.monthlyFinances ")
    List<ExpenseSumDTO> amountGroupedByMonthlyFinances();

}
