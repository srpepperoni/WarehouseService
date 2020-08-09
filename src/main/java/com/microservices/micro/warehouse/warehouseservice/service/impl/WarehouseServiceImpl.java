package com.microservices.micro.warehouse.warehouseservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.micro.warehouse.warehouseservice.entity.Warehouse;
import com.microservices.micro.warehouse.warehouseservice.repository.WarehouseRepository;
import com.microservices.micro.warehouse.warehouseservice.service.WarehouseService;

@Component
public class WarehouseServiceImpl implements WarehouseService {
	
	@Autowired
	private WarehouseRepository repository;

	@Override
	public Warehouse getWarehouseByName(String name) {
		return repository.findByName(name);
	}

}
