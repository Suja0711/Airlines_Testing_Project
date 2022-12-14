package org.pages;

import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PageObjectManager extends BaseClass{
	
	private ManageLoginPage mp;
	private ManageCheckIn chk;
	private AboutMenuPage abp;
	private static PageObjectManager pomgr;
		
	private PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	public static PageObjectManager getPageManager() {
		if(pomgr == null)
		{
			pomgr = new PageObjectManager();
		}
		return pomgr;
	}
	
	public ManageLoginPage getLoginPage() {
		return mp==null?mp= new ManageLoginPage():mp;
	}
	
	public ManageCheckIn getManageCheckinPage() {
		return chk == null ? chk=ManageCheckIn.getManageCheckIn() : chk;
	}
	
	public AboutMenuPage getAboutMenuPage() {
		return abp == null ? abp=new AboutMenuPage() : abp;
	}
	
}
