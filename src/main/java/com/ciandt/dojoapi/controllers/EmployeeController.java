package com.ciandt.dojoapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ciandt.dojoapi.entities.EmployeeEntity;
import com.ciandt.dojoapi.repositories.EmployeeRepository;

@Controller
@RequestMapping("employee/")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repo;

	@GetMapping(value = "/")
	@ResponseBody
	public List<EmployeeEntity> get() {
		return repo.findAll();
	}
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public EmployeeEntity get(@PathVariable("id") int id ) {
		return repo.findById(id).orElse(null);
	}
	
	@PostMapping(value =  "/")
	@ResponseBody
	public EmployeeEntity post(@RequestBody EmployeeEntity employee) {
		return repo.save(employee);
	}
	
}
