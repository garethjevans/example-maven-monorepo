package com.garethjevans.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.garethjevans.shared.Shared.CONSTANT;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from " + CONSTANT + "!";
	}

}