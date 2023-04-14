package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllTest {

	@GetMapping("/test/hello")
	public String hell(){
		
		return "Hello JAVA";
	}
}
