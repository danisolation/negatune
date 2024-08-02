package com.example.negatune.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "comments")
public class Comment {
    @Id
    private String commentId;
    private String chapterId;
    private String userId;
    private String content;
    private Date createdAt;
}
