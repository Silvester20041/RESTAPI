
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.Repo;


@Service
public class StuService {
         @Autowired
         Repo sr;
         public Student add(Student s)
         {
        	 return sr.save(s);
         }
         public List<Student> savedetails(List<Student> ss)
         {
        	 return (List<Student>) sr.saveAll(ss);
         }
         public List<Student> Add()
         {
        	 return sr.findAll();
         }
         public Optional<Student> showId(int id)
         {
        	 return sr.findById(id);
         }
         public Student update(Student s)
         {
        	 return sr.saveAndFlush(s);
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
         public List<Student> getDetails(int id,String name){
        	 return sr.getStu(id,name);
         }
         public void delstu(int id) {
        	  sr.deleteById(id);	 
         }
         public int updatestu(int id,int id1) {
        	 return sr.updateStu(id, id1);
         }
}