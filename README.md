<h1 align = "center"> Weekly Test [ 07-05-2023 ] </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
  
<!-- <a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a> -->
</p>
   
This project is a basic web application that allows Users  manage Order , Products and their  Address details. Users can do basic CRUD operation on these models List .  

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* Lombok
* Validation
* MySQL


<!-- <br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br> -->

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Address Model
```
 	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String landmark;
	private String phoneNumber;
	private String zipcode;
	private String state;
```

<!-- ```
* Stack Type
    FMCG,
    IT,
    HEALTH
``` -->

<!-- * AppointmentKey Model
```
appId = Long
LocalDateTime : Timestamp
```

* Authentication Token 
```
tokenId : Long
token : string
tokenCreationDate : LocalDate
@OneToOne 
Patient : patient
```
-->
* Order  Model
```
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private Integer userID;
	 private Integer productID;
	 private Integer productQuantity ;
```

* Product Model 
```
  	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String price;
    //todo use  - ENUM instead of String...to get fixed types of category...your choice !!
    private String category;
    
    private String brand;
```
* Users Model 
```
  	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
    private String name;
    
    private String email;
    private String password;
```
<!-- * Specialization 
```
    ENT,
    ORTHO,
    GYNO,
    NEURO,
    DERMO 
``` 
-->
## Data Flow

1. The Users at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the User.

---

<br>


## API End Points 

The following endpoints are available in the API:

* Employee Controller:
```
1. @PostMapping("/Createusers") : Create users
2.  @PostMapping("/Createproducts") :  Create products
3. @PostMapping("/CreateAddress") : Create Address
4. @PostMapping("/Createorder") : Place an order (Create Order)  using userId, productId, addressId

5. @GetMapping("/orderbyId/{id}") : Get order by order id
6. @GetMapping("/getuserbyId/{id}") : Get user by userid
7. @GetMapping("/getallProducts") : Get all products
    
8. @DeleteMapping("/deleteProductByid/{id}") : delete products based on product id.
```

<!-- * Address Controller
```
GET /addresses - get all addresses
GET /addresses/{id} - get an address by id
POST /addresses - create a new address
PUT /addresses/{id} - update an address by id
DELETE /addresses/{id} - delete an address by id

 ``` -->
 
 <!-- * Patient Controller:
```
POST /patient/signup:patient a new Doctor accout    
POST /patient/signin: the excisting patient login in to is accouct
GET /doctor: Return available Doctor`s  Appointments
DELETE/appointment : Delete patient Appointment
```   -->
<br>

## DataBase Used
* Mysql database
```
We have used Persistent database to implement CRUD Operations.

spring.datasource.url = jdbc:mysql://localhost:3306/ashok
spring.datasource.username = root
spring.datasource.password =Ashok@1234
spring.datasource.driverClassName =com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddlAuto = update


```
---
<br>

## Project Summary

This project is a basic web application that allows Users  manage Products  address and Order  . Users can do basic CRUD operation on Thses Lists  . 



## Author

👤 **Ashok Yelagandula**

* GitHub: [AshokYelagandula](https://github.com/ashok0706)

<!-- * LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/) -->
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
<!-- ## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed. -->
    
---
