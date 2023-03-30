package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.ECommerce;

@RestController
public class EcommerceController {
	
	@GetMapping("/report")
	public ResponseEntity<String> show()
	{
		return new ResponseEntity<String>("Hello!",HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/report")
	public ResponseEntity<ECommerce> show(@RequestBody ECommerce obj)
	{
		return new ResponseEntity<ECommerce>(obj,HttpStatus.ACCEPTED);
	}

}
