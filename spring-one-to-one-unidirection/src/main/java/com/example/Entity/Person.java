package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aadhar_id")
	private Aadhar aadhar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String email, Aadhar aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", aadhar=" + aadhar + "]";
	}
	
	

}
