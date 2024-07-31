package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RaceService;

@RestController
@RequestMapping("/api/filter")
public class FilterController {

    @Autowired
    private RaceService raceService;

    @GetMapping("/years")
    public List<Integer> getYears() {
        return raceService.getYear();
    }

   

//    @GetMapping("/drivers")
//    public List<Driver> getDrivers() {
//        return raceService.getDrivers();
//    }
//
//    @GetMapping("/constructors")
//    public List<Constructor> getConstructors() {
//        return raceService.getConstructors();
//    }
}
