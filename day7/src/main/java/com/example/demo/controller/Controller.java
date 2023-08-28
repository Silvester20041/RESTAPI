package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StuService;
@RestController
public class Controller {
	@Autowired
	StuService ss;
	
	@PostMapping("post")
	public Student Add(@RequestBody Student sa)
	{
		return ss.add(sa);
	}
	@PutMapping("update")
	public Student Update(@PathVariable Student sa) {
		return ss.update(sa);
	}
	@GetMapping("get/{id}")
	public Optional<Student> show(@PathVariable int id)
	{
		return ss.showId(id);
	}
	@GetMapping("Get1")
	public List<Student> show()
	{
		return ss.Add();
	}
	@GetMapping("show/{name}")
	public List<Student> getsortinfo(@PathVariable String name){
		return ss.getSorted(name);
	}
	@GetMapping("{pgno}/{pgsize}")
	public List<Student> paging(@PathVariable int pgno,@PathVariable int pgsize)
	{
		return ss.getbypage(pgno, pgsize);
	}
	public List<Student> displayAll(@PathVariable int id,@PathVariable String name)
	{
		return ss.getDetails(id, name);
	}
	@PostMapping("addnstudents")
	public List<Student> addndetails(@RequestBody List<Student> sa)
	{
		return ((StuService) ss).savedetails(sa);
	}
	@DeleteMapping("delete/{id}")
	public String del(@PathVariable int id)
	{
	    ss.delstu(id);
		return "Deleted Successfully"; 
	}
	
}