
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


public WebElement getBtnflight() {
	return btnflight;
}


public WebElement getBtnbook() {
	return btnbook;
}
}
