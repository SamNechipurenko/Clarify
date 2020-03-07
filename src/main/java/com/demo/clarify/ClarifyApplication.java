package com.demo.clarify;

import clarifai2.dto.prediction.Concept;
import com.demo.clarify.service.ClarifyPredictionClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClarifyApplication {

    public static void main(String[] args) {
        //for ( Concept concept : (new ClarifyPredictionClient()).getConcepts()) {
        //    System.out.println("name: " + concept.name() + " value: " + concept.value());
        //}
        SpringApplication.run(ClarifyApplication.class, args);
    }

}
