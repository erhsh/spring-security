package com.erhsh.test.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {

	@RequestMapping(value = "hello")
	public String hello() {
		return "test";
	}

}
