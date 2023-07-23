package com.security.Home.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		System.out.println("Enter into Welcome Message");
		return "Welcome to Spring Security Project with Bhuvanesh";
	}
	
	@GetMapping("/auth")
	public String getAuthResult() {
		System.out.println("Enter into Welcome Auth Message");
		return "You are Correct the Password Authenticated SuccessFully.... Welcome !!!!";
	}

}
