package com.example.negatune.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "chapters")
public class Chapter {
    @Id
    private String chapterId;
    private String titleId;
    private int view;
    private int chapNumber;
}
