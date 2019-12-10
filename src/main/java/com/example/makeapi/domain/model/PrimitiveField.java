package com.example.makeapi.domain.model;

public class PrimitiveField extends Field {

    public PrimitiveField(String type, String key, String value){
        this.setType(type);
        this.setValue(value);
        this.setKey(key);
    }
}
