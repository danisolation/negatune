package com.example.negatune.repository;

import com.example.negatune.model.Img;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImgRepository extends MongoRepository<Img, String> {
}
