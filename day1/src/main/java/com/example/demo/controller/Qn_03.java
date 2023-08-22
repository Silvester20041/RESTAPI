package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Qn_03 {
           @Value("${color}")
           private String c;
           @GetMapping("color")
           public String getMyFav() {
        	   return "My favourite color is"+c;
           }
}
