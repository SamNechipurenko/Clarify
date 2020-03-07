package com.demo.clarify.controller;

import clarifai2.dto.prediction.Concept;
import com.demo.clarify.model.ConceptModel;
import com.demo.clarify.service.ClarifyPredictionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClarifyController {

    @Autowired
    ClarifyPredictionClient clarifyPredictionClient;

    @GetMapping("/prediction")
    public List<ConceptModel> foodPrediction(){

        List<ConceptModel> conceptList = new ArrayList<>();

        for ( Concept concept : (new ClarifyPredictionClient()).getConcepts()) {
            ConceptModel conceptModel = new ConceptModel();
            conceptModel.setName(concept.name());
            conceptModel.setValue(concept.value());
            conceptList.add(conceptModel);
        }

        return conceptList;
    }

}
