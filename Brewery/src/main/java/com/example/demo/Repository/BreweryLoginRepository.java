package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.BreweryLoginEntity;

@Repository
public interface BreweryLoginRepository extends JpaRepository<BreweryLoginEntity, Integer> {

}
