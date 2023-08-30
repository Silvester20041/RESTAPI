package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Details;
import com.example.demo.repository.CustomerRepo;
@Service
public class BankkService {
  @Autowired
  CustomerRepo cr;
  public List<Details> add(List<Details> c){
	  return cr.saveAll(c);
  }
  public List<Details> get(){
	  return cr.findAll();
  }
	public List<Details> sortandpage(int pageno,int pagesize,String field){
		Page<Details> page = cr.findAll(PageRequest.of(pageno, pagesize, Sort.by(field)));
	    List<Details> entities = page.getContent();
	    return entities;
	}
	public Details getDetailsDetails(int id) {
		return cr.getDetails(id);
	}
	public void  deleteDetailsDetails(String name) {
		  cr.deleteDetails(name);
	}
	
}
