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

import com.example.demo.model.Details;
import com.example.demo.service.BankService;

@RestController
public class BankController {
         @Autowired
         BankService bs;
         @PostMapping("post")
         public List<Details> addDetails(@RequestBody List<Details> acc)
         {
        	 return bs.add(acc);
         }
         @GetMapping("get/{id}")
         public Optional<Details> showDetails(@PathVariable int id)
         {
        	 return bs.show(id);
         }
         @PutMapping("put/{id}")
         public String updateDetails(@PathVariable int id,@RequestBody Details acc)
         {
        	 return bs.update(id,acc);
         }
         @DeleteMapping("delete/{id}")
         public String deleteDetails(@PathVariable int id)
         {
        	 bs.delete(id);
        	 return "Account deleted Successfully";
         }
         
}
