package com.geekster.ecommerce.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String price;
    //todo use  - ENUM instead of String...to get fixed types of category...your choice !!
    private String category;
    
    private String brand;

   
}
