package org.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseClass;

public class ManageLoginPage extends BaseClass{

	public ManageLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailTxt;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passTxt;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//a[text()='Manage']")
	private WebElement Managemenu;
	
	@FindBy(partialLinkText="Check")
	private WebElement checkInLink;
	
	/*@FindBy(xpath="//a[@class='close-button']")
	private WebElement closeBtn;*/
	
	public WebElement getEmailTxt() {
		return emailTxt;
	}
	
	public WebElement getPassTxt() {
		return passTxt;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getManagemenu() {
		return Managemenu;
	}

	public WebElement getCheckInLink() {
		return checkInLink;
	}

/*	public WebElement getCloseBtn() {
		return closeBtn;
	}*/
	
	public static void main(String[] args) {
		System.out.println("Manage page in Cebupacificair website");
	}
	
	public void clickClostBtn() {
		//List<WebElement> closebtnlist = driver.findElements(By.xpath("//a[contains(@class,'close')]"));
		List<WebElement> closebtnlist = driver.findElements(By.xpath("//img[@alt='close']"));
		if(closebtnlist.size()>0)
		{
			System.out.println("Close button exist");
			closebtnlist.get(0).click();
		}	
	}
		
		public void clickLoginBtn(String closeBtnXpath,String loginLnkXpath,String loginBtnXpath,String subLnkXpath,String email, String pass) {
			Actions as = new Actions(driver);
			WebDriverWait wt = new WebDriverWait(driver, 5000);
			//wt.until(ExpectedConditions.elementToBeClickable(By.xpath(closeBtnXpath)));
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeBtnXpath)));
			WebElement ele = driver.findElement(By.xpath(closeBtnXpath));
			ele.click();
			wt.until(ExpectedConditions.elementToBeClickable(By.xpath(loginLnkXpath)));
			WebElement loginLnk = driver.findElement(By.xpath(loginLnkXpath));
			WebElement loginBtn = driver.findElement(By.xpath(loginBtnXpath));
			as.moveToElement(loginLnk).click(loginBtn).perform();
			wt.until(ExpectedConditions.visibilityOf(emailTxt));//(By.xpath("//input[@type='email']")));
			sendKeys(emailTxt, email); 
			sendKeys(passTxt, pass);  
			clickBtn(submitBtn);
			//wt.until(ExpectedConditions.invisibilityOf(submitBtn));			
			wt.until(ExpectedConditions.elementToBeClickable(By.xpath(subLnkXpath)));
			WebElement subLnk1 = driver.findElement(By.xpath(subLnkXpath));
			clickBtn(subLnk1);
		}
		
		
}
