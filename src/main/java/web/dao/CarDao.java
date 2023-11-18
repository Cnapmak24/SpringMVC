package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars(int count);
}
