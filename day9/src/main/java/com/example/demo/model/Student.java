package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tables")

public class Student {
	    @Id
	    private int courseid;
	    private String coursename;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="course_id")
	    private Course cs;
	    
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int courseid, String coursename, Course cs) {
			super();
			this.courseid = courseid;
			this.coursename = coursename;
			this.cs = cs;
		}
		public int getCourseid() {
			return courseid;
		}
		public void setCourseid(int courseid) {
			this.courseid = courseid;
		}
		public String getCoursename() {
			return coursename;
		}
		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}
		public Course getCs() {
			return cs;
		}
		public void setCs(Course cs) {
			this.cs = cs;
		}
}
