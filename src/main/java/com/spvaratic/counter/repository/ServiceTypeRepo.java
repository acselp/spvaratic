package com.spvaratic.counter.repository;

import com.spvaratic.counter.entity.ServiceType;
import org.springframework.data.repository.CrudRepository;

public interface ServiceTypeRepo extends CrudRepository<ServiceType, Integer> {
}
