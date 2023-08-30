package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Details;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Details, Integer> {
	 @Query(value="select * from Customer where customerid=:s",nativeQuery=true)
	  public Details getDetails(@Param("s") int Customer);
	 @Modifying
	 @Transactional
	 @Query(value="delete from Customer where first_name=:s",nativeQuery=true)
	  public Details deleteDetails(@Param("s") String Customer);
}