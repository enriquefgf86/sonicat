package com.example.test.services;

import com.example.test.entities.Crystals;
import com.example.test.entities.Yeast;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Component
public interface TestServices {

    String CreateCrystalTest(@RequestBody Crystals crystalData);
    String CreateYeastTest(@RequestBody Yeast yeastData);

    Map<String, Object> getAllTests();

}
