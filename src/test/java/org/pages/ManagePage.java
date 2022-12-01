package org.pages;

import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ManagePage extends BaseClass{

	public ManagePage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) {
		System.out.println("Manage page in Cebupacificair website");
	}
}
