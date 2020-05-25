package com.neng.api.ex.springbootapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public Hello helloIndex() {
		return new Hello(1,"aaa"); 
	}
}
