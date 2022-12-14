package org.test;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Travel extends BaseClass{
	WebDriverWait wt;
	Actions as;
	@BeforeClass
	public void beforeClass() {
		//https://www.cebupacificair.com/
		System.out.println("Before class method");
		browserLaunch("chrome");
		urlLaunch("https://www.cebupacificair.com/");
		maximize();
		implicitWait(10);
		wt = new WebDriverWait(driver, 5000);
		as = new Actions(driver);
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
	private void afterMethod() throws InterruptedException {
		System.out.println("After method");
	}
	
	@Test
	private void travelInfo() {
		//List<WebElement> tr = driver.findElements(By.xpath("//h4[contains(@class,'pointer-cursor')]"));
		wt.until(ExpectedConditions.elementToBeClickable(By.tagName("h4")));
		List<WebElement> tr = driver.findElements(By.tagName("h4"));
		WebElement trOption;
		for(int i=6; i<=11; i++) {
			//trOption = tr.get(i);
			System.out.println("troption - "+tr.get(i).getText().toString());
			//trOption.click();
		}
		
		tr.get(6).click();
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		MutableCapabilities cap = new MutableCapabilities();
		cap.setCapability("browserName", "Chorme");
		cap.setCapability("browserVersion", "latest");
		HashMap<String, Object> browserStackOption = new HashMap<String, Object>();
		browserStackOption.put("os", "Windows");
		browserStackOption.put("osVersion", "11");
		browserStackOption.put("projectName", "CebuAirPacific.com");
		browserStackOption.put("buildName", "First Build");
		browserStackOption.put("local", "false");
		browserStackOption.put("seleniumVersion", "3.141.59");
		cap.setCapability("bstack:options",browserStackOption);
		driver.get(url);
		
	}
}
