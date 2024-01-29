package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String phnum;
	private String address;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "uspro")
	private User user;
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(int id, String phnum, String address, User user) {
		super();
		this.id = id;
		this.phnum = phnum;
		this.address = address;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
}
