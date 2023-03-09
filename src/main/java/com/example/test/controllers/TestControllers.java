package com.example.test.controllers;

import com.example.test.entities.Crystals;
import com.example.test.entities.Yeast;
import com.example.test.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/tests")
public class TestControllers {

    @Autowired
    TestServices testServices;

    @PostMapping(value = "/create/yeast")
    public String createYeastTest(@RequestBody Yeast yeast){
        return  testServices.CreateYeastTest(yeast);
    }


    @PostMapping(value = "/create/crystals")
    public String createCrystalTest(@RequestBody Crystals crystals){
        return  testServices.CreateCrystalTest(crystals);
    }

    @GetMapping ( value="/get/all/test")
        public Map<String,Object> getAllTest(){
        return testServices.getAllTests();
        }
}
