package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dto.IncomingSumDTO;
import com.devsuperior.dsvendas.entities.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncomingRepository extends JpaRepository <Incoming, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dto.IncomingSumDTO(obj.monthlyFinances, SUM(obj.valor_real)) FROM Incoming AS obj GROUP BY obj.monthlyFinances ")
    List<IncomingSumDTO> amountGroupedByMonthlyFinances();

}
