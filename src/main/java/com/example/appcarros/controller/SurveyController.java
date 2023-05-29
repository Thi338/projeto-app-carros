package com.example.appcarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appcarros.dto.survey.SurveyRequestDTO;
import com.example.appcarros.dto.survey.SurveyResponseDTO;
import com.example.appcarros.entity.Survey;
import com.example.appcarros.repository.SurveyRepository;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyRepository repository;
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveSurvey(@RequestBody SurveyRequestDTO data) {
        Survey surveyData = new Survey(data);
        repository.save(surveyData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<SurveyResponseDTO> getAll() {
        List<SurveyResponseDTO> surveyList = repository.findAll().stream().map(SurveyResponseDTO::new).toList();
        return surveyList;
    }
}
