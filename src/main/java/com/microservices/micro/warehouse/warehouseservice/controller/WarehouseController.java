package com.microservices.micro.warehouse.warehouseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.micro.warehouse.warehouseservice.service.WarehouseService;

@RestController
public class WarehouseController {
	
	@Autowired
	private WarehouseService service;
	
	@GetMapping(value="/test")
	public String test() {
		return "Hello World from Warehouse Service";
	}
	
	@GetMapping("/warehouse/{name}")
	public String getWarehouseByName(@PathVariable("name") String name) {
		return service.getWarehouseByName(name).toString();
	}

}
