package com.mckinsey.app.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	Set<Integer> allNumbers = new HashSet<Integer>();
	int sum;
	
	public boolean findSum(Integer num) {

		System.out.println("into method findSum");
		
		sum = squareSum(num);

		if (sum == 1) {
			return true;
		}

		if (allNumbers.contains(sum)) {
			return false;
		}

		allNumbers.add(sum);
		return findSum(sum);

	}

	private Integer squareSum(Integer num) {
		
		System.out.println("into method squareSum");

		int rem = 0;
		int sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}

		return sum;

	}

}
