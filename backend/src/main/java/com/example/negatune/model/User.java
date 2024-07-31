package com.example.negatune.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    private String userName;
    private String mail;
    private String password;
    private String phone;
    private String role;
    private List<String> history;
}
