package com.geekster.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.ecommerce.models.Addres;
import com.geekster.ecommerce.models.Orderr;
import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.models.Users;
import com.geekster.ecommerce.repository.Address;
import com.geekster.ecommerce.repository.AddressDao;
import com.geekster.ecommerce.repository.Order;
import com.geekster.ecommerce.repository.OrderDao;
import com.geekster.ecommerce.repository.ProductDao;
import com.geekster.ecommerce.repository.UserDao;

@RestController
public class controller {

	@Autowired
	AddressDao addressDao;
	OrderDao orderDao;
	ProductDao productDao;
	UserDao userDao;
	
	
	 
	 @PostMapping("/Createusers")
	 public Users createusers(@RequestBody Users user) {
		 return userDao.save(user);
	 }
	 
	 @PostMapping("/Createproducts")
	 public Product Createproduct(@RequestBody Product product) {
		 return productDao.save(product);
	 }
	
	 @PostMapping("/CreateAddress")
	 public Addres Createaddress(@RequestBody Addres address) {
		 return addressDao.save(address);
	 }
	
	
	@PostMapping("/Createorder")
	 public Orderr Createorder(@RequestBody Orderr order  ) {
		 return userDao.save(order);
	 }


	
	@GetMapping("/orderbyId/{id}")
	 public void getorder(@PathVariable String id ) {
		  orderDao.findById(Integer.parseInt(id)).get();
	 }
	
//	6. Get user by userid
	@GetMapping("/getuserbyId/{id}")
	 public void getuser(@PathVariable String id ) {
		  userDao.findById(Integer.parseInt(id));
	 }
	
	@GetMapping("/getallProducts")
	 public Iterable<Product> getorder( ) {
		 return productDao.findAll();
	 }
	
	@DeleteMapping("/deleteProductByid/{id}")
	 public void deleteProduct(@PathVariable  String id) {
		  productDao.deleteById(Integer.parseInt(id));
	 }
	
	
}
