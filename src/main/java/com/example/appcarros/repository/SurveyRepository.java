package com.example.appcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appcarros.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{
    
}
