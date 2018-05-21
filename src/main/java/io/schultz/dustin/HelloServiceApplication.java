package io.schultz.dustin;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.QueryParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="/api")
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
		findSum(28);
	}
	
	@RequestMapping(value="/test")
	public String hello() {
		
		boolean sum = findSum(12);
		return "test api=========================" + sum; 
	}
	
	
	@RequestMapping(value="/ishappy", method = RequestMethod.GET)
	public String hello(@QueryParam("num") Integer num) {
		
		return "Here is the final result" + findSum(num);
	}
	
	
	private static boolean findSum(Integer num){
		
		Set<Integer> allNumbers = new HashSet<Integer>();
		int sum=0;
		
		
		sum = squareSum(num);
		
		if(sum==1) {
			return true;
		}
				
		if(allNumbers.contains(sum)) {
			return false;
		}
		
		allNumbers.add(sum);
		return findSum(sum);
		
	}
	
	
	private static Integer squareSum(Integer num){
		
		int rem=0;
		int sum=0;
		while(num != 0) {
			rem=num%10;
			sum=sum + (rem*rem);
			num=num/10;
		}
		
		return sum;
		
	}
}
