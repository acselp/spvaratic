package com.spvaratic.counter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumption")
public class ConsumptionController {

        @RequestMapping("/")
        public String index() {
            return "index consumption";
        }
}
