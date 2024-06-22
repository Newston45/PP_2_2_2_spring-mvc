package web.Repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarRepository {

    List<Car> cars = List.of(
            new Car("BMW", "3", 2013),
            new Car("Mercedes", "4", 2015),
            new Car("Audi", "5", 2016),
            new Car("Subaru", "6", 2017),
            new Car("Ford", "7", 2018),
            new Car("Honda", "8", 2019)
    );

    public List<Car> getCars() {
        return cars;
    }

}
