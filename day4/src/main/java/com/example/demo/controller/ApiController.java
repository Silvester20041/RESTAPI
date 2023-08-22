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
import com.example .demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
       ApiService a;
       
	   @PostMapping("/post")
       public Student add(@RequestBody Student s)
       {
    	   return a.Add(s);
       }
       @PutMapping("/put{id}")
       public Student Update(@PathVariable Student s)
       {
    	   return a.update(s);
       }
       @GetMapping("disp/{id}")
       public Optional<Student> show(@PathVariable int id){
    	   return a.showId(id);
       }
       @GetMapping("dispAll")
       public List<Student> show()
       {
    	   return a.showAll();
       }
       
       @DeleteMapping("/delete")
       public void id(@PathVariable int id)
       {
    	   a.delete(id);
       } 
}
