package com.example.springframework.services;

import com.example.springframework.dto.MovieName;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ApiOmdb {

        public void searchMovie (String name) throws IOException, InterruptedException {

            String api = "https://www.omdbapi.com/?t="+name+"&apikey=c066330f";

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(api)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());



            Gson gson = new Gson();
            System.out.println(gson.fromJson(response.body(), MovieName.class));


        }


}
