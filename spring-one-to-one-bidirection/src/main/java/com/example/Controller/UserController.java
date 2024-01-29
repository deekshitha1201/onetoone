package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Address;
import com.example.Entity.User;
import com.example.Repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository up;
	@PostMapping("/us")
	public ResponseEntity<User>userrecords(@RequestBody User user){
		Address a=user.getAddress();
		a.setUser(user);
		User saveUser=up.save(user);
		return new ResponseEntity<User>(saveUser,HttpStatus.CREATED);
		
	}
	

}
