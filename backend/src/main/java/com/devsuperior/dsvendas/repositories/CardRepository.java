package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dto.CardInvoiceSumDTO;
import com.devsuperior.dsvendas.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends JpaRepository <Card, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dto.CardInvoiceSumDTO(obj.monthlyFinances, SUM(obj.fatura_atual)) FROM Card AS obj GROUP BY obj.monthlyFinances ")
    List<CardInvoiceSumDTO> amountGroupedByMonthlyFinances();
}
