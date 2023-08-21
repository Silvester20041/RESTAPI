package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.StudentEntity;
import com.example.demo1.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveDetails(StudentEntity s) {
		return sr.save(s);
	}
	public List<StudentEntity> showinfo(){
		return sr.findAll();
	}

}
