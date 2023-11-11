package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BreweryLoginEntity;
import com.example.demo.Entity.BreweryRegisterationEntity;
import com.example.demo.Entity.BrewerySingleEntity;
import com.example.demo.Repository.BrewarySingleRepository;
import com.example.demo.Repository.BreweryLoginRepository;
import com.example.demo.Repository.BreweryRegistrationRepository;

@Service
public class BreweryService {
	@Autowired
	BreweryRegistrationRepository breweryrepo;

	@Autowired
	BreweryLoginRepository breweryloginrepo;

	@Autowired
	BrewarySingleRepository brewarysinrepo;

	public void loginBrewery(BreweryLoginEntity breweryid) {

		breweryloginrepo.save(breweryid);
	}

	public void BreweryRegistrations(BreweryRegisterationEntity breweryid) {
		breweryrepo.save(breweryid);

	}

	public void Brewaryinsertdata(BrewerySingleEntity brewarysingle) {
		brewarysinrepo.save(brewarysingle);
	}

	public List<BrewerySingleEntity> getAll() {
		return brewarysinrepo.findAll();
	}

	public BrewerySingleEntity updateByBreweryuserId(Integer breweryid) {
		return brewarysinrepo.findById(breweryid).get();

	}

	public void delete(BrewerySingleEntity brewery) {
		brewarysinrepo.delete(brewery);
	}

	public BrewerySingleEntity insertBrewery(BrewerySingleEntity brewery) {

		return brewarysinrepo.save(brewery);
	}

	public BreweryRegisterationEntity registrationBrewery(BreweryRegisterationEntity breweryreg) {

		return breweryrepo.save(breweryreg);
	}

	public List<BrewerySingleEntity> fetchAllBrewery() {
		List<BrewerySingleEntity> allBreweries = brewarysinrepo.findAll();
		return allBreweries;

	}

	public List<BreweryRegisterationEntity> fetchAllRegistration() {
		List<BreweryRegisterationEntity> allBreweries = breweryrepo.findAll();
		return allBreweries;

	}

	public BrewerySingleEntity getBreweryiesById(int breweryid) {

		Optional<BrewerySingleEntity> brewey = brewarysinrepo.findById(breweryid);
		if (brewey.isPresent()) {
			System.out.println(brewey);
			return brewey.get();
		}
		System.out.println("No record found:" + brewey);
		return null;
	}

	public String getBreweryRegistration(int breweryid) {
		Optional<BreweryRegisterationEntity> breweyies = breweryrepo.findById(breweryid);
		if (breweyies.isPresent()) {
			System.out.println(breweyies);
			return  "Breweryies data Displayed"+breweyies.get();
		}
		System.out.println("No record found:" + breweyies);
		return "No such Breweryies in the database" ;
	} 
	
	
	
	
	public String getBycity(String city) {
		Optional<BrewerySingleEntity> brewerycity = brewarysinrepo.findBycity(city);
		if (brewerycity.isPresent()) {
			System.out.println(brewerycity);
			return "Breweryies City"+ brewerycity.get();
		}
		System.out.println("No record found:" + brewerycity);
		return "Breweryies Not founnd City";
	}


	

	


	public void saveOrUpdate(BrewerySingleEntity brewery) {
		brewarysinrepo.save(brewery);

	}

	public BrewerySingleEntity updateUser(BrewerySingleEntity brewery) {

		BrewerySingleEntity existingUser = brewarysinrepo.findById(brewery.getBreweryid()).get();
		existingUser.setName(existingUser.getName());
		existingUser.setCity(existingUser.getCity());
		existingUser.setLatitude(existingUser.getLatitude());
		existingUser.setLongitude(existingUser.getLongitude());
		existingUser.setPhone(existingUser.getPhone());
		BrewerySingleEntity updatedUser = brewarysinrepo.save(existingUser);
		return updatedUser;
	}

	

