package com.genaration.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-world")
public class HelloWorldController {
	
  @GetMapping
   public String helloWorld() {
	  return "hello World!!!";
  }
 
}
