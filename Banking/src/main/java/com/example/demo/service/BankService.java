package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Details;
import com.example.demo.repository.BankRepo;

@Service
public class BankService {
	
	      @Autowired
          BankRepo br;
	      public List<Details> add(List<Details> d)
	      {
	    	  return (List<Details>) br.saveAll(d);
	      }
	      public Optional<Details> show(int id)
	      {
	    	   return br.findById(id);
	      }
	      public String update(int id,Details d)
	      {
	    	  br.saveAndFlush(d);
	    	  if(br.existsById(id))
	    	  {
	    		  return "Account updated Successfully";
	    	  }
	    	  else
	    	  {
	    		  return "Account does not exist";
	    	  }
	      }
	      public void delete(int id)
	      {
	    	  br.deleteById(id);
	      }
	
}
