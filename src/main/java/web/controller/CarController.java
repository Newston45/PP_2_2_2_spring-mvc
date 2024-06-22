package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carService.getCars();

        if (count != null && count < 5 && count >= 0) {
            cars = cars.subList(0, count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
