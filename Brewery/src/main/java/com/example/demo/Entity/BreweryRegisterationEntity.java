package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="breweryregistration")
public class BreweryRegisterationEntity {
	
	
	@Id
	
	@Column(name="breweryid")
	private int breweryid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	
	@Column(name="email")
	private String email;

	
	@Column(name="phonenumber")
	private String phonenumber;

@Column(name="password")
private String password;

@Column(name="conformpassword")
private String conformpassword;


@Column(name="address")
private String address;


public int getBreweryid() {
	return breweryid;
}


public void setBreweryid(int breweryid) {
	this.breweryid = breweryid;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getConformpassword() {
	return conformpassword;
}


public void setConformpassword(String conformpassword) {
	this.conformpassword = conformpassword;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "BreweryRegisterationEntity [breweryid=" + breweryid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password + ", conformpassword="
			+ conformpassword + ", address=" + address + "]";
}


public BreweryRegisterationEntity(int breweryid, String firstname, String lastname, String email, String phonenumber,
		String password, String conformpassword, String address) {
	super();
	this.breweryid = breweryid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phonenumber = phonenumber;
	this.password = password;
	this.conformpassword = conformpassword;
	this.address = address;
}


public BreweryRegisterationEntity() {
	super();
	// TODO Auto-generated constructor stub
}


	
	
	

}
