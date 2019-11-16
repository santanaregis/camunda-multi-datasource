package com.regissantana.camundamultidatasource.repository.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {

    @Id
    private String id;
    private String description;
}
