package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	 @Query(value="select * from customer where customerid=:s",nativeQuery=true)
	  public Customer getDetails(@Param("s") int Customer);
	 @Modifying
	 @Transactional
	 @Query(value="delete from customer where first_name=:s",nativeQuery=true)
	  public Customer deleteDetails(@Param("s") String Customer);
}

