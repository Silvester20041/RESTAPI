package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Details;

public interface BankRepo extends JpaRepository<Details, Integer>{

}
