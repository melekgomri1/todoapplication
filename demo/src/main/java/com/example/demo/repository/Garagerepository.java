package com.example.demo.repository;

import com.example.demo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Garagerepository extends JpaRepository<Car,Long> {
}
