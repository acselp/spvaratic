package com.spvaratic.counter.controller;

import com.spvaratic.counter.entity.Counter;
import com.spvaratic.counter.repository.CounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/counter")
public class CounterController {
    @Autowired
    CounterRepo counterRepo;

    @GetMapping("/")
    public String all() {
        return "counter controller";
    }

    @GetMapping("/apa_curent/{id}")
    public Optional<Counter> apaById(@RequestParam int id) {

        return counterRepo.findById(id);
    }

    @GetMapping("/apa_curent/all")
    public List<Counter> apaAll() {

        return (List<Counter>) counterRepo.findAll();
    }
}
