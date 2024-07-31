package com.example.negatune.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "imgs")
public class Img {
    @Id
    private String imgId;
    private byte[] data;
}
