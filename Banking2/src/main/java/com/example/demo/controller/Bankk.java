package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Details;
import com.example.demo.service.BankkService;
@RestController
public class Bankk {
 @Autowired
 BankkService cs;
  @PostMapping("addCustomer")
  public List<Details> addCtmr(@RequestBody List<Details> ctmr){
	  return cs.add(ctmr);
  }
  @GetMapping("getAllCustomer")
  public List<Details> getCtmr(){
	  return cs.get();
  }
  @GetMapping("getCustomer/{id}")
  public Details get(@PathVariable int id) {
	  return cs.getDetailsDetails(id);
  }
  @GetMapping("sortandpage/{pageno}/{pagesize}/{name}")
  public List<Details> sortPaging(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
  	return cs.sortandpage(pageno,pagesize,name);
  }
  @DeleteMapping("DeleteCustomer/{name}")
  public String delete(@PathVariable String name) {
	  cs.deleteDetailsDetails(name);
	  return "Customer deleted successfully";
  }
}
