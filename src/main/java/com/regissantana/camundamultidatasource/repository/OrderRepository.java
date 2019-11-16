package com.regissantana.camundamultidatasource.repository;

import com.regissantana.camundamultidatasource.repository.collection.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
