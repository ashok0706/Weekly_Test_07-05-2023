package com.geekster.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.ecommerce.models.Orderr;
@Repository
public interface OrderDao extends JpaRepository<Orderr , Integer> {

}
