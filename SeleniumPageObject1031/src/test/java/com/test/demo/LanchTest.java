package com.test.demo;

import static org.junit.Assert.assertTrue;
import io.qameta.allure.Feature;

import org.testng.annotations.Test;

public class LanchTest {
	
	@Test
	@Feature("test001")
	public void test001(){
		 assertTrue( true );
		 System.out.println("test001");
		
	}
	@Test
	@Feature("test002")
	public void test002(){
		 assertTrue( true );
		 System.out.println("test002");
		
	}

}
