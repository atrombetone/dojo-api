package com.ciandt.dojoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciandt.dojoapi.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
