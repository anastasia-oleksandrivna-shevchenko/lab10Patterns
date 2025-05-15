package task4.replaceArrayWithObject;

import java.util.ArrayList;
import java.util.List;

public class CarData {
    private List<Car> cars;
    public CarData(List<Car> cars) {
        this.cars = cars;
    }

    public void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
