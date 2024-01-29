package com.example.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	@OneToOne
	@JoinColumn(name="user_id")
	@JsonIgnoreProperties("address")
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String street, String city, String state, String zip, String country, User user) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + ", user=" + user + "]";
	}
	

}
