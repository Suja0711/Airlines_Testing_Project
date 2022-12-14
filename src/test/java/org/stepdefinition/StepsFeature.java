package org.stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pages.AboutMenuPage;
import org.pages.ManageCheckIn;
import org.pages.PageObjectManager;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsFeature extends BaseClass{
	AboutMenuPage ab = PageObjectManager.getPageManager().getAboutMenuPage();
			//new AboutMenuPage(); -- implemented singleton pattern
	
	@Given("The user has to click the About menu Our Story")
	public void the_user_has_to_click_the_About_menu_Our_Story() {
		as.moveToElement(ab.getAbtLnk()).click(ab.getOurStoryEle()).perform();
		System.out.println("Manage Module checkin ------------");
	}
		
	@Given("The user has to click the About menu Media Center")
	public void the_user_has_to_click_the_About_menu_Media_Center() {
		as.moveToElement(ab.getAbtLnk()).click(ab.getMediaCtr()).perform();
	}
	
	@Given("The user has to click the About menu Talk to Us")
	public void the_user_has_to_click_the_About_menu_Talk_to_Us() throws InterruptedException {
		as.moveToElement(ab.getAbtLnk()).click(ab.getTalkToUsEle()).perform();
		/*Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.linkText("Advertise with Us"));
		element1.click();
		clickBtn(ab.getadvertiseEle());
		as.click(ab.getadvertiseEle()).perform();*/		
	}

	@Given("The user has to click the About menu Campaigns & Partners")
	public void the_user_has_to_click_the_About_menu_Campaigns_Partners() {
		as.moveToElement(ab.getAbtLnk()).click(ab.getCampPtnr()).perform();
	}

	@Given("The user has to click the About menu Company Information")
	public void the_user_has_to_click_the_About_menu_Company_Information() {
		as.moveToElement(ab.getAbtLnk()).click(ab.getCmpInfo()).perform();
	}

	@Given("The user has to click the About menu Careers")
	public void the_user_has_to_click_the_About_menu_Careers() {
		as.moveToElement(ab.getAbtLnk()).click(ab.getCareer()).perform();
	}
	
	/*@BeforeClass
	public void browserStackMethod() throws MalformedURLException {
		public static final String AUTOMATE_USERNAME="sujathap_rCcT5N";
		public static final String AUTOMATE_ACCESSKEY="2XfowyFGcszC43eRfkeK";
		public static final String URLAutomate = "https://"+AUTOMATE_USERNAME+":"+AUTOMATE_ACCESSKEY
				+"@hub-cloud.broswerstack.com/wd/hub";
		System.out.println("--> browserStackMethod");
		MutableCapabilities cap = new MutableCapabilities();
		cap.setCapability("browserName", "Chorme");
		cap.setCapability("browserVersion", "latest");
		HashMap<String, Object> browserStackOption = new HashMap<String, Object>();
		browserStackOption.put("os", "Windows");
		browserStackOption.put("osVersion", "11");
		browserStackOption.put("projectName", "CebuAirPacific.com");
		browserStackOption.put("buildName", "First Build");
		browserStackOption.put("local", "false");
		browserStackOption.put("seleniumVersion", "3.141.59");
		cap.setCapability("bstack:options",browserStackOption);
		driver = new RemoteWebDriver(new URL(URLAutomate), cap);
		driver.get(url);
	}*/

}
