package com.example.Entity;



import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Date datecreated;
private Date lastupdate;
private String ordtracknum;
private String status;
private  BigDecimal totalprice;
private int totalquqntity;
@OneToOne(cascade = CascadeType.ALL,mappedBy = "order",fetch = FetchType.LAZY)
private Addresses ads;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDatecreated() {
	return datecreated;
}
public void setDatecreated(Date datecreated) {
	this.datecreated = datecreated;
}
public Date getLastupdate() {
	return lastupdate;
}
public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}
public String getOrdtracknum() {
	return ordtracknum;
}
public void setOrdtracknum(String ordtracknum) {
	this.ordtracknum = ordtracknum;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public BigDecimal getTotalprice() {
	return totalprice;
}
public void setTotalprice(BigDecimal totalprice) {
}
}
