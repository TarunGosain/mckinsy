package com.mckinsey.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mckinsey.app.demo.service.DemoService;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//new DemoApplication().test(1);
	}
	
//	//delete after testing
//	void test(int num) {
//		DemoService demoService = new DemoService();
//		
//		boolean result = false;
//		
//		try{
//			result = demoService.findSum(num);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("here is the final result..  " + result);
//	}
}
