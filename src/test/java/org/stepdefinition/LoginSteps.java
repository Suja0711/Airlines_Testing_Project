package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.ManageLoginPage;
import org.pages.PageObjectManager;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	ManageLoginPage mp; // = new ManageLoginPage(); // = PageObjectManager.getPageManager().getLoginPage();
	ManageLoginPage m1;
	
	@Given("The user should launch cebupacificair website")
	public void the_user_should_launch_cebupacificair_website() {
		mp = new ManageLoginPage();
		//mp = PageObjectManager.getPageManager().getLoginPage();
		/*if(mp.driver == null)
		{
			System.out.println("1Manageloginpage object returned null");
		}
		else {
			System.out.println("1Manageloginpage object not null");
		}*/
		
		browserLaunch("chrome");
		urlLaunch(url);
		maximize();
		implicitWait(10);
	}

	@When("Pop up window should be closed")
	public void pop_up_window_should_be_closed() {
		String closeBtnXpath = "(//a[contains(@class,'close')])[1]";
		String loginLnkXpath = "//a[contains(text(),'Log')]";
		String loginBtnXpath = "//button[contains(text(),'Log')]";
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeBtnXpath)));
		WebElement ele = driver.findElement(By.xpath(closeBtnXpath));
		ele.click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(loginLnkXpath)));
		WebElement loginLnk = driver.findElement(By.xpath(loginLnkXpath));
		WebElement loginBtn = driver.findElement(By.xpath(loginBtnXpath));
		as.moveToElement(loginLnk).click(loginBtn).perform();
	}
	
	@When("The user has to fill the email and password")
	public void the_user_has_to_fill_the_email_and_password() {
		System.out.println("When condition1 url - "+url);
		//m1 = new ManageLoginPage();
		m1 = PageObjectManager.getPageManager().getLoginPage();
		System.out.println("---"+m1.currentURL());
		String email = "Sujatha0711@gmail.com";
		String pass = "Varshini@0711";
		wt.until(ExpectedConditions.visibilityOf(m1.getEmailTxt()));//(By.xpath("//input[@type='email']")));
		sendKeys(m1.getEmailTxt(), email); 
		sendKeys(m1.getPassTxt(), pass);  
		/*clickBtn(m1.getSubmitBtn());
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(subLnkXpath)));
		WebElement subLnk1 = driver.findElement(By.xpath(subLnkXpath));
		clickBtn(subLnk1);*/
	}

	@When("The user has to click the Login button")
	public void the_user_has_to_click_the_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		clickBtn(m1.getSubmitBtn());
		System.out.println("When condition2");
	}

	@Then("The user should be in valid login page")
	public void the_user_should_be_in_valid_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String subLnkXpath = "//a[contains(text(),'Maybe')]";
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(subLnkXpath)));
		WebElement subLnk1 = driver.findElement(By.xpath(subLnkXpath));
		clickBtn(subLnk1);
		System.out.println("Then condition1");
	}
}
