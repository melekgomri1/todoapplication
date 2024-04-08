package com.example.demo.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.Garagerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GarageService {
    @Autowired
    private Garagerepository garagerepository;



    public Car getcars(long id) {
        return  garagerepository.findById(id).orElse(null);
    }

    public void deletecar(long id) {
        garagerepository.deleteById(id);
    }

    public void addcar(Car car) {
        garagerepository.save(car);
    }

    public void update(Car car, long id) {
        garagerepository.save(car);
    }
}
