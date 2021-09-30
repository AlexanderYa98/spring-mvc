package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;


@Controller
public class CarsController {

    @Autowired
    private Service service;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "4") int count, ModelMap model) {
        model.addAttribute("messages", service.getNumberOfCars(count));
        return "cars";
    }

}
