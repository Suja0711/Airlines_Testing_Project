package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ManageCheckIn extends BaseClass{
	public ManageCheckIn() {
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath="(//a[contains(text(),'Manage')])[2]")
	private WebElement mngBookEle;
	
	@FindBy(xpath="(//a[contains(text(),'Flight Status')])[1]")
	private WebElement mngFltStatus;
	
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
	
	public WebElement getMngFltStatus() {
		return mngFltStatus;
	}
}
