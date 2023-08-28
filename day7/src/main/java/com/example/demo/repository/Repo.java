package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;

import jakarta.transaction.Transactional;

public interface Repo extends JpaRepository<Student, Integer>{
   @Query(value= "select * from silva where id=:s or name=:sn",nativeQuery=true)
   public List<Student> getStu(@Param("s") int id,@Param("sn") String name);
   
   @Modifying
   @Transactional
   @Query(value="delete from silva where id=:s",nativeQuery=true)
   public int deleteStu(@Param("s") int id);
   
   @Modifying
   @Transactional
   @Query(value="update silva set id=?1 where id=?2",nativeQuery=true)
   public int updateStu(int newid,int oldid);
}