package com.demo.clarify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Input {

    private InputData data;

    public InputData getData() {
        return data;
    }

    public void setData(InputData data) {
        this.data = data;
    }

}
