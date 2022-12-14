package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", 
				glue="org.stepdefinition",
				dryRun=false,
				/*plugin= {"pretty","html:src\\test\\resources\\Reports\\HtmlReports",
						"json:src\\test\\resources\\Reports\\JsonReports\\report.json",
						"rerun:src\\test\\resources\\Reports\\FailedScenario\\FailedcaseReport.txt"
						},*/
				tags= {"@Loginfn", "@manageCheckin"}
				)
public class TestRunner {	

	/*@AfterClass
	public static void genReports() {
		JVMReport.generateJVMReports("src\\test\\resources\\Reports\\JsonReports\\report.json");
	}*/
}

/*import io.cucumber.junit.CucumberOptions.SnippetType;

plugin= {"pretty",
		"html:src\\test\\resources\\Reports\\HtmlReports",
		"json:src\\test\\resources\\Reports\\JsonReports\\report.json",
		"junit:src\\test\\resources\\Reports\\JunitReports\\junitReport.xml",
		"rerun:src\\test\\resources\\Reports\\FailedScenario\\FailedcaseReport.txt"
		"usage:usageReport.txt"
		

@CucumberOptions(features="src/test/resources", 
glue="org.stepdefinition",
dryRun=true,
plugin= {"pretty","html:src\\test\\resources\\Reports\\HtmlReports",
		"json:src\\test\\resources\\Reports\\JsonReports\\report.json",
		"rerun:src\\test\\resources\\Reports\\FailedScenario\\FailedcaseReport.txt"
		},
tags= {"@Loginfn", "@AboutMenu"},
strict=true,  ---This is to set the step as failed when the snippet to be generated 
stict=false, --By default false, this will skip the step and generate code not failed
snippets=SnippetType.UNDERSCORE -- To generate code snippet in underscore type
snippets=SnippetType.CAMELCASE -- To generate code snippet in camel case
)*/