package com.spvaratic.counter.controller;

import com.spvaratic.counter.entity.Client;
import com.spvaratic.counter.repository.ClientRepo;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    ClientRepo clientRepo;

    @GetMapping("/all")
    public List<Client> all() {
        List<Client> clients = (List<Client>) clientRepo.findAll();

        return clients;
    }
}
