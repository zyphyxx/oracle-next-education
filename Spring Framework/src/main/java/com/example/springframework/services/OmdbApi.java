package com.example.springframework.services;

import com.example.springframework.model.DataMovie;
import com.example.springframework.model.DataSeries;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class OmdbApi {

        public void searchMovie (String name) throws IOException, InterruptedException {

            String api = "https://www.omdbapi.com/?t="+name+"&apikey=c066330f";

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(api)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            Mapper mapper = new Mapper();
            DataMovie data = mapper.getData(response.body(), DataMovie.class);
            DataSeries dataSeries = mapper.getData(response.body(), DataSeries.class);
            System.out.println(data);
            System.out.println(dataSeries);

        }


}
