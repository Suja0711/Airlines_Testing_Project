package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{

	@Before("not @Loginfn")
	public void beoreMethod1()
	{
		System.out.println("Before method1");
		
	}
	
	//@After("not @Loginfn")
	//@After(value="not @Loginfn",order=1)
	@After
	public void afterMethod1(Scenario sc) {
		System.out.println("After Method1-----url");
		//driver.navigate().to(url);
		/*if(sc.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		System.out.println("Scenario name - "+sc.getName());
		byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(bt, "image/png");}*/
		driver.navigate().to(url);
	}
	
	
}
