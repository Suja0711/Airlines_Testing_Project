
	package org.pages;


	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	import org.utility.BaseClass;

	public class BookingPage extends BaseClass{

		public BookingPage() {
			PageFactory.initElements(driver, this);
		}
		
@FindBy(xpath="//a[@class='ng-tns-c3-5']")
private WebElement btnbook;

@FindBy(xpath="//a[@class='ng-tns-c9-6']")
private WebElement btnflight;


@FindBy(xpath="//div[@class='o-form_input marker pin']")
private WebElement from;



public WebElement getFrom() {
	return from;
}


public WebElement getBtnflight() {
	return btnflight;
}


public WebElement getBtnbook() {
	return btnbook;
}
}
