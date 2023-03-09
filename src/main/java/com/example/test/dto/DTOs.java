package com.example.test.dto;

import com.example.test.entities.Crystals;
import com.example.test.entities.Yeast;
import com.example.test.repositories.CrystalsRepo;
import com.example.test.repositories.YeastRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DTOs {

    @Autowired
    YeastRepo yeastRepo;

    @Autowired
    CrystalsRepo crystalsRepo;

    private  Map<String, Object> getYeastInfo(Yeast yeast) {
        Map<String, Object> yeastInfo = new HashMap<>();

        yeastInfo.put("name",yeast.getName());
        yeastInfo.put("type", yeast.getType());
        yeastInfo.put("identifier", yeast.getIdentifier());
        yeastInfo.put("number of yeast", yeast.getNumberYeasts());
        yeastInfo.put("number concentration", yeast.getYeastsConcentration());
        yeastInfo.put("sample weight", yeast.getSampleWeight());


        return yeastInfo;
    }

    private Map<String, Object> getCrystalsInfo(Crystals crystals) {
        Map<String, Object> crystalsInfo = new HashMap<>();

       crystalsInfo.put("name",crystals.getName());
        crystalsInfo.put("type", crystals.getType());
        crystalsInfo.put("identifier", crystals.getIdentifier());
        crystalsInfo.put("number of crystals",crystals.getNumberCrystals());
        crystalsInfo.put("meansize", crystals.getMeanSize());


        return crystalsInfo;
    }

    public Map<String,Object>GetAllTests(List<Yeast> yeast, List<Crystals> crystals){
        Map<String, Object> testsInfo = new HashMap<>();

        testsInfo.put("yeast",yeast.stream().map(yeast1 -> getYeastInfo(yeast1)).collect(Collectors.toList()));
        testsInfo.put("crystals",crystals.stream().map(crystals1 -> getCrystalsInfo( crystals1)).collect(Collectors.toList()));

        return testsInfo;

    }



}
