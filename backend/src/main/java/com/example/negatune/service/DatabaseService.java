package com.example.negatune.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private Environment env;

    public void printDatabaseUrl() {
        String databaseUrl = env.getProperty("spring.data.mongodb.uri");
        System.out.println("Database URL: " + databaseUrl);
    }
}
