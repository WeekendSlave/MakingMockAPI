package com.example.makeapi.domain.service;

import com.example.makeapi.domain.model.CustomModel;
import com.example.makeapi.port.adapter.CustomModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomModelService {

    private final CustomModelRepository repository;

    @Autowired
    public CustomModelService(CustomModelRepository repository){
        this.repository = repository;
    }

    public CustomModel registerCustomModel(CustomModel customModel){
        return repository.save(customModel);
    }

}
