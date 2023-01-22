package com.test.onescmbe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class InitController {
	
	/*Test the rest call*/
	
	@GetMapping("/getdetails")
	public String hello() {
		
		return "all users from app 2";
		
		
	}

	@GetMapping("/getdetail")
	public ResponseEntity<String> callAppTwo() {

		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/api/app_2/getdetails";
		ResponseEntity<String> response
				= restTemplate.getForEntity(fooResourceUrl , String.class);

		return response;


	}

}
