package org.itstep.helloworldspring.service;

import lombok.Data;
import org.itstep.helloworldspring.Model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public   interface CarService {
    // Save operation

    Car saveCar(Car car);

    // Read operation
    List<Car> fetchCarList();

    // Update operation
    Car updateCar(Car car, Long CarId);

    // Delete operation
    void deleteCarById(Long CarId);
}
