package com.vitalii.model;

import java.util.ArrayList;
import java.util.List;

public class CarImpl {

    private List<Car> cars = new ArrayList<Car>();

    public CarImpl(int amountOfCarsToImpl) {
        for (int i = 0; i < amountOfCarsToImpl; i++) {
            cars.add(new Car("Car " + (i + 1), (i + 1), getRandNumber(70, 100), getRandNumber(4, 7)));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    private int getRandNumber(int min, int max) {

        return (int) ((Math.random() * (max - min) + min));
    }
}
