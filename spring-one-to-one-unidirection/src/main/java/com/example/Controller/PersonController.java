package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Aadhar;
import com.example.Entity.Person;
import com.example.Repository.AadharRepository;
import com.example.Repository.PersonRepository;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository pr;
	@Autowired
	private AadharRepository ar;
	@PostMapping("/save")
	public String savePersonWithAadhar(@RequestBody Person person) {
		
		Aadhar aadhar=person.getAadhar();
		ar.save(aadhar);
		pr.save(person);
		return "person saved with aadhar number";
	}
}
