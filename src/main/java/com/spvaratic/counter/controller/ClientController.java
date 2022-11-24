package com.spvaratic.counter.controller;

import com.spvaratic.counter.entity.Client;
import com.spvaratic.counter.repository.ClientRepo;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public void add(@RequestBody String fname, String lname, Integer nr_cont, Integer nr_contor, Integer nr_persoane) {
        Client client = new Client();
        client.setFname(fname);
        client.setLname(lname);
        client.setNrCont(nr_cont);
        client.setNrContor(nr_contor);
        client.setNrPersoane(nr_persoane);


        clientRepo.save(client);


    }
}
