package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
         @Autowired
         StudentRepo sr;
         public Student add(Student s)
         {
        	 return sr.save(s);
         }
         public List<Student> Add()
         {
        	 return sr.findAll();
         }
         
         public List<Student> getSorted(String s)
         {
        	 return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
         }
         public List<Student> getbypage(int pgno,int pgsize)
         {
        	 Page<Student> p = sr.findAll(PageRequest.of(pgno,pgsize));
        	 return p.getContent();
         }
        
         
		
}
