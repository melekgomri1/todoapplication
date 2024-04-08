package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Car {
   public enum Color{
        red,
        blue,
        green
    }
    @Id
    private long id;
    private String model;
    private  String brand;
    private int year;
    private Color color;

    public Car(long id, String model, String brand, int year, Color color) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public Car() {
    }
}
