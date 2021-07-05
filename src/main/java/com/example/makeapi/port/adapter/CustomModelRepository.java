package com.example.makeapi.port.adapter;

import com.example.makeapi.domain.model.CustomModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomModelRepository extends MongoRepository<CustomModel, String> {

    CustomModel findBy_id(String _id);
}
