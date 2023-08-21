package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.StudentEntity;
import com.example.demo1.service.StudentService;

@RestController 
public class Controller {
	
@Autowired
StudentService ss;
@PostMapping("add")
public StudentEntity add(@RequestBody StudentEntity s) {
	return ss.saveDetails(s);
}

@GetMapping ("showdetails")
public List<StudentEntity> show(){
	return ss.showinfo();
}

	
}
