package com.pack.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/message")
	public String getMessage(){
		return "Welcome Praful in PCF ...!!!";
	}
}
