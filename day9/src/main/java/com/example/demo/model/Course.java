package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Course {
         @Id
         private int year;
         private String month;
		public Course(int year, String month) {
			super();
			this.year = year;
			this.month = month;
		}
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getMonth() {
			return month;
		}
		public void setMonth(String month) {
			this.month = month;
		}
		 
         
         
         
}
