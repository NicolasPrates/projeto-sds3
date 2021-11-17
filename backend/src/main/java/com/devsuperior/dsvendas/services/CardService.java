package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.*;
import com.devsuperior.dsvendas.entities.Card;
import com.devsuperior.dsvendas.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    @Transactional(readOnly = true)
    public Page<CardDTO> findAll(Pageable pageable){
        repository.findAll();
        Page<Card> result = repository.findAll(pageable);
        return result.map(x -> new CardDTO(x));
    }

    @Transactional(readOnly = true)
    public List<CardInvoiceSumDTO> amountGroupedByMonthlyFinances() {
        return repository.amountGroupedByMonthlyFinances();
    }

}
