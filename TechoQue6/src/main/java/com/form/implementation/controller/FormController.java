package com.form.implementation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.implementation.DTO.FormData;

@RestController
@RequestMapping("form")
public class FormController {
	  FormData user;
	
      @GetMapping("/fetch-data")
      public FormData getDetails() {
    	  return user;
      }
      
      @PostMapping("/insert-data")
      public void postDetails(@RequestBody FormData user) {
    	  this.user = user;
      }
}


