package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.Entity.UserProfile;
import com.example.Repository.UserProfilerepository;
import com.example.Repository.Userrepository;

@SpringBootApplication
public class OnetoonebiApplication implements CommandLineRunner {
@Autowired
private Userrepository urep;
@Autowired
private UserProfilerepository uprep;
	public static void main(String[] args) {
		SpringApplication.run(OnetoonebiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u=new User();
		u.setName("deekshu");
		
		UserProfile up=new UserProfile();
		up.setAddress("vzm");
		up.setPhnum("7661073057");
		
		uprep.save(up);
		
	}

}
