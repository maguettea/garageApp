package com.spring.garageApp.controller;

import com.spring.garageApp.model.Car;
import com.spring.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GarageController {
    @Autowired
    private GarageService garageService;
     @RequestMapping("/cars")
    public List<Car> getCarD(){
       return  garageService.getCars();
    }
}
