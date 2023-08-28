package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RestController
public class PageController {
	@Autowired
	StudentService ss;
	
	@PostMapping("post")
	public Student Add(@RequestBody Student sa)
	{
		return ss.add(sa);
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
}

