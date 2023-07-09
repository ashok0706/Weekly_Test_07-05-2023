package com.geekster.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.ecommerce.models.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer>{
	
}
