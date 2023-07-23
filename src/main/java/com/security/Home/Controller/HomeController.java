package com.security.Home.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Value("${welcome.message.all}")
	private String welcome;
	
	@Value("${welcome.message.authentication.user}")
	private String authUser;
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		System.out.println("Enter into Welcome Message");
		return welcome;
	}
	
	@GetMapping("/auth")
	public String getAuthResult() {
		System.out.println("Enter into Welcome Auth Message");
		return authUser;
	}

}
