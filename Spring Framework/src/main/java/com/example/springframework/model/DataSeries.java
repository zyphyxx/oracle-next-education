package com.example.springframework.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSeries {

    @JsonAlias("Seasons")
    private Integer seasons;

    @JsonAlias("Episodes")
    private List<DataEpisode> episodes;
}
