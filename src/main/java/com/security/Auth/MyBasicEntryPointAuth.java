package com.security.Auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class MyBasicEntryPointAuth extends BasicAuthenticationEntryPoint{
	
	public void commence(HttpServletRequest request,HttpServletResponse response,AuthenticationException authExcep) throws IOException {
		response.setHeader("WWW-Authenticate", getRealmName());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		PrintWriter writer = response.getWriter();
		writer.println("HTTP STATUS 401 - "+authExcep.getMessage());
	}

	
	public void afterPropertiesSet() {
		setRealmName("SecurityCheckApi");
		super.afterPropertiesSet();
	}
}
