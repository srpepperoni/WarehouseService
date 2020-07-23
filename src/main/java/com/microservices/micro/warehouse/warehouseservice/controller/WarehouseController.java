package com.microservices.micro.warehouse.warehouseservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
	
	@GetMapping(value="/test")
	public String test() {
		return "Hello World from Warehouse Service";
	}

}
