package com.example.makeapi.domain.model;

public abstract class Field {

    private String type;
    private String key;
    private String value;

    public Field(String type, String key, String value){
        this.type = type;
        this.key = key;
        this.value = value;
    }

    public Field(String type, String key){
        this.type = type;
        this.key = key;
    }
    public Field(){

    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
