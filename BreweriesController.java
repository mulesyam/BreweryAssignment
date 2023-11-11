package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BreweryRegisterationEntity;
import com.example.demo.Entity.BrewerySingleEntity;
import com.example.demo.Repository.BrewarySingleRepository;
import com.example.demo.Service.BreweryService;

@RestController
public class BreweriesController {
	 
	@Autowired 
	BreweryService breweryserv;
	
	@Autowired
 private  BrewarySingleRepository breweryrepo;
	
	
	//save Single Brewery
	 @PostMapping("/v1/breweriessave")
	    public BrewerySingleEntity saveEmployee(@RequestBody BrewerySingleEntity brewery) {
	        return breweryserv.insertBrewery(brewery);
	    }

 
    //save Brewery Registration
	 @PostMapping("/v1/brewerie/registration")
	    public BreweryRegisterationEntity savebreweryregistration(@RequestBody BreweryRegisterationEntity breweryreg) {
	        return breweryserv.registrationBrewery(breweryreg);
	    }
	 
	 
    //Get All Single Brewery List
	 @GetMapping("/v1/breweriesSingleAll/list")
	    public List<BrewerySingleEntity> getAllBreweryList() {
			System.out.println(this.getClass().getName() + " - Get all Single Brewery service is invoked.");
	        return breweryserv.fetchAllBrewery();
	    }

