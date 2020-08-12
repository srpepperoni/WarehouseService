package com.microservices.micro.warehouse.warehouseservice.consumer;

import org.springframework.stereotype.Service;

@Service
public class WarehouseMessageHandler {
	
	public void handleStockCounterMessage(String messageBody){
		System.out.println("HandleMessage!!!");
		System.out.println(messageBody);
    }

}
