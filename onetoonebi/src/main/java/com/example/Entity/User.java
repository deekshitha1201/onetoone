package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="uname")
	private String name;
	@Column(name="uemail")
	private String email;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="up_id")
    private UserProfile uspro;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, UserProfile uspro) {
		super();
		this.name = name;
		this.email = email;
		this.uspro = uspro;
	}
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
	public UserProfile getUspro() {
		return uspro;
	}
	public void setUspro(UserProfile uspro) {
		this.uspro = uspro;
	}
    
}
