package com.smart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entity.States;




public interface StateRepository extends JpaRepository<States,Integer> {
	
	
	
	
	
	 @Query("SELECT c from States as c WHERE c.countries.id=:id") 
	 public List<States> getAllState(@Param("id")int id);

	
	 
	 
	 
	 
	
	
}
