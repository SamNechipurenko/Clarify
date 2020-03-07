package com.demo.clarify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Food {
    private List<Outputs> outputs;

    public List<Outputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Outputs> outputs) {
        this.outputs = outputs;
    }
}
