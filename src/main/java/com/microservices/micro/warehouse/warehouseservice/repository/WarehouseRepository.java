package com.microservices.micro.warehouse.warehouseservice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.micro.warehouse.warehouseservice.entity.Warehouse;

@Repository
public interface WarehouseRepository extends MongoRepository<Warehouse, ObjectId>{
	Warehouse findByName(String name);
}
