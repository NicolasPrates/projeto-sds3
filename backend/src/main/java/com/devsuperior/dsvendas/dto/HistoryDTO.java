package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.History;

import java.io.Serializable;
import java.util.Date;

public class HistoryDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;

    public HistoryDTO() {
    }

    public HistoryDTO(History history) {
        id = history.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
