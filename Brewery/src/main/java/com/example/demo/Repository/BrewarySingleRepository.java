package com.example.demo.Repository;





import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.BrewerySingleEntity;

@Repository
public interface BrewarySingleRepository  extends JpaRepository<BrewerySingleEntity, Integer>{
	@Query("select c from BrewerySingleEntity c where c.city like %?1")
	Optional<BrewerySingleEntity> findBycity(String city);
	
	@Query("select c from BrewerySingleEntity c where c.city like %?1")
	//List<BrewerySingleEntity> findByNameEndsWith(String city);
	List<BrewerySingleEntity> findByCityDetails(String city);
	
	
	@Query("select c from BrewerySingleEntity c where c.name like %?1")
	Optional<BrewerySingleEntity> findByName(String name);
	
	
	@Query("select c from BrewerySingleEntity c where c.state like %?1")
	Optional<BrewerySingleEntity> findBystate(String state);
	
	
	
	@Query("SELECT p FROM BrewerySingleEntity p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" + "Or p.brewerytype LIKE CONCAT('%', :query, '%')" + "Or p.address1 LIKE CONCAT('%', :query, '%')"+  "Or p.city LIKE CONCAT('%', :query, '%')"+ "Or p.stateprovince LIKE CONCAT('%', :query, '%')"+
            "Or p.country LIKE CONCAT('%', :query, '%')" + "Or p.longitude LIKE CONCAT('%', :query, '%')" + "Or p.state LIKE CONCAT('%', :query, '%')"  + "Or p.latitude LIKE CONCAT('%', :query, '%')" +
            "Or p.phone LIKE CONCAT('%', :query, '%')"+ "Or p.postalcode LIKE CONCAT('%', :query, '%')")
	List<BrewerySingleEntity> searchProductsSQL(String query);
	
	
	
	@Query("select p from BrewerySingleEntity p WHERE " +  "p.city LIKE CONCAT('%',:query, '%')")
	List<BrewerySingleEntity> searchcityNameSQL(String query);
	
	@Query("select p from BrewerySingleEntity p WHERE " +  " p.longitude LIKE CONCAT('%', :query, '%')"+ "Or p.latitude LIKE CONCAT('%', :query, '%')")
	List<BrewerySingleEntity> searchLatitudeLongitude(String query);
	
	@Query("select p from BrewerySingleEntity p WHERE " +  "p.name LIKE CONCAT('%',:query, '%')")
	List<BrewerySingleEntity> searchByName(String query);
	
	@Query("select p from BrewerySingleEntity p WHERE " +  "p.state LIKE CONCAT('%',:query, '%')")
	List<BrewerySingleEntity> searchByState(String query);
	
	@Query("select p from BrewerySingleEntity p WHERE " +  "p.postalcode LIKE CONCAT('%',:query, '%')")
	List<BrewerySingleEntity> searchByPostalcode(String query);
	
	@Query("select p from BrewerySingleEntity p WHERE " +  "p.brewerytype LIKE CONCAT('%',:query, '%')")
	List<BrewerySingleEntity> searchByBreweryType(String query);
	
	  @Query("FROM BrewerySingleEntity")
	List<BrewerySingleEntity> findAllOrderByNameAsc(Sort sort);
	  
	  @Query("FROM BrewerySingleEntity")
	List<BrewerySingleEntity> findAllDescOrderByState(Sort sort);
    
    

   


	


}
