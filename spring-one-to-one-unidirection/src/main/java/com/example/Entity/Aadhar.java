package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String aadharno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aadhar(int id, String aadharno) {
		super();
		this.id = id;
		this.aadharno = aadharno;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharno=" + aadharno + "]";
	}
	

}
