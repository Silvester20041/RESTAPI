package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service

public class StudentService {
	
         @Autowired
         StudentRepo sr;
        
         public List<Student> show(){
        	 return sr.findAll();
         }
         public Student insert(Student s) {
        	 return sr.save(s);
         }
         
		
}