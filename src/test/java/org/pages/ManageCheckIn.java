package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ManageCheckIn extends BaseClass{
	private static ManageCheckIn mg;
	
	private ManageCheckIn() {
		PageFactory.initElements(driver, this);
	}
	
	public static ManageCheckIn getManageCheckIn() {
		if(mg == null)
		{
			mg = new ManageCheckIn();
		}
		return mg;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Check')])[1]")
	private WebElement checkEle;
	
	@FindBy(partialLinkText="Manage")
	private WebElement mngLnk;
	
	@FindBy(id="Email")
	private WebElement emailChk;
	
	@FindBy(id="Password")
	private WebElement passChk;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginChk;
	
	@FindBy(linkText="Manage Booking")
	private WebElement mngBookEle1;
	
	@FindBy(xpath="(//a[contains(text(),'Manage')])[2]")
	private WebElement mngBookEle;
	
	@FindBy(linkText="Past bookings")
	private WebElement mngPastBooking;
	
	@FindBy(xpath="(//a[contains(text(),'Flight Status')])[1]")
	private WebElement mngFltStatus;
	
	@FindBy(xpath="(//h4[@class='pointer-cursor'])[4]//descendant::img")
	private WebElement addOnsLink;
	
	@FindBy(xpath="(//h4[@class='pointer-cursor'])[5]//descendant::img")
	private WebElement spAssistLink;
	
	public WebElement getCheckEle() {
		return checkEle;
	}

	public WebElement getMngLnk() {
		return mngLnk;
	}

	public WebElement getEmailChk() {
		return emailChk;
	}

	public WebElement getPassChk() {
		return passChk;
	}

	public WebElement getLoginChk() {
		return loginChk;
	}

	public WebElement getMngBookEle() {
		return mngBookEle;
	}
	
	public WebElement getMngBookEle1() {
		return mngBookEle1;
	}
	
	public WebElement getmngPastBooking() {
		return mngPastBooking;
	}
	
	public WebElement getMngFltStatus() {
		return mngFltStatus;
	}
	
	public WebElement getAddOnsLink() {
		return addOnsLink;
	}
	
	public WebElement getSpAssistLink() {
		return spAssistLink;
	}
}
