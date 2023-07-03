package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.database.*;
import com.example.demo.Respository.AdminRestaurantsEditRepository;

@Service
public class AdminEditRestaurantService {

	   @Autowired
	    private AdminRestaurantsEditRepository restaurantRepository;

	    public List<AdminRestaurant> getAllMenuItems() {
	        return restaurantRepository.findAll();
	    }

	    
	    public AdminRestaurant getMenuItemById(Long id) {
	        return restaurantRepository.findById(id).orElse(null);
	    }

	  
	    public void saveMenuItem(AdminRestaurant menuItem) {
	        restaurantRepository.save(menuItem);
	    }

	
	    public void deleteMenuItem(Long id) {
	        restaurantRepository.deleteById(id);
	    }
}
