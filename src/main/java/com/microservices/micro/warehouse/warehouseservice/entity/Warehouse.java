package com.microservices.micro.warehouse.warehouseservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import lombok.Data;

@Data
@Document(collection = "warehouse")
public class Warehouse {
	
	@Id
    private ObjectId id;
    private String name;
    private Long stock;
    private Long dollarValue;
    private Long euroValue;
    private Long poundValue;
    private String description;

}
