package com.demo.clarify.service;

import clarifai2.api.ClarifaiBuilder;
import clarifai2.api.ClarifaiClient;
import clarifai2.dto.input.ClarifaiInput;
import clarifai2.dto.prediction.Concept;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ClarifyPredictionClient {

    private RestTemplate restTemplate = new RestTemplate();

    public List<Concept> getConcepts() {

        ClarifaiClient client = new ClarifaiBuilder("b79f1fc9a7f8420c9f4eb0473a2c3b31") // API key for food
                .buildSync();

        return client.getDefaultModels().generalModel()
                   .predict()
                   .withInputs(ClarifaiInput.forImage(
                           "https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fblogs-images.forbes.com%2Frainerzitelmann%2Ffiles%2F2019%2F06%2FE0MG76-e1560965378507-1200x1270.jpg"
                   ))
                   .executeSync()
                   .get().get(0).data(); //
    }
}
