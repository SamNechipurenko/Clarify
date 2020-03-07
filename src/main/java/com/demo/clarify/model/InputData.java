package com.demo.clarify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InputData {
    private Img image;

    public Img getImage() {
        return image;
    }

    public void setImage(Img image) {
        this.image = image;
    }
}
