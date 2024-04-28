package com.example.springframework;

import com.example.springframework.services.ApiOmdb;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringFrameworkApplication implements CommandLineRunner {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(SpringFrameworkApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {

        ApiOmdb apiOmdb = new ApiOmdb();
        String name = "Matrix";

        try {

            apiOmdb.searchMovie(name);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
