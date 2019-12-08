package com.example.makeapi.domain.model;

public class Field {

    private String type;
    private String key;
    private Object value;

    public Field(String type, String key, Object value){
        this.type = type;
        this.key = key;
        this.value = value;
    }

    public Field(String type, String key){
        this.type = type;
        this.key = key;
        this.value = autoGenerateValue(type);
    }
    public Field(){

    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object autoGenerateValue(String type){
        if (type.equals("string")){
            return "random_value";
        }else if(type.equals("integer")){
            return 0;
        }else if(type.equals("float")){
            return 1.1;
        }else if(type.startsWith("array")){
            // type_모델 이름으로 가자
            // _
            return null;
        }else{
            // 모델찾기.
            return null;
        }
    }
}
