package com.example.makeapi.port.adapter;

import com.example.makeapi.domain.model.CustomModel;
import com.example.makeapi.domain.model.Field;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class RepositoryTest {

    @Autowired
    private CustomModelRepository repository;

    @Test
    public void test() {
//        Field field = new Field("string");
//		Field intField = new Field("integer");
//
//		List<Field> fieldList = new ArrayList<>();
//		fieldList.add(field);
//		fieldList.add(intField);
//        CustomModel customModel = new CustomModel(ObjectId.get(), fieldList);
//
//		CustomModel returnCustomModel = repository.save(customModel);
//        System.out.println(returnCustomModel.get_id());


        CustomModel customModel = repository.findBy_id("5decbb74ff772d406d16893f");
        for (Field field :customModel.getFieldList()){
            System.out.println(field.getType());
            System.out.println(field.getValue());
        }
    }
}
