package com.example.test.repositories;

import com.example.test.entities.Yeast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface YeastRepo  extends MongoRepository<Yeast,String> {
}
