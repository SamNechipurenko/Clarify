package com.demo.clarify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConceptsData {
    private List<Concepts> concepts;

    public List<Concepts> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<Concepts> concepts) {
        this.concepts = concepts;
    }
}
