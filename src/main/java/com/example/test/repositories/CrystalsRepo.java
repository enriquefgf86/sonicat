package com.example.test.repositories;

import com.example.test.entities.Crystals;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrystalsRepo extends MongoRepository<Crystals,String> {
}
