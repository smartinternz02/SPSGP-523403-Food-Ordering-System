package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.Admin_addRestaurant_Repository;
import com.example.demo.Storage.AddRestaurant;
import com.example.demo.database.AdminRestaurant;



@Service
public class Admin_addRestaurant_Service {

	@Autowired
	private Admin_addRestaurant_Repository admin_addRestaurant;
	
	
	public boolean isnameAvailable(String name) {
	    Optional<AdminRestaurant> existingRestaurant = admin_addRestaurant.findByname(name);
	    return !existingRestaurant.isPresent();
	}


    public void addData(AddRestaurant addRestaurant) {
    	
    	
        AdminRestaurant addData = new AdminRestaurant();
       
        addData.setName(addRestaurant.getName());
        addData.setImage(addRestaurant.getImage());
        addData.setRating(addRestaurant.getRating());
       
        //Saving the data in Database
        admin_addRestaurant.save(addData);
    }
}
