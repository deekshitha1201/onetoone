package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
	public class Addresses {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String city;
	private String country;
	private String state;
	private String street;
	private String zipcode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="order_id",referencedColumnName = "id")
	private Order order;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Addresses [id=" + id + ", city=" + city + ", country=" + country + ", state=" + state + ", street=" + street
				+ ", zipcode=" + zipcode + ", order=" + order + "]";
	}

	}

