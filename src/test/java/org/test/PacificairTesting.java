package org.test;


import java.util.List;

import org.data.DataCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.EphemeralPortRangeDetector;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.AboutMenuPage;
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
	AboutMenuPage ab;
	String url;
	@BeforeClass
	public void beforeClass() {
		//https://www.cebupacificair.com/
		System.out.println("Before class method");
		url = "https://www.cebupacificair.com/";
		browserLaunch("chrome");
		urlLaunch(url);
		maximize();
		implicitWait(10);
		wt = new WebDriverWait(driver, 5000);
		mg = new ManageLoginPage();
		as = new Actions(driver);
		ab = new AboutMenuPage();
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
	
	@Test(enabled=false,dataProvider="loginModule", dataProviderClass=DataCollection.class,priority=-4)
	private void loginMethod(String closeBtnXpath, String loginLnkXpath, String loginBtnXpath, String subLnkXpath, String email, String pass) {
		System.out.println("Login Method ------------");
		//mg.clickLoginBtn(closeBtnXpath,loginLnkXpath,loginBtnXpath,subLnkXpath,email,pass);
		mg.clickLoginBtnNoCredential(closeBtnXpath);
	}
	
	@Test(enabled=false,dataProvider="chkInModule",dataProviderClass=DataCollection.class,priority=-3)
	private void manageChkModule(String chkInXpath, String email, String pass, String url) {
		chkObj = ManageCheckIn.getManageCheckIn();
		System.out.println("Manage Module checkin ------------");
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getCheckEle()).perform();
		//wt.until(ExpectedConditions.visibilityOf(chkObj.getEmailChk()));
		sendKeys(chkObj.getEmailChk(), email);
		sendKeys(chkObj.getPassChk(), pass);
		clickBtn(chkObj.getLoginChk());
		driver.navigate().to(url);
	}
	
	@Test(enabled=false,dataProvider="urlModule",dataProviderClass=DataCollection.class,priority=-2)
	private void manageBookModule(String url,String url1) throws InterruptedException {
		System.out.println("Manage Module Booking ------------");
		//wt.until(ExpectedConditions.visibilityOf(chkObj.getMngBookEle()));
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngBookEle()).perform();
		Thread.sleep(2000);
		driver.navigate().to(url);
	}
	
	@Test(enabled=false,dataProvider="urlModule",dataProviderClass=DataCollection.class,priority=-1)
	private void manageFlightStatus(String url,String url1) throws InterruptedException {
		System.out.println("Manage Module Flight Status ------------");
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngFltStatus()).perform();
		Thread.sleep(2000);
		driver.navigate().to(url);		
	}
	
	@Test(enabled=true)
	private void abtMenu() throws InterruptedException {
		List<WebElement> tr = ab.getAbtMenu();
		for(int i=20; i<=25; i++)
		{
			moveToElement(ab.getAbtLnk()).click(tr.get(i)).perform();
			Thread.sleep(1000);
			driver.navigate().back();
			wt.until(ExpectedConditions.urlToBe(url));
			clickBtn(mg.getcloseBotBtn());
		}
	}
	
	@Test(enabled=false)
	private void travelInfo() {
		WebElement travelMenu = driver.findElement(By.xpath("(//a[contains(text(),'Travel Info')])[1]"));
		List<WebElement> tr = driver.findElements(By.xpath("//h4[contains(@class,'pointer')]/img"));
		System.out.println("size "+tr.size());
		for(int i=4; i<=9; i++) {
			System.out.println("troption - "+tr.get(i).getText().toString());
		}
		as.moveToElement(travelMenu).click(tr.get(4)).perform();
	}

}
