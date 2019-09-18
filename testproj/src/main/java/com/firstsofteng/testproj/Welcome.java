package com.firstsofteng.testproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@RequestMapping("/")
	public String firstmethod() {
		return "Hello World";
	}
}
