package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository <History, Long> {
}
