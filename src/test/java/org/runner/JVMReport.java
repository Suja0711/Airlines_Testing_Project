package org.runner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

//import org.apache.poi.openxml4j.opc.Configuration;
import org.utility.BaseClass;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JVMReport extends BaseClass {
	
	public static void generateJVMReports(String jsonFile) {
		
		File reportFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReportsCustom");
		Configuration con = new Configuration(reportFile, "CebuAirportReport");
		con.addClassifications("Browsername", "Chrome");
		con.addClassifications("Browser Version", "108");
		con.addClassifications("Sprint", "12");
		con.addClassifications("QA Person", "Sujatha");
		
		List<String> jsonFileList = new LinkedList<String>();
		jsonFileList.add(jsonFile);
		
		ReportBuilder rb = new ReportBuilder(jsonFileList, con);
		rb.generateReports();
	}
	

}
