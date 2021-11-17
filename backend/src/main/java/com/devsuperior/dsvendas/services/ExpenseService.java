package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.*;
import com.devsuperior.dsvendas.entities.Expense;
import com.devsuperior.dsvendas.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    @Transactional(readOnly = true)
    public Page<ExpenseDTO> findAll(Pageable pageable){
        repository.findAll();
        Page<Expense> result = repository.findAll(pageable);
        return result.map(x -> new ExpenseDTO(x));
    }

    @Transactional(readOnly = true)
    public List<ExpenseSumDTO> amountGroupedByMonthlyFinances() {
        return repository.amountGroupedByMonthlyFinances();
    }

}
