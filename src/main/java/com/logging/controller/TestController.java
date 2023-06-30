package com.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private Logger log= LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/")
	public String welcome() {
		try {
			int a= 10/0;
		}catch (Exception e) {
			log.error("Error occured");
		}
		log.info("Welcome method loggger implemented ");
		return "welcome";
	}
	@GetMapping("/greet")
	public String greet() {
		String msg="Greeting to page";
		log.warn(msg);
		log.info("Greeting method logger implemented ");
		return "Greetings to logging";
	}

}
