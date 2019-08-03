package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public ResponseEntity<Map<String,Integer>> sayHello() {
		Map<String,Integer> map= new HashMap<>();
		map.put("Rahil", 11);
		return new ResponseEntity<Map<String, Integer>>(map,HttpStatus.OK);
	}
}
