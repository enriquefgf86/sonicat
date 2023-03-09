package com.example.test.servicesImpl;

import com.example.test.dto.DTOs;
import com.example.test.entities.Crystals;
import com.example.test.entities.Yeast;
import com.example.test.repositories.CrystalsRepo;
import com.example.test.repositories.YeastRepo;
import com.example.test.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestImplementation implements TestServices {

    @Autowired
    YeastRepo yeastRepo;

    @Autowired
    CrystalsRepo crystalsRepo;

    @Autowired
    DTOs dtOs;

    @Override
    public String CreateCrystalTest(Crystals crystalData) {

        crystalData.setType(crystalData.getType());
        crystalData.setNumberCrystals(crystalData.getNumberCrystals());
        crystalData.setName(crystalData.getName());
        crystalData.setMeanSize(crystalData.getMeanSize());
        crystalData.setIdentifier(crystalData.getIdentifier());

        crystalsRepo.save(crystalData);
        return "Crystal test Created";
    }

    @Override
    public String CreateYeastTest(Yeast yeastData) {

        yeastData.setName(yeastData.getName());
        yeastData.setType(yeastData.getType());
        yeastData.setIdentifier(yeastData.getIdentifier());
        yeastData.setNumberYeasts(yeastData.getNumberYeasts());
        yeastData.setSampleWeight(yeastData.getSampleWeight());

        yeastRepo.save(yeastData);

        return "Yeast test Created";
    }

    @Override
    public Map<String, Object> getAllTests() {

        List<Yeast> foundYeast = yeastRepo.findAll();

        List<Crystals> foundCrystals = crystalsRepo.findAll();

        return dtOs.GetAllTests(foundYeast, foundCrystals);
    }
}
