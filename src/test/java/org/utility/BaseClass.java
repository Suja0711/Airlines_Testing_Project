package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//time
	public static void implicitWait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	//send data
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	//click
	public static void clickBtn(WebElement e) {
		e.click();
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//current url
	public static String currentURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	//title
	public static String title() {
		String t = driver.getTitle();
		return t;
	}
	//getattribute
	public static String getAttribute(WebElement e) {
		String attr = e.getAttribute("value");
		return attr;
	}
	//move to element
	public static void moveToElement(WebElement target) {
		Actions as = new Actions(driver);
		as.moveToElement(target);
	}
	//drag and drop
	public static void dragAndDrop(WebElement src, WebElement target) {
		Actions as = new Actions(driver);
		as.dragAndDrop(src, target);
	}
	//select by Index
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	//select by value
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}
	//select by visibletext
	public static void selectByVisibletext(WebElement e, String txt) {
		Select s = new Select(e);
		s.selectByVisibleText(txt);
	}
	//driver findElements xpath
	public static List<WebElement> findListElementsXPath(String xpath){
		List<WebElement> webList = driver.findElements(By.xpath(xpath));
		return webList;
	}
	//driver findElement xpath
	public static WebElement findElementXpath(String xpath)
	{
		WebElement e = driver.findElement(By.xpath(xpath));
		return e;
	}
	//driver windowHandle
	public static String getWindowHandle() {
		String window = driver.getWindowHandle();
		return window;
	}
	//driver windowHandle Set
	public static Set<String> getWindowHandleSet(){
		Set<String> whSet = driver.getWindowHandles();
		return whSet;
	}
	//Action rightclick
	public static void rightClick(WebElement e) {
		Actions as = new Actions(driver);
		as.contextClick(e).perform();
	}
	//Action doubleClick
	public static void doubleClick(WebElement e) {
		Actions as = new Actions(driver);
		as.doubleClick(e).perform();
	}
	//Robot keyevent
	public static void KeyPressRelease(String code) throws AWTException {
		Robot r = new Robot();
		if(code.equalsIgnoreCase("down"))
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if(code.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		else if(code.equalsIgnoreCase(code)) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	//driver switchto Frames
	public static void switchFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchFrame(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void switchFrame(WebElement e) {
		driver.switchTo().frame(e);
	}
	public static void switchParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static void exitFrames() {
		driver.switchTo().defaultContent();
	}
	//driver switchto Window
	public static void switchWindow(String windowname) {
		driver.switchTo().window(windowname);
	}
	//Alert accept
	public static String alertAccept() {
		Alert as = driver.switchTo().alert();
		String alertText = as.getText();
		as.accept();
		return alertText;		
	}
	//Alert reject
	public static String alertReject() {
		Alert as = driver.switchTo().alert();
		String alertText = as.getText();
		as.dismiss();
		return alertText;
	}
	//Taking screenshot
	public static void screenShotCapture(String filename) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File from = tk.getScreenshotAs(OutputType.FILE);
		File to = new File(System.getProperty("user.dir")+"\\"+filename+"_"+new Date().getTime()+".jpg");
		FileUtils.copyFile(from, to);
	}
	
}
