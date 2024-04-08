package com.example.demo.Controller;

import com.example.demo.Service.GarageService;
import com.example.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class GarageController {
    @Autowired
    private GarageService garageService;

    @RequestMapping("/car/{id}")
    public Car getcat(@PathVariable long id){
        return garageService.getcars(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/car/{id}")
    public void deletecar(@PathVariable long id){
         garageService.deletecar(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/cars")
    public void addcar(@RequestBody  Car car){
        garageService.addcar(car);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/car/{id}")
    public void updatecar(@RequestBody  Car car, @PathVariable long id){
        garageService.update(car,id);
    }
}
