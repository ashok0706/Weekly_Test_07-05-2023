package com.geekster.ecommerce.repository;


import com.geekster.ecommerce.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

  
}
