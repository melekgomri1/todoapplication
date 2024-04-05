package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class Car {
   public enum Color{
        red,
        blue,
        green
    }
    private String model;
    private  String brand;
    private int year;
    private Color color;

    public Car(String model, String brand, int year, Color color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }
}