	 //Get All Brewery Registration List
	 @GetMapping("/v1/breweries/registration")
	    public List<BreweryRegisterationEntity> getAllRegistrationList() {
		 System.out.println(this.getClass().getName() + " - Get all Registration Brewery service is invoked.");
	        return breweryserv.fetchAllRegistration();
	    }
	 
	
	// Get BySingle Brewery {brewery id}
	 @GetMapping("/v1/breweriessingleentity/{id}")
		public ResponseEntity<BrewerySingleEntity> getTutorialById(@PathVariable("id") Integer breweryid) {
			Optional<BrewerySingleEntity> tutorialData = breweryrepo.findById(breweryid);

			if (tutorialData.isPresent()) {
				System.out.println("user present " +tutorialData);
				return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK );
			} else {
				System.out.println("Data Not Present inside database :"+tutorialData);
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	   
	 
	 //Get By  Brewery Registration By{brewery id}
	 @GetMapping("/v1/breweriesRegitration/{breweryid}")
	    public String getRegistrationById(@PathVariable("breweryid") int breweryid) {
	        return breweryserv.getBreweryRegistration(breweryid);
	 }
	 
	 // Get Single brewery By City{city}
	 @GetMapping("/v1/breweriesBycity/{city}")
	    public String getBreweryiesBycity(@PathVariable("city") String city) {
		 System.out.println("Record Found :"+city);
	        return breweryserv.getBycity(city);
}
	  
	 
	 //Get Brewery By Name{name}
	 @GetMapping("/v1/breweriesByName/{name}")
	    public String getBreweryiesByName(@PathVariable("name") String name) {
		 System.out.println("Record Found :"+name);
	        return breweryserv.getByName(name);
}
	  
	 
	 
	 
	 //Get Brewery State {state}
	 @GetMapping("/v1/breweriesByState/{State}")
	    public String getBreweryiesByState(@PathVariable("State") String state) {
		 System.out.println("Record Found :"+state);
	        return breweryserv.getBystate(state);
}
	  
	 
	 
	 
	 
	//Update Single Brewery By Id{brewery id}
	 @PutMapping("/v1/breweriesByUpdate/{id}")

		public BrewerySingleEntity updateBrewerySingle(@RequestBody BrewerySingleEntity updemp, @PathVariable(name="id") int breweryid) throws Exception {
			System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked."+breweryid);

			Optional<BrewerySingleEntity> emp =  breweryserv.getBrewerySingleById(breweryid);
			if (!emp.isPresent())
				throw new Exception("Could not find employee with id- " + breweryid);

			if(updemp.getName() == null || updemp.getName().isEmpty())updemp.setName(emp.get().getName());
			if(updemp.getBrewerytype() == null || updemp.getBrewerytype().isEmpty())updemp.setBrewerytype(emp.get().getBrewerytype());
			if(updemp.getCity() == null || updemp.getCity().isEmpty())updemp.setCity(emp.get().getCity());
			if(updemp.getStateprovince() == null || updemp.getStateprovince().isEmpty())updemp.setStateprovince(emp.get().getStateprovince());
			if(updemp.getPostalcode() == null || updemp.getPostalcode().isEmpty())updemp.setPostalcode(emp.get().getPostalcode());
			if(updemp.getPhone() == null || updemp.getPhone().isEmpty())	updemp.setPhone(emp.get().getPhone());
			if(updemp.getLongitude() == null||	updemp.getLongitude().isEmpty()) updemp.setLongitude(emp.get().getLongitude());
			if(updemp.getLatitude() == null||	updemp.getLatitude().isEmpty()) updemp.setLatitude(emp.get().getLatitude());
			

			// Required for the "where" clause in the sql query template.
			updemp.setBreweryid(breweryid);
			return breweryserv.updateBrewerySingle(updemp);
		}

	 
	 
	 
	 //Update  Single  Brewery  save or Update by{brewery id}
	 @PutMapping("/v1/breweriesupdayeByid/{breweryid}")  
	 private BrewerySingleEntity updateBrewery(@PathVariable("breweryid") int breweryid,@RequestBody BrewerySingleEntity brewery)   
	 {  
		 breweryserv.saveOrUpdate(brewery);  
	     return brewery;  
	 }  
	  
	 
	// Delete Brewery Registration By{id}
	 @DeleteMapping("/v1/breweriesRegistrationdelete/{breweryid}")
	    public String deleteBreweryRegistration(@PathVariable("breweryid") int breweryid) {
			System.out.println(this.getClass().getSimpleName() + " - Delete employee by id is invoked."+breweryid);
		  System.out.println("Brewery Id deleted "+breweryid);
	        return breweryserv.deleteRegistrationById(breweryid);
	    }
	 
	 //Delete  Single Brewery  By {id}
	 @DeleteMapping("/v1/breweries/delete/{breweryid}")
	    public String deleteBrewery(@PathVariable("breweryid") int breweryid) {
		 System.out.println("Brewery Id deleted "+breweryid);
	        return breweryserv.deleteById(breweryid);
	    }
	 
	   
	 
	
	 
	 
	 
	 //Get Single Brewery By All City Names
	 
	 
//	 @GetMapping("/v1/breweriesSingleAllCitynames/list/{city_name}")
//	    public List<BrewerySingleEntity> getAllnameList( String city) {
//			System.out.println(this.getClass().getName() + " - Get all Single Brewery service is invoked.");
//			System.out.println("Record Found :"+city);
//	        return breweryserv.fetchAllCityNames();
//	    }
 
	 
	
    //Random Brewery Search 
	    @GetMapping("/v1/breweries/RandomSearchBrewery/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchProducts(@RequestParam("query") String query){
	        return ResponseEntity.ok(breweryserv.searchProducts(query));
	    }
	    
     //List Brewery Search {by_city}
	    @GetMapping("/v1/breweries/SingleRandomBreweryCity/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchCityName(@RequestParam("query") String query){
	    	System.out.println("Record Found :"+query);
	        return ResponseEntity.ok(breweryserv.searchCityName(query));
	    }
	    
	    
	   //List Brewery Search {by_dist}
	    @GetMapping("/v1/breweries/SingleRandomBrewerylatitude/longitude/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchlatuidelaongitude(@RequestParam("query") String query){
	    	System.out.println("Record Found :"+query);
	        return ResponseEntity.ok(breweryserv.searchlatuidelaongitude(query));
	    }
	    
	    
	    //List brewery Search {by_name}
	    @GetMapping("/v1/breweries/SingleRandomBrewery/name/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchname(@RequestParam("query") String query){
	    	System.out.println("Record Found :"+query);
	        return ResponseEntity.ok(breweryserv.searchname(query));
	    }
	    
       //List Brewery Search  {by_state}
	    @GetMapping("/v1/breweries/SingleRandomBreweryState/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchStateName(@RequestParam("query") String query){
	    	System.out.println("Record Found :"+query);
	        return ResponseEntity.ok(breweryserv.searchStateName(query));
	    }
	    
	    
	    //List Brewery Search {by_postalcode}
	    @GetMapping("/v1/breweries/SingleRandomBreweryPostalcode/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchPostalcode(@RequestParam("query") String query){
	    	System.out.println("Record Found :"+query);
	        return ResponseEntity.ok(breweryserv.searchpostalcode(query));
	    }
           
	    //List Brewery Search {by_BreweryType}
	    @GetMapping("/v1/breweries/SingleRandomBrewerybrewerytype/search")
	    public ResponseEntity<List<BrewerySingleEntity>> searchBrewerytype(@RequestParam("query") String query){
	        return ResponseEntity.ok(breweryserv.searchBrewerytype(query));
	    }
	    
	    
	    //List Brewery Search {by_AscOrderSort}
	    @GetMapping("/v1/breweries/SingleRandomBrewery/AscOrderBy/state")
	    public List<BrewerySingleEntity> getCitiesByPopulation() {
	         return breweryserv.findAllOrderstateAsc();
	    }
	    
	    
	    //List Brewery Search {by_DescOrderSort}
	    @GetMapping("/v1/breweries/SingleRandomBrewery/DescOrderBy/state")
	    public List<BrewerySingleEntity> getDescOrderByState() {
	    	System.out.println("Get All Desc Order By State");
	         return breweryserv.fidAllDescOrderByState();
	    }


	 
}
