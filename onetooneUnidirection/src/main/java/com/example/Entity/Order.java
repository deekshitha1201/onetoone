package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ord")
public class Order {
@Id
private int id;
@Column(name="oname")
private String name;
@Column(name="oprice")
private double price;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="ad_id",referencedColumnName = "id")
private Address ad;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Address getAd() {
	return ad;
}
public void setAd(Address ad) {
	this.ad = ad;
}

}
