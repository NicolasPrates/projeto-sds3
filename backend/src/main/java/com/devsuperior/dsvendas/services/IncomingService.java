package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.*;
import com.devsuperior.dsvendas.entities.Incoming;
import com.devsuperior.dsvendas.repositories.IncomingRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IncomingService {

    @Autowired
    private IncomingRepository repository;

    @Transactional(readOnly = true)
    public Page<IncomingDTO> findAll(Pageable pageable){
        repository.findAll();
        Page<Incoming> result = repository.findAll(pageable);
        return result.map(x -> new IncomingDTO(x));
    }

    @Transactional(readOnly = true)
    public List<IncomingSumDTO> amountGroupedByMonthlyFinances() {
        return repository.amountGroupedByMonthlyFinances();
    }

}
