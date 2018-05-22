package com.mckinsey.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mckinsey.app.demo.service.DemoService;

@RestController
@RequestMapping(value="/api")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping(value="/test")
	public String hello() {
		
		return "Result from the test api is... " ;  
	}
	
	
	@RequestMapping(value="/ishappy")
	public String hello(@RequestParam("num") int num) {
		
		return "Here is the final result is..." + demoService.findSum(num);
	}
	

}
