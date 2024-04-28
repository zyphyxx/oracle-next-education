package com.example.springframework.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class MovieName {

    @SerializedName(value = "Title")
    private String title;

    @SerializedName(value = "Year")
    private Long year;
}
