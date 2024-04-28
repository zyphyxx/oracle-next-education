package com.example.springframework.services;

public interface IdataConverter {

    <T> T getData (String json, Class<T> classe );
}
