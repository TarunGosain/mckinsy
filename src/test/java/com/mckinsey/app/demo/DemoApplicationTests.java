package com.mckinsey.app.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mckinsey.app.demo.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	DemoService demoService;

	@Test
	public void testFindSumTest28() {
		Assert.assertTrue(demoService.findSum(28));
	}
	
	@Test
	public void testFindSumTest12() {
		Assert.assertFalse(demoService.findSum(12));
	}
	
	@Test
	public void testFindSumTest0() {
		Assert.assertFalse(demoService.findSum(0));
	}
	
	@Test
	public void testFindSumTest1() {
		Assert.assertTrue(demoService.findSum(1));
	}

}
