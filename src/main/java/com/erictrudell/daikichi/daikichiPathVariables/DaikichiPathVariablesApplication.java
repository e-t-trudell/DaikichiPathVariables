package com.erictrudell.daikichi.daikichiPathVariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
	@GetMapping("")
	public String index() {
		return "Welcome you made it here!";
	}
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@GetMapping("/today/{verb}/{city}")
	public String today(@PathVariable("verb") String verb, @PathVariable("city") String city) {
		return "Today you will "+ verb +  " to " + city;
	}
	@GetMapping("/tomorrow/{action}")
	public String tomorrow(@PathVariable("action") String action) {
		return "Tomorrow " + action + " because an opportunity will arise";
	}
	@GetMapping("/lotto/{number}")
	public String tomorrow(@PathVariable("number") Integer number) {
		if(number %2 ==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}

}
