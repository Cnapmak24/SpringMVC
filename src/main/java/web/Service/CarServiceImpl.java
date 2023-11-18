package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        if (count > 5) {
            count = 5;
        }
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", 5.0, "black"));
        cars.add(new Car("Lamborgini", 4.8, "yellow"));
        cars.add(new Car("Pagani", 5.2, "white"));
        cars.add(new Car("Bugatti", 5.6, "black"));
        cars.add(new Car("Lada", 1.6, "pink"));
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
