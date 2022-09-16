package com.project.adactin;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	// browserLaunch
	public static WebDriver browserLaunch(String value) {

		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (value.equalsIgnoreCase("gecko")) {

		} else {
			System.out.println("Invalid Driver");
		}
		driver.manage().window().maximize();
		return driver;
	}

	// getUrl
	public static void getUrl(String value) {
		driver.get(value);
	}

	// sendKeys
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	// click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// clear
	public static void eraseAll(WebElement element) {
		element.clear();

	}

	// getText
	public static void getElementText(WebElement element, String value) {
		String text = element.getText();
		System.out.println(value + text);
	}

	// getAttribute
	public static void getAttri(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println("Attribute Value of Selected Element is: " + attribute);
	}

	// isEnabled
	public static void isEnabled(WebElement element) {
		boolean isEnabled = element.isEnabled();
		System.out.println(isEnabled);
	}

	// isDisplayed
	public static void isDisplayed(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		System.out.println(isDisplayed);
	}

	// isSelected
	public static void isSelected(WebElement element) {
		boolean isSelected = element.isSelected();
		System.out.println(isSelected);
	}

	// close
	public static void close() {
		driver.close();

	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// navigate to
	public static void navigateTo(String option, String value) {
		if (option.equalsIgnoreCase("to")) {
			driver.navigate().to(value);
			
		}
		else {
			System.out.println("Invalid Navigation Method");
		}
	}
		
		
	public static void navigate(String value) {
		 if (value.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (value.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (value.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else {
			System.out.println("Invalid Navigation Method");
		}
	}

	// get Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("WebSite Title is: " + title);
	}

	// get Current Url
	public static void currentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Driver Current URL is: " + url);
	}

	// wait
	public static void implicitWait(String value) {
		int a = Integer.parseInt(value);
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	// sleep
	public static void sleep(String value) throws InterruptedException {
		int a = Integer.parseInt(value);
		Thread.sleep(a);
	}

	// select
	public static void select(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("value")) {
			int a = Integer.parseInt(value);
			s.selectByIndex(a);
		} else {
			System.out.println("Invalid Selection Method");
		}

	}

	// Deselect
	public static void deSelect(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		} else if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (option.equalsIgnoreCase("index")) {
			int a = Integer.parseInt(value);
			s.deselectByIndex(a);
		} else {
			System.out.println("Invalid Selection Method");
		}

	}

	// isMultiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean b = s.isMultiple();
		System.out.println("The selected Element is Multipe: " + b);
	}

	// getOptions
	public static void getOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement text : options) {
			System.out.println(text.getText());
		}
	}

	// getAllSelected
	public static void getAllSelected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement text : options) {
			System.out.println(text.getText());
		}
	}

	// getFirstSelected
	public static void getFirstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement options = s.getFirstSelectedOption();
		System.out.println(options);
	}
	
	//Takes Screenshot
	public static void screenShot(String value) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(value);
		FileUtils.copyFile(src, des);
	}

}
