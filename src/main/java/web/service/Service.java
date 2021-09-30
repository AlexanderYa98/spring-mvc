package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class Service {
    List<Car> cars = new ArrayList<>();
    public  Service() {
        cars.add(new Car("Toyota", 123, 2));
        cars.add(new Car("Nissan", 371, 2));
        cars.add(new Car("Honda", 373, 2));
        cars.add(new Car("BMW", 781, 3));
        cars.add(new Car("Subaru", 133, 3));
    }

    public List<Car> getNumberOfCars(int count) {
        cars = cars.stream().limit(count).collect(Collectors.toList());
        return cars;
    }


}
