package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="brewerylog")
public class BreweryLoginEntity {
	@Id
	 @GeneratedValue(generator = "sequence-generator")
	@Column(name="breweryid")
	private int breweryid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	public int getBreweryid() {
		return breweryid;
	}

	public void setBreweryid(int breweryid) {
		this.breweryid = breweryid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BreweryLoginEntity [breweryid=" + breweryid + ", email=" + email + ", password=" + password + "]";
	}

	public BreweryLoginEntity(int breweryid, String email, String password) {
		super();
		this.breweryid = breweryid;
		this.email = email;
		this.password = password;
	}

	public BreweryLoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
