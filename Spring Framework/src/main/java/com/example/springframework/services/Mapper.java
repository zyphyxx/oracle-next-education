package com.example.springframework.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper implements IdataConverter {

    @Override
    public  <T> T getData(String json, Class<T> classe) {
         ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json,classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
