package com.example.makeapi.domain.model;

import java.util.List;

public class CustomObjectField extends Field{

    // Predefined Custom Object Name.
    private String name;
    private List<Field> fieldList;

    public CustomObjectField(String type, String key, List<Field> fieldList){
        this.setType(type);
        this.setKey(key);
        this.setFieldList(fieldList);
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
