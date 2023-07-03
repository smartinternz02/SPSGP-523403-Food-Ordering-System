package com.example.demo.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.LoginRepository;
import com.example.demo.Storage.SignUpForm;
import com.example.demo.database.SignUpCustomer;

@Service
public class SignUpService {

	@Autowired
	private LoginRepository loginRepository;
	
	public boolean isUsernameAvailable(String username) 
	{
		    Optional<SignUpCustomer> existingUser = loginRepository.findByUsername(username);
		    return !existingUser.isPresent();
    }

    public void saveSignUpForm(SignUpForm signUpForm) {
    	
    	
        SignUpCustomer signUpData = new SignUpCustomer();
       
        signUpData.setName(signUpForm.getName());
        signUpData.setMobile(signUpForm.getMobile());
        signUpData.setHostel(signUpForm.getHostel());
        signUpData.setBlock(signUpForm.getBlock());
        signUpData.setUsername(signUpForm.getUsername());
        signUpData.setPassword(signUpForm.getPassword());

        //Saving the data in login Database
        loginRepository.save(signUpData);
    }
}
