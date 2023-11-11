package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="singlebrewery")
public class BrewerySingleEntity {
	
	@Id
    //@GeneratedValue(generator = "sequence-generator")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="breweryid")
	private int breweryid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="brewerytype")
	private String brewerytype;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="stateprovince")
	private String stateprovince;
	
	@Column(name="postalcode")
	private String postalcode;
	
	@Column(name="country")
	private String country;
	
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="websiteurl")
	private String websiteurl;
	
	@Column(name="state")
	private String state;
	
	@Column(name="street")
	private String Street;

	
	
	public int getBreweryid() {
		return breweryid;
	}

	public void setBreweryid(int breweryid) {
		this.breweryid = breweryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrewerytype() {
		return brewerytype;
	}

	public void setBrewerytype(String brewerytype) {
		this.brewerytype = brewerytype;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateprovince() {
		return stateprovince;
	}

	public void setStateprovince(String stateprovince) {
		this.stateprovince = stateprovince;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postelcode) {
		this.postalcode = postelcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsiteurl() {
		return websiteurl;
	}

	public void setWebsiteurl(String websiteurl) {
		this.websiteurl = websiteurl;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Override
	public String toString() {
		return "BrewerySingleEntity [breweryid=" + breweryid + ", name=" + name + ", brewerytype=" + brewerytype
				+ ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", stateprovince="
				+ stateprovince + ", postalcode=" + postalcode + ", country=" + country + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", phone=" + phone + ", websiteurl=" + websiteurl + ", state=" + state
				+ ", Street=" + Street + "]";
	}

	public BrewerySingleEntity(int breweryid, String name, String brewerytype, String address1, String address2,
			String city, String stateprovince, String postalcode, String country, String longitude, String latitude,
			String phone, String websiteurl, String state, String street) {
		super();
		this.breweryid = breweryid;
		this.name = name;
		this.brewerytype = brewerytype;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.stateprovince = stateprovince;
		this.postalcode = postalcode;
		this.country = country;
		this.longitude = longitude;
		this.latitude = latitude;
		this.phone = phone;
		this.websiteurl = websiteurl;
		this.state = state;
		this.Street = street;
	}

	public BrewerySingleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
