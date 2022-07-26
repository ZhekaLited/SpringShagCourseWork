package org.itstep.helloworldspring.service;

import org.itstep.helloworldspring.Model.Car;
import org.itstep.helloworldspring.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public  class  CarServiceI implements CarService {
    @Autowired
    private CarRepository carRepository;

    // Save operation
    @Override
    public  Car saveCar(Car car) {
        return carRepository.save(car);
    }

    // Read operation
    @Override
    public  List<Car> fetchCarList() {
        return (List<Car>) carRepository.findAll();
    }

    // Update operation
    @Override
    public Car updateCar(Car car, Long carId)
    {
        Car carDB = carRepository.findById(carId).get();

        if (Objects.nonNull(car.getCarName())
                && !"".equalsIgnoreCase(
                car.getCarName())) {
            carDB.setCarName(car.getCarName());
        }

        if (Objects.nonNull(
                car.getCarBorn())
                && !"".equalsIgnoreCase(
                car.getCarBorn())) {
            carDB.setCarBorn(
                    car.getCarBorn());
        }

        if (Objects.nonNull(car.getCarModel())
                && !"".equalsIgnoreCase(
                car.getCarModel())) {
            carDB.setCarModel(
                    car.getCarModel());
        }

        return carRepository.save(carDB);
    }

    // Delete operation
    @Override
    public void deleteCarById(Long carId)
    {
        carRepository.deleteById(carId);
    }
}
