package com.spvaratic.counter.repository;

import com.spvaratic.counter.entity.Consumption;
import org.springframework.data.repository.CrudRepository;

public interface ConsumptionRepo extends CrudRepository<Consumption, Integer> {
}
