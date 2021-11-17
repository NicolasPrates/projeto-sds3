package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.MonthlyFinances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyFinancesRepository extends JpaRepository<MonthlyFinances, Long> {
}
