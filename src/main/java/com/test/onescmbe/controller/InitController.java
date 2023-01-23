package com.test.onescmbe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class InitController {
	
	/*Test the rest call*/
	@GetMapping("/app2path1")
	public String roothello() {
		
		return "all users from path1 of app 2";
		
		
	}	
	@GetMapping("/app2path2")
	public String hello() {
		
		return "all users from path2 of app 2";
		
		
	}

	@GetMapping("/app2path3")
	public ResponseEntity<String> callAppTwo() {

		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://app1.onescm/app1path2";
		ResponseEntity<String> response
				= restTemplate.getForEntity(fooResourceUrl , String.class);

		return response;


	}

}