	public List<BrewerySingleEntity> getUserById() {
		List<BrewerySingleEntity> allBreweries = brewarysinrepo.findAll();
		return allBreweries;
	}

//	public List<BrewerySingleEntity> getByCity(String city) {
//		List<BrewerySingleEntity> allBreweries = brewarysinrepo.findAll();
//		return allBreweries;
//	}

	
	
	 
	public Optional<BrewerySingleEntity> getBrewerySingleById(int breweryid) {
		return brewarysinrepo.findById(breweryid);
	}

	public BrewerySingleEntity updateBrewerySingle(BrewerySingleEntity updemp) {
		return brewarysinrepo.save(updemp);
	}
	
	
	

	
	public String deleteById(int breweryid) {
		if (brewarysinrepo.findById(breweryid).isPresent()) {
			brewarysinrepo.deleteById(breweryid);
			return "Breweryies deleted successfully :"+""+breweryid;
		}
		return "No such Breweryies in the database:"+""+breweryid;
	}

	
	
	public String deleteRegistrationById(int breweryid) {
		if (breweryrepo.findById(breweryid).isPresent()) {
			breweryrepo.deleteById(breweryid);
			return "Breweryies Registration deleted successfully :"+""+breweryid;
		}
		return "No such Breweryies Registration in the database :"+""+breweryid;
	}


	public String getByName(String name) {
		// TODO Auto-generated method stub
		Optional<BrewerySingleEntity> breweryname = brewarysinrepo.findByName(name);
		if (breweryname.isPresent()) {
			System.out.println(breweryname);
			return "Breweryies Name"+ breweryname.get();
		}
		System.out.println("No record found:" + breweryname);
		return " Not found  Breweryies Name";
	}

	public String getBystate(String state) {
		Optional<BrewerySingleEntity> breweryname = brewarysinrepo.findBystate(state);
		if (breweryname.isPresent()) {
			System.out.println(breweryname);
			return "Breweryies Name"+ breweryname.get();
		}
		System.out.println("No record found:" + breweryname);
		return " Not found  Breweryies Name";
	}



	public List<BrewerySingleEntity> searchProducts(String query) {
        List<BrewerySingleEntity> products = brewarysinrepo.searchProductsSQL(query);
        return products;
    }

	public List<BrewerySingleEntity> searchCityName(String query) {
		List<BrewerySingleEntity> cityname = brewarysinrepo.searchcityNameSQL(query);
        return cityname;
	}

	public List<BrewerySingleEntity> searchlatuidelaongitude(String query) {
		List<BrewerySingleEntity> latitudeLongitude = brewarysinrepo.searchLatitudeLongitude(query);
        return latitudeLongitude;
	}

	

	public List<BrewerySingleEntity> searchname(String query) {
		List<BrewerySingleEntity> Searchname = brewarysinrepo.searchByName(query);
        return Searchname;
	}

	public List<BrewerySingleEntity> searchStateName(String query) {
		List<BrewerySingleEntity> SearchState = brewarysinrepo.searchByState(query);
        return SearchState;
	}

	public List<BrewerySingleEntity> searchpostalcode(String query) {
		List<BrewerySingleEntity> SearchState = brewarysinrepo.searchByPostalcode(query);
        return SearchState;
	}

	public List<BrewerySingleEntity> searchBrewerytype(String query) {
		List<BrewerySingleEntity> SearchBreweryType = brewarysinrepo.searchByBreweryType(query);
        return SearchBreweryType;
	}

	public List<BrewerySingleEntity> findAllOrderstateAsc() {
		var sort = Sort.by(Sort.Direction.ASC, "state");
	    return brewarysinrepo.findAllOrderByNameAsc(sort);

	}

	public List<BrewerySingleEntity> fidAllDescOrderByState() {
		var sort = Sort.by(Sort.Direction.DESC, "state");
    
	    return brewarysinrepo.findAllDescOrderByState(sort);
	}

	
	
	}


