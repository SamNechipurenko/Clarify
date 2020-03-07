package com.demo.clarify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Outputs {
    private Input input;
    private ConceptsData data;

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public ConceptsData getData() {
        return data;
    }

    public void setData(ConceptsData data) {
        this.data = data;
    }
}
