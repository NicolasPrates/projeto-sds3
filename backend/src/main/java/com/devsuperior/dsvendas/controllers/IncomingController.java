package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.IncomingDTO;
import com.devsuperior.dsvendas.dto.IncomingSumDTO;
import com.devsuperior.dsvendas.services.IncomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Incomings")
public class IncomingController {

    @Autowired
    private IncomingService service;

    @GetMapping
    public ResponseEntity<Page<IncomingDTO>> findAll(Pageable pageable){
        Page<IncomingDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-month")
    public ResponseEntity<List<IncomingSumDTO>> amountGroupBySeller(){
        List<IncomingSumDTO> list = service.amountGroupedByMonthlyFinances();
        return ResponseEntity.ok(list);
    }
}
