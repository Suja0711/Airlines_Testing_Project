package org.data;

import org.testng.annotations.DataProvider;

public class DataCollection {
	
	@DataProvider(name="urlModule")
	public Object[][] getAirlineUrl() {
		Object[][] AUrl = new Object[][] {
			{"https://www.cebupacificair.com/",""}
		};
		return AUrl;
	}
	
	@DataProvider(name="loginModule")
	public Object[][] getDataCol() {
		Object[][] mgMode = new Object[][] {
			{"(//a[contains(@class,'close')])[1]","//a[contains(text(),'Log')]","//button[contains(text(),'Log')]","//a[contains(text(),'Maybe')]","Sujatha0711@gmail.com","Varshini@0711"}
		};
		return mgMode;
	}
	
	@DataProvider(name="chkInModule")
	public Object[][] getCheckinModuleData(){
		Object[][] chkInData = new Object[][] {
			{"(//a[contains(text(),'Check')])[1]","Sujatha0711@gmail.com","Varshini@0711","https://www.cebupacificair.com/"}
		};
		return chkInData;
	}

}
