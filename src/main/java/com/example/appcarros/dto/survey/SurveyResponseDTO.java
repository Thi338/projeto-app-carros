package com.example.appcarros.dto.survey;

import java.time.LocalDate;

import com.example.appcarros.StatusVistoria;
import com.example.appcarros.entity.Survey;

public record SurveyResponseDTO(Long id, LocalDate dataVistoria, StatusVistoria statusVistoria) {
    
    public SurveyResponseDTO(Survey survey) {
        this(survey.getId(), survey.getDataVistoria(), survey.getStatusVistoria());
    }
}
