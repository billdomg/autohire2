package com.carrental.autohire.controller;

import com.carrental.autohire.dto.CarResponseDto;
import com.carrental.autohire.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin("*")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<CarResponseDto>> getAllCars() {
        List<CarResponseDto> cars = carService.getAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/{carId}") 
    public ResponseEntity<CarResponseDto> getCarById(@PathVariable Long carId) {
        CarResponseDto car = carService.getCarById(carId);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        } 

        // return (car != null) ? new ResponseEntity<>(car, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("unregister/{carId}")
    public ResponseEntity<String> unregisterCar(@PathVariable Long carId) {
       return new ResponseEntity<>(carService.unregisterCarById(carId), HttpStatus.OK);
    }
}
