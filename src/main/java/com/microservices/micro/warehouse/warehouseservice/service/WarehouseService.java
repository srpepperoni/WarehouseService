package com.microservices.micro.warehouse.warehouseservice.service;

import com.microservices.micro.warehouse.warehouseservice.entity.Warehouse;

public interface WarehouseService {
	
	public Warehouse getWarehouseByName(String name);

}
