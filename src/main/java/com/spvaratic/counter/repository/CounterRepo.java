package com.spvaratic.counter.repository;

import com.spvaratic.counter.entity.Counter;
import org.springframework.data.repository.CrudRepository;

public interface CounterRepo extends CrudRepository<Counter, Integer> {
}
