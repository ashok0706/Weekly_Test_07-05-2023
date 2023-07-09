package com.geekster.ecommerce.models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
     
	    @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
    private String name;
    
    private String email;
    private String password;
    
   
    
   

    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
