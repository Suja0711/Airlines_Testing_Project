package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.ManageCheckIn;
import org.pages.PageObjectManager;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagemodSteps extends BaseClass{
	ManageCheckIn chkObj = PageObjectManager.getPageManager().getManageCheckinPage();
	//ManageCheckIn chkObj1 = PageObjectManager.getPageManager().getManageCheckinPage();
	//String url;
	Robot r ;
	@Given("The user has to click the Manage mod Checkin")
	public void the_user_has_to_click_the_Manage_mod_Checkin() {
		//chkObj = new ManageCheckIn();		
		System.out.println("Manage Module checkin ------------");
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getCheckEle()).perform();
	}

	@When("The user has to enter username {string} and password {string}")
	public void the_user_has_to_enter_username_and_password(String email, String pass) throws InterruptedException {
		wt.until(ExpectedConditions.visibilityOf(chkObj.getEmailChk()));
		sendKeys(chkObj.getEmailChk(), email); 
		sendKeys(chkObj.getPassChk(), pass);
		clickBtn(chkObj.getLoginChk());
	}
	

	@Then("Wait for the page to load")
	public void wait_for_the_page_to_load() throws InterruptedException {
	    Thread.sleep(1000);
	}
	
	@Then("Return to url {string}")
	public void return_to_url(String url) {
		//driver.navigate().to(url);
	}
	
	@Then("The user has to click Manage Booking link and redirect url {string}")
	public void the_user_has_to_click_Manage_Booking_link_and_redirect_url(String url) {
		driver.navigate().to(url);
	}
	
	//Scenario-------------------------------------------------------------------
	@When("The user has to click the Manage mod Booking")
	public void the_user_has_to_click_the_Manage_mod_Booking() throws AWTException, InterruptedException {
		System.out.println("The user has to click the Manage mod Booking ");
		//chkObj1 = new ManageCheckIn();
		r = new Robot();
		//wt.until(ExpectedConditions.visibilityOf(chkObj1.getMngBookEle()));
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngBookEle()).perform();
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[contains(text(),'Bookings & Boarding Pass')])[2]")));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	//Scenario-----------------------------------------------------------------------
	@When("The user enter origin and destination date for check status")
	public void the_user_enter_origin_and_destination_date_for_check_status() throws AWTException, InterruptedException {
		r = new Robot();
		//chkObj1 = new ManageCheckIn();
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getMngFltStatus()).perform();
		WebElement originInput = driver.findElement(By.id("originFormControl-0"));
		WebElement destInput = driver.findElement(By.id("'destinationFormControl-0"));
		WebElement travelDateimg = driver.findElement(By.xpath("//img[@class='dropdown-caret']"));
		WebElement statusBtn = driver.findElement(By.xpath("//button[contains(@class,'primary')]"));
		originInput.sendKeys("Beijing");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		destInput.sendKeys("Melbourne");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		travelDateimg.click();
		List<WebElement> travelDate = driver.findElements(By.xpath("(//li[contains(@class,'inserted')])/a"));
		travelDate.get(19).click();
		statusBtn.click();
		throw new ElementNotInteractableException("Exception at managemod");
	}

	
	@When("The user verify Add-ons features")
	public void the_user_verify_Add_ons_features() throws InterruptedException {
		//chkObj1 = new ManageCheckIn();
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getAddOnsLink()).perform();
		Thread.sleep(1000);
		WebElement addOnTxt = driver.findElement(By.partialLinkText("Read more"));
		addOnTxt.click();
	}
	
	@When("The user verify special assistance features")
	public void the_user_verify_special_assistance_features() throws AWTException {
	    //chkObj1 = new ManageCheckIn();
	    r = new Robot();
		as.moveToElement(chkObj.getMngLnk()).click(chkObj.getSpAssistLink()).perform();
		System.out.println("The user verify special assistance features");
		//wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[contains(@class,'inserted')])[9]")));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
