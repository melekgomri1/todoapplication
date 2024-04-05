package com.example.demo.Controller;

import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class GarageController {
    @RequestMapping("/car")
    public Car getcar(){
        Car mycar=new Car("laguna","renaut",12,Car.Color.red);
        return mycar;
    }
}
