package com.example.demo.Restaurant_Admin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.Admin_addRestaurant_Repository;
import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.AddMenu_Repository;
import com.example.demo.Storage.AddMenu;
import com.example.demo.database.DcMenu;


@Service
public class AddMenu_Service {
	
	@Autowired
	private AddMenu_Repository admin_addMenu;
	
	
	


    public void addData(AddMenu addMenu) {
    	
    	
        DcMenu addData = new DcMenu();
       
        addData.setItem_name(addMenu.getItem_name());
        addData.setItem_image(addMenu.getItem_image());
        addData.setPrice(addMenu.getPrice());
       
        //Saving the data in Database
        admin_addMenu.save(addData);
    }

}
