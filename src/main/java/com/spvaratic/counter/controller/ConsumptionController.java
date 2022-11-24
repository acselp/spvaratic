package com.spvaratic.counter.controller;

import com.spvaratic.counter.entity.Consumption;
import com.spvaratic.counter.repository.ConsumptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumption")
public class ConsumptionController {

    @Autowired
    ConsumptionRepo consumptionRepo;
    @GetMapping("/all")
    public List<Consumption> all() {
        List<Consumption> consumptions = (List<Consumption>) consumptionRepo.findAll();

        return consumptions;
    }

//    @PostMapping("/add")
//    public void add(@RequestBody Consumption consumption) {
//
//    }

}
