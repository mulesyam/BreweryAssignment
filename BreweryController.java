package com.example.demo.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.BreweryLoginEntity;
import com.example.demo.Entity.BreweryRegisterationEntity;
import com.example.demo.Entity.BrewerySingleEntity;
import com.example.demo.Repository.BrewarySingleRepository;
import com.example.demo.Service.BreweryService;

@Controller
public class BreweryController {

	@Autowired 
	BreweryService breweryservice;
	@Autowired
	BrewarySingleRepository brewaryrepo;
	
	
	
	@GetMapping("/homepage")
	public String getMainpage() {
		return"Homepage";
	}
	
	
	@GetMapping("/userlogin")
	public String loginbrewerys() {
		return"Login";
	}
	

	@PostMapping("/breweryslogin")
	public String userLogin(BreweryLoginEntity breweryid) {
		
		breweryservice.loginBrewery(breweryid);
		System.out.println(breweryid);
		return "Login";

	}
	
	@GetMapping("/breweryregistration")
	public String getdtata() {
		return"Registration";
	}
	
	

	@PostMapping("/userRegistration")
	public String userRegistration(BreweryRegisterationEntity breweryid) {
		
		breweryservice.BreweryRegistrations(breweryid);
		System.out.println(breweryid);
		return "Registration";

	}
	
	
	@GetMapping("/createberwery")
	public String insertdata() {
		return"SingleBrewery";
	}
	
	
	@PostMapping("/insertRegistration")
	public String createSingleBrewary(BrewerySingleEntity brewarysingle) {
		
		breweryservice.Brewaryinsertdata(brewarysingle);
		System.out.println(brewarysingle);
		return "SingleBrewery";

	}
	

	/*
	 * @GetMapping("/listbrewerie") public String userListdata() {
	 * return"ListBrewery"; }
	 */
	
	
	

	@GetMapping("/BreweryAlldetails1")
	public ModelAndView getAllBreweryuser() {
		ModelAndView mav = new ModelAndView("ListBrewery");
		List<BrewerySingleEntity> userList = breweryservice.getAll();
		mav.addObject("singlebrewery", userList);
		return mav;
	}

	
	@GetMapping("/Brewery-update/{breweryid}")
	public ModelAndView getbreweryuser(@PathVariable("breweryid") Integer breweryid) {
		ModelAndView mav = new ModelAndView("ListBrewery");
		BrewerySingleEntity update =breweryservice.updateByBreweryuserId(breweryid);
		mav.addObject("command", update);
		return mav;
	}

	@GetMapping("/Brewery-delete/{breweryid}")
	public String deletebreweryuser(@PathVariable("breweryid") Integer breweryid) {
		BrewerySingleEntity deletebrewery = breweryservice.updateByBreweryuserId(breweryid);
		breweryservice.delete(deletebrewery);
		return "ListBrewery";
	}
	
	
	
	@GetMapping("/delete")
	public String userDeleteById() {
		return"DeletedBrewery";
	}
	

	@GetMapping("/BreweryAlldetails")
	public ModelAndView getAll(@PathVariable(name = "breweryid") int breweryid) {
		ModelAndView mav = new ModelAndView("ListBrewery");
		mav.addObject("singlebrewery", brewaryrepo.findAll());
		return mav;
	}
		
	@GetMapping("/editByBrewery")
	public String GetEditGyBreweryId() {
		return"UpdateBrewery";
	}
	
	  @PutMapping("/edit/{breweryid}")
	    public String showEditEmployeePage(@PathVariable(name = "breweryid") int breweryid) {
	        breweryservice.getBrewerySingleById(breweryid);
			return "UpdateBrewery";
	    }
		
		@GetMapping("/deleteByBrewery")
		public String DeleteByBreweryId() {
			return"ListBrewery";
		}
	    @GetMapping("/delete/{breweryid}")
	    public String deleteEmployeePage(@PathVariable(name = "breweryid") int breweryid) {
	    	breweryservice.deleteById(breweryid);
	        return "ListBrewery";
	    }	
		
		
		
	@GetMapping("/searchByBrewery")
	public String GetsearchId() {
		return"SearchBrewery";
	}
	
	
	  @GetMapping("/v1/breweries/search")
	    public String searchProducts(@RequestParam("query") String query){
	         ResponseEntity.ok(breweryservice.searchProducts(query));
	         return "SearchBrewery";
	    }
	  
	  @GetMapping("/randomsearch/search")
		public String Randomsearch() {
			return"RandomBrewery";
		}
	  @GetMapping("/v1/breweriesnamelist/search")
	    public String breweryname(@RequestParam("query") String query){
	         ResponseEntity.ok(breweryservice.searchname(query));
	         System.out.println(query);
	         return "SearchBrewery";
	    }
	
}
