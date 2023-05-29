package com.example.appcarros.dto.survey;

import java.time.LocalDate;

import com.example.appcarros.StatusVistoria;

public record SurveyRequestDTO(LocalDate dataVistoria, StatusVistoria statusVistoria) {
    
}
