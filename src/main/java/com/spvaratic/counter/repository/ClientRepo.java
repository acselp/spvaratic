package com.spvaratic.counter.repository;

import com.spvaratic.counter.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Integer> {
}
