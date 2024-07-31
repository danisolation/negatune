package com.example.negatune.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "titles")
public class Title {
    @Id
    private String titleId;
    private String author;
    private String artist;
    private String release;
    private String status;
    private List<String> tag;
    private String country;
    private int view;
    private String description;
    private int totalChapter;
}