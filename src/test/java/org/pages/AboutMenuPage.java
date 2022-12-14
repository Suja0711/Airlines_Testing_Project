package org.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AboutMenuPage extends BaseClass{
	
	public AboutMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="About")
	private WebElement abtLnk;
	
	@FindBy(xpath="//h4[contains(@class,'pointer')]")
	private List<WebElement> abtMenu_old;
	
	@FindBy(xpath="//h4[text()=' Our Story']")
	private WebElement ourStoryEle;
	
	@FindBy(xpath="//h4[text()=' Media Center']")
	private WebElement mediaCtr;
	
	@FindBy(xpath="//h4[text()=' Talk to Us']")
	private WebElement talkToUsEle;
	
	@FindBy(linkText="Advertise with Us")
	private WebElement advertiseEle;
	
	@FindBy(xpath="//h4[text()=' Campaigns & Partners']")
	private WebElement campPtnr;
	
	@FindBy(xpath="//h4[text()=' Company Information']")
	private WebElement cmpInfo;
	
	@FindBy(xpath="//h4[text()=' Careers']")
	private WebElement career;
	
	public List<WebElement> getAbtMenu_old() {
		return abtMenu_old;
	}

	public WebElement getTalkToUsEle() {
		return talkToUsEle;
	}

	public WebElement getCampPtnr() {
		return campPtnr;
	}

	public WebElement getCmpInfo() {
		return cmpInfo;
	}

	public WebElement getCareer() {
		return career;
	}

	public WebElement getAbtLnk() {
		return abtLnk;
	}

	public List<WebElement> getAbtMenu() {
		return abtMenu_old;
	}
	
	public WebElement getOurStoryEle() {
		return ourStoryEle;
	}
	
	public WebElement getMediaCtr() {
		return mediaCtr;
	}
	
	public WebElement getadvertiseEle() {
		return advertiseEle;
	}
}
