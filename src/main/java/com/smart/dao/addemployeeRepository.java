package com.smart.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entity.Addemployee;
import com.smart.entity.Addemployee;
import com.smart.entity.User;


public interface addemployeeRepository  extends JpaRepository<Addemployee, Integer>{

	
	@Query("from Addemployee  as e where e.user.id=:userId")
	//current page
	//contact per page
	public Page<Addemployee> findemployeeByUser(@Param("userId")int userId,Pageable pePageable);
	
	
	@Query("SELECT e FROM Addemployee e WHERE UPPER(e.name) LIKE UPPER(CONCAT('%', :name, '%')) AND e.user = :user")
	public List<Addemployee> findByNameContainingAndUser(@Param("name") String name, @Param("user") User user);

	@Query("SELECT e FROM Addemployee e WHERE UPPER(e.name) LIKE UPPER(CONCAT('%', :name, '%')) AND e.user = :user")
	public Page<Addemployee> findByNameContainingAndUser(@Param("name") String name, @Param("user") User user, Pageable pageable);

	
	
}
