package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DependApplication {

	@Qualifier("s1")
	@Autowired 
	Addition ai;

	/*
	 * @Autowired DependApplication(Addition aa) {
	 * 
	 * this.ai=aa; }
	 * 
	 * 
	 * public Addition getAi() { return ai; }
	 * 
	 * @Autowired public void setAi(Addition ai) { this.ai = ai; }
	 * 
	 */

	@GetMapping("/add")
	public String display() {

		return "Result Is" + ai.add(10, 20);
	}

	public static void main(String[] args) {
		SpringApplication.run(DependApplication.class, args);

	}

}
