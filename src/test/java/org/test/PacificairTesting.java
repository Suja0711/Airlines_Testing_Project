package org.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.data.DataCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.EphemeralPortRangeDetector;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.ManageCheckIn;
import org.pages.ManageLoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utility.BaseClass;


public class PacificairTesting extends BaseClass{
	ManageLoginPage mg;
	ManageCheckIn chkObj;
	WebDriverWait wt;
	Actions as;
	
	@BeforeClass
	public void beforeClass() {
		//https://www.cebupacificair.com/
		System.out.println("Before class method");
		browserLaunch("chrome");
		urlLaunch("https://www.cebupacificair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		wt = new WebDriverWait(driver, 5000);
		mg = new ManageLoginPage();
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
	
	@Test(dataProvider="loginModule", dataProviderClass=DataCollection.class,priority=-4)
	private void loginMethod(String str1, String loginLnkXpath, String loginBtnXpath, String subLnkXpath, String email, String pass) {
		System.out.println("Login Method ------------");
		mg.clickLoginBtn(str1,loginLnkXpath,loginBtnXpath,subLnkXpath,email,pass);
	}
	
	@Test(dataProvider="chkInModule",dataProviderClass=DataCollection.class,priority=-3)
	private void manageChkModule(String chkInXpath, String email, String pass, String url) {
		chkObj = new ManageCheckIn();
		System.out.println("Manage Module checkin ------------");
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getCheckEle()).perform();
		//wt.until(ExpectedConditions.visibilityOf(chkObj.getEmailChk()));
		sendKeys(chkObj.getEmailChk(), email);
		sendKeys(chkObj.getPassChk(), pass);
		clickBtn(chkObj.getLoginChk());
		driver.navigate().to(url);
	}
	
	@Test(enabled=true,dataProvider="urlModule",dataProviderClass=DataCollection.class,priority=-2)
	private void manageBookModule(String url,String url1) throws InterruptedException {
		System.out.println("Manage Module Booking ------------");
		//wt.until(ExpectedConditions.visibilityOf(chkObj.getMngBookEle()));
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngBookEle()).perform();
		Thread.sleep(2000);
		driver.navigate().to(url);
	}
	
	@Test(enabled=true,dataProvider="urlModule",dataProviderClass=DataCollection.class,priority=-1)
	private void manageFlightStatus(String url,String url1) throws InterruptedException {
		System.out.println("Manage Module Flight Status ------------");
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngFltStatus()).perform();
		Thread.sleep(2000);
		driver.navigate().to(url);		
	}

}
