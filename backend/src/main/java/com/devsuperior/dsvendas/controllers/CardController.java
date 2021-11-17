package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.CardDTO;
import com.devsuperior.dsvendas.dto.CardInvoiceSumDTO;
import com.devsuperior.dsvendas.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Cards")
public class CardController {

    @Autowired
    private CardService service;

    @GetMapping
    public ResponseEntity<Page<CardDTO>> findAll(Pageable pageable){
        Page<CardDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/actual_invoice")
    public ResponseEntity<List<CardInvoiceSumDTO>> amountGroupBySeller(){
        List<CardInvoiceSumDTO> list = service.amountGroupedByMonthlyFinances();
        return ResponseEntity.ok(list);
    }
}
