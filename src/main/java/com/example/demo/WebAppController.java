package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {

	@GetMapping("/hello")
	public String hello() {
		return "<h1 style=\"color: hotpink; font-size: 40px; font: cursive;\">Hello, World </h1>";
	} 
	@GetMapping("/home")
	public String hello() {
		return "<h1 style=\"color: hotpink; font-size: 40px; font: cursive;\">Hello, this is surya kant kumar </h1>";
	} 
}
