package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
@Service
public class ApiService {
	     @Autowired
         StudentRepo r;
         
         public Student Add(Student s)
         {
        	 return r.save(s);
         }
         public Optional<Student> showId(int id)
         {
        	 return r.findById(id);
         }
         public List<Student> showAll()
         {
        	 return r.findAll();
         }
         public Student update(Student s)
         {
        	 return r.saveAndFlush(s);
         }
         public void delete(int id)
         {
        	 r.deleteById(id);
         }
         
         
}
