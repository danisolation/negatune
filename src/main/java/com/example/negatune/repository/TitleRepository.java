package com.example.negatune.repository;

import com.example.negatune.model.Title;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TitleRepository extends MongoRepository<Title, String> {
}
