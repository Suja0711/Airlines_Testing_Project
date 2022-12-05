package org.test;

import org.openqa.selenium.interactions.Actions;

import org.pages.BookingPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;



public class PacificairTesting extends BaseClass {
	static BookingPage bk;
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before class method");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After method");
	}
	
	@Test(enabled=true)
	private void Book1() {
		
	}

}
