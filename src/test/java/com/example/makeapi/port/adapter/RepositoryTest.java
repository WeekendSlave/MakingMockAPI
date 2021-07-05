package com.example.makeapi.port.adapter;

import com.example.makeapi.domain.model.CustomModel;
import com.example.makeapi.domain.model.CustomObjectField;
import com.example.makeapi.domain.model.Field;
import com.example.makeapi.domain.model.PrimitiveField;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RepositoryTest {

    @Autowired
    private CustomModelRepository repository;

    @Test
    public void test() {
        Field field1 = new PrimitiveField("string", "productName", "hoho");
        Field field2 = new PrimitiveField("integer", "id", "1");


        Field categoryField = new PrimitiveField("integer", "categoryId", "2");
        Field categoryField2 = new PrimitiveField("string", "name", "aaa");

        List<Field> categoryList = new ArrayList<>();
        categoryList.add(categoryField);
        categoryList.add(categoryField2);
        Field field3 = new CustomObjectField("custom", "categories", categoryList);

        List<Field> fieldList = new ArrayList<>();
        fieldList.add(field3);

        CustomModel customModel = new CustomModel(ObjectId.get().toHexString(), fieldList);

		CustomModel returnCustomModel = repository.save(customModel);
        System.out.println(returnCustomModel.get_id());
        
        for (Field field :customModel.getFieldList()){
            System.out.println(field.getType());
            System.out.println(field.getValue());
        }
    }
}
