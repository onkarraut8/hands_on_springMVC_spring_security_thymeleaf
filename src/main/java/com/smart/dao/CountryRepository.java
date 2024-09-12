package com.smart.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.smart.entity.Countries;


public interface CountryRepository extends JpaRepository<Countries,Integer> {
	/*
	 * @Query("from country as c") public List<Country> findAll();
	 */
	
	/*
	 * @Query("from country as c where c.state=:id") List<Country>
	 * getStatesByCountry(@Param("id")int userId);
	 * 
	 * @Query("from country as c") List<Country> getAllCountries();
	 */
}
