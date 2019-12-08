package com.example.makeapi.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "custom_models")
public class CustomModel {

    @Id
    private String _id;
    private String name;
    List<Field> fieldList;

    public CustomModel(String _id, List<Field> fieldList){
        this._id = _id;
        this.fieldList = fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> setFieldList(){
        return fieldList;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public String get_id() { return _id; }
}
