package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.ExpenseDTO;
import com.devsuperior.dsvendas.dto.ExpenseSumDTO;
import com.devsuperior.dsvendas.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public ResponseEntity<Page<ExpenseDTO>> findAll(Pageable pageable){
        Page<ExpenseDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-month")
    public ResponseEntity<List<ExpenseSumDTO>> amountGroupBySeller(){
        List<ExpenseSumDTO> list = service.amountGroupedByMonthlyFinances();
        return ResponseEntity.ok(list);
    }
}
